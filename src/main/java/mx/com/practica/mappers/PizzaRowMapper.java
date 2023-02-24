package mx.com.practica.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.springframework.jdbc.core.RowMapper;

import mx.com.practica.modelos.Pizza;
import mx.com.practica.modelos.Sabor;
import mx.com.practica.modelos.Tamano;

public class PizzaRowMapper implements RowMapper<Pizza>{
	
	private static final Logger LOGGER = Logger.getLogger("mx.com.practica.mappers");
	
	public Pizza mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Pizza pizza = new Pizza();
		
		try {
			pizza.setIdPizza(rs.getInt(1));
			pizza.setSabor(Sabor.valueOf(rs.getString(2)));
			pizza.setPrecio(rs.getInt(3));
			pizza.setTamano(Tamano.valueOf(rs.getString(4)));
			
			LOGGER.info(pizza.toString());
				
		}catch(IllegalArgumentException e) {
			
			LOGGER.info("ERROR - INCONSISTENCIAS EN LOS DATOS DE ESTA PIZZA");
			
			pizza = new Pizza(Sabor.indefinido, 0, Tamano.indefinido, rowNum+1);
		}
		
		LOGGER.info("ok - " + pizza);
		
		return pizza;
	}

}

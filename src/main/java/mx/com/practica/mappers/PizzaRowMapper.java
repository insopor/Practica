package mx.com.practica.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.practica.modelos.Pizza;
import mx.com.practica.modelos.Sabor;
import mx.com.practica.modelos.Tamano;

public class PizzaRowMapper implements RowMapper<Pizza>{
	
	
	public Pizza mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Pizza pizza = new Pizza();
		
		try {
			pizza.setIdPizza(rs.getInt(1));
			pizza.setSabor(Sabor.valueOf(rs.getString(2)));
			pizza.setPrecio(rs.getInt(3));
			pizza.setTamano(Tamano.valueOf(rs.getString(4)));
			
			System.out.println(pizza.toString());
				
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return pizza;
	}

}

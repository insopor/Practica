package mx.com.practica.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.practica.mappers.PizzaRowMapper;
import mx.com.practica.modelos.Pizza;

@Repository
public class UsuarioDao implements IUsuarioDao{
	
    @Autowired
    JdbcTemplate jdbcTemplate;
	
    
    
	public List<Pizza> getAllPizzas(){
		
		String query = "SELECT * FROM CATAPIZZA";
		
		return jdbcTemplate.query(query, new PizzaRowMapper());

	}
	
}

package mx.com.practica.dao;

import java.util.List;

import mx.com.practica.modelos.Pizza;

public interface IUsuarioDao {
	
	public List<Pizza> getAllPizzas();
	
	public int insertPizza(Pizza pizza);

}

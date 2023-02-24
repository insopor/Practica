package mx.com.practica.dao;

import java.util.ArrayList;
import java.util.List;

import mx.com.practica.modelos.Pizza;
import mx.com.practica.modelos.Sabor;
import mx.com.practica.modelos.Tamano;

public interface IUsuarioDao {
	
	public List<Pizza> getAllPizzas();
	
	public int insertPizza(Pizza pizza);

}

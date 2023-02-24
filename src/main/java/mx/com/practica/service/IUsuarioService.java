package mx.com.practica.service;

import java.util.List;

import mx.com.practica.modelos.Pizza;

public interface IUsuarioService {
	
	public List<Pizza> getPizzas(List<Pizza> pizza);
	
	public List<Pizza> getAllPizzas();

}

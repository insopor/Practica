package mx.com.practica.service;

import java.util.List;

import mx.com.practica.modelos.Pizza;
import mx.com.practica.modelos.Response;

public interface IUsuarioService {
	
	public List<Pizza> getPizzas(List<Pizza> pizza);
	
	public Response<List<Pizza>>  getAllPizzas();

}

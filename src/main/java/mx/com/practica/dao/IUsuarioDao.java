package mx.com.practica.dao;

import java.util.ArrayList;
import java.util.List;

import mx.com.practica.modelos.Pizza;
import mx.com.practica.modelos.Sabor;
import mx.com.practica.modelos.Tamano;

public interface IUsuarioDao {
	
	/*
	default List<Pizza> getAllPizzas(){
		List<Pizza> todasPizzas = new ArrayList<>();
		todasPizzas.add(new Pizza(Sabor.hawayana, 90, Tamano.grande));
		return todasPizzas;
	}*/
	
	public List<Pizza> getAllPizzas();

}

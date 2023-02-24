package mx.com.practica.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.practica.dao.UsuarioDao;
import mx.com.practica.modelos.Pizza;


@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	UsuarioDao ud;
	
	@Override
	public List<Pizza> getPizzas(List<Pizza> pizza){
		
		List<Pizza> listaPizzas = new ArrayList<>();
		listaPizzas.addAll(pizza);
		
		return listaPizzas;
	}
	
	@Override
	public List<Pizza> getAllPizzas() {
		// TODO Auto-generated method stub
		
		return ud.getAllPizzas();
	}

}

package mx.com.practica.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.practica.dao.UsuarioDao;
import mx.com.practica.modelos.Pizza;
import mx.com.practica.modelos.Response;


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
	public Response<List<Pizza>> getAllPizzas() {
		
		Response<List<Pizza>> r = new Response<List<Pizza>>();
		r.setCodError(0);
		r.setMensaje("Se consultaron todas las pizzas");
		r.setRespuesta(ud.getAllPizzas());
		
		return r;
	}
	
	public Response<Integer> insertPizzasDao(Pizza pizza) {
		
		Integer respuesta = ud.insertPizza(pizza);
		
		Response<Integer> r = new Response<Integer>();
		
		if(respuesta == 0) {
			r.setCodError(0);
			r.setMensaje("La pizza se inserto correctamente");
			r.setRespuesta(respuesta);
		}else {
			r.setCodError(1);
			r.setMensaje("La pizza no se inserto correctamente");
			r.setRespuesta(respuesta);
		}
		
		
		return r;
	}

}

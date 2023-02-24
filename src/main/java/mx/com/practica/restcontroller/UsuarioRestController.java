package mx.com.practica.restcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.practica.modelos.Pizza;
import mx.com.practica.modelos.Result;
import mx.com.practica.modelos.Sabor;
import mx.com.practica.service.UsuarioService;


@RestController
@RequestMapping("/familia")
public class UsuarioRestController {
	
	private static final Logger LOGGER = Logger.getLogger("mx.com.practica.restcontroller");
	
	@Autowired
	UsuarioService us;

	
	@GetMapping("/metodo")
	public String miMetodo() {
		return "Hola Mundo";
	}
	@GetMapping("/metodoAndrea")
	public String miMetodoNombreUmo() {
		return "Hola Andrea";
	}
	@GetMapping("/metodoLuis")
	public String miMetodoNombreDos() {
		return "Hola Luis";
	}
	@GetMapping("/metodoAna")
	public String miMetodoNombreTres() {
		return "Hola Ana";
	}
	
	@GetMapping("/integranteNom")
	public String nombre (@RequestParam String nombre) {
		return "Hola " + nombre;
	}

	@GetMapping("/integranteNomEdad")
	public String NomEdad (@RequestParam String nombre, @RequestParam int edad) {
		return "Hola, mi nombre es: " + nombre + " y mi edad es: " + edad;
	}
	
	@PostMapping("/pizza")
	public String a(@RequestBody Pizza pizza) {
		
		return "Se ingreso la pizza con exito";
	}
	
	@PostMapping("/pizzaResult")
	public Result pizzaResult(@RequestBody Pizza pizza) {
		Result result = new Result();
		
		if (pizza.getSabor().equals(Sabor.hawayana)) {
		
			result.setCodError("1");
			result.setDescError("operacion exitosa");
			
		}else {
			
			result.setCodError("0");
			result.setDescError("la pizza no existe");
			
		}
		
		resultado(result); 
		
		return result;
	}
	
	@PostMapping("/pizzaLista")
	public List<Pizza> pizzaLista(@RequestBody List<Pizza> listaPizza){
		
		return listaPizza;
	}
	
	@PostMapping("/pizzaService")
	public List<Pizza> pizzaService(@RequestBody List<Pizza> pizza) {
		
		LOGGER.info(pizza.toString());
		
		return us.getPizzas(pizza);
		
	}
	
	@GetMapping("/getPizzasDao")
	public List<Pizza> getPizzasDao() {
		
		
		return us.getAllPizzas();
		
	}
	
	
	public Result resultado(Result result) {
		
		result.setCodError(result.getCodError());
		result.setDescError(result.getDescError());
		
		LOGGER.info(result.getCodError() + " - " + result.getDescError());
		
		return result;
	}
	
}

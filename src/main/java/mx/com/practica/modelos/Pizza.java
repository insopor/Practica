package mx.com.practica.modelos;

public class Pizza {
	
	private Sabor sabor;
	private Integer precio;
	private Tamano tamano;
	private int idPizza;
	
	public Pizza() {
		super();
	}
	
	//la inyeccion por constructor es la mejor practica
	//es preferible usar a que autowired
	public Pizza(Sabor sabor, Integer precio, Tamano tamano, int idPizza) {
		this.sabor = sabor;
		this.precio = precio;
		this.tamano = tamano;
		this.idPizza = idPizza;
	}
	
	public Sabor getSabor() {
		return sabor;
	}
	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public Tamano getTamano() {
		return tamano;
	}
	public void setTamano(Tamano tamano) {
		this.tamano = tamano;
	}
	public int getIdPizza() {
		return idPizza;
	}
	public void setIdPizza(int idPizza) {
		this.idPizza = idPizza;
	}

	@Override
	public String toString() {
		return "Pizza [sabor=" + sabor + ", precio=" + precio + ", tamano=" + tamano + ", idPizza=" + idPizza + "]";
	}

	
	
	
	

}

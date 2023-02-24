package mx.com.practica.modelos;

public class Response<T> {

	private String mensaje;
	private int codError;
	private T respuesta;
	
	public Response() {
		super();
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getCodError() {
		return codError;
	}

	public void setCodError(int codError) {
		this.codError = codError;
	}

	public T getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(T respuesta) {
		this.respuesta = respuesta;
	}
	
	
	
	
	
}

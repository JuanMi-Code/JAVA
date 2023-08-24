package venancio.daw.tema8.ejercicio3;

public class Amigo {

	private String nombre;
	private String apodo;
	
	public Amigo(String nombre, String apodo) {
		this.nombre = nombre;
		this.apodo = apodo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	@Override
	public String toString() {
		return "Amigo [nombre=" + nombre + ", Apodo=" + apodo + "]";
	}
	
	
}

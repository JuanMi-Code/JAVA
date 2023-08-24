package Ejercicios1;

import java.util.Objects;

public class Ejercicio3_Persona {

	private String nombre;
	private String direccion;
	
	
	public Ejercicio3_Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(direccion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejercicio3_Persona other = (Ejercicio3_Persona) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(nombre, other.nombre);
	}



	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return "nombre:" + this.nombre + " | direccion: " + this.direccion;
	}
}
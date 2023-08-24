package prueba;

import java.util.Objects;

public class Fruta {

	private double peso;
	private double precio;
	private String nombre;
	
	
	public Fruta(double peso, double precio, String nombre) {
		this.peso = peso;
		this.precio = precio;
		this.nombre = nombre;
	}
	
	
	public double getPeso() {
		return peso;
	}
	public double getPrecio() {
		return precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "\nFruta: "+nombre+"\nPeso: "+peso+" Kg\nPrecio: "+precio+" €";
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, peso, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruta other = (Fruta) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}	
}

package com.venancio.daw.examen;

//public class Primevideo extends Cuenta{
public class Primevideo extends Cuenta{

	private String correo;
	private int costeServicio = 3;
	
	//Constructor para la cuenta de Prime Video
	public Primevideo(String nombre, String apodo, boolean siTitular, String numeroCuenta, int diaAlta, int mesAlta,
			int anoAlta, String correo) {
		super(nombre, apodo, siTitular, numeroCuenta, diaAlta, mesAlta, anoAlta);
		this.correo = correo;
	}

	//Geters y Seters
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getCosteServicio() {
		return costeServicio;
	}
	public void setCosteServicio(int costeServicio) {
		this.costeServicio = costeServicio;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\nCUENTA DE PRIME VIDEO \nCuenta de Amazon asociada: " + correo + "\nCoste del Servicio: " + costeServicio;
	}
	
	
	
	
	
}

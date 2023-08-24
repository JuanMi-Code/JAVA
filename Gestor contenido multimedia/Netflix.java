package com.venancio.daw.examen;

public class Netflix extends Cuenta{

	private String pais;
	private double costeServicio = 15.99;
	
	//Constructor para la cuenta Netflix
	public Netflix(String nombre, String apodo, boolean siTitular, String numeroCuenta, int diaAlta, int mesAlta,
			int anoAlta, String pais) {
		super(nombre, apodo, siTitular, numeroCuenta, diaAlta, mesAlta, anoAlta);
		this.pais = pais;
	}


	//Geters y Seters
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getCosteServicio() {
		return costeServicio;
	}
	public void setCosteServicio(double costeServicio) {
		this.costeServicio = costeServicio;
	}


	@Override
	public String toString() {
		return super.toString() + "\nCUENTA DE NETFLIX \nPais: " + pais + "\nCoste del Servicio: " + costeServicio + "€";
	}
	
	
	
	
	
	
	
}

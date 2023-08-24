package com.venancio.daw.examen;

public class Hbomax extends Cuenta{

	private boolean siMigrada;
	private double costeServicio=8.99;
	
	//Constructor para la cuenta de HBO Max
	public Hbomax(String nombre, String apodo, boolean siTitular, String numeroCuenta, int diaAlta, int mesAlta,
			int anoAlta, boolean siMigrada) {
		super(nombre, apodo, siTitular, numeroCuenta, diaAlta, mesAlta, anoAlta);
		this.siMigrada = siMigrada;
	}

	//Geters y Seters
	public boolean isSiMigrada() {
		return siMigrada;
	}
	public void setSiMigrada(boolean siMigrada) {
		this.siMigrada = siMigrada;
	}
	public double getCosteServicio() {
		return costeServicio;
	}
	public void setCosteServicio(double costeServicio) {
		this.costeServicio = costeServicio;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCUENTA DE HBO MAX \nCuenta Migrada: " + siMigrada + "\nCoste del Servicio: " + costeServicio;
	}
	
	
	
	
}

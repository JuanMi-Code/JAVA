package com.venancio.daw.examen;

public class Cuenta {

	private String nombre;
	private String apodo;
	private boolean siTitular;
	private String numeroCuenta;
	
	private int diaAlta;
	private int mesAlta;
	private int anoAlta;
	
	//Constructor de las cuentas base
	public Cuenta(String nombre, String apodo, boolean siTitular, String numeroCuenta, int diaAlta, int mesAlta,
			int anoAlta) {
		this.nombre = nombre;
		this.apodo = apodo;
		this.siTitular = siTitular;
		this.numeroCuenta = numeroCuenta;
		this.diaAlta = diaAlta;
		this.mesAlta = mesAlta;
		this.anoAlta = anoAlta;
	}

	
	//Geters y Seters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public boolean isSiTitular() {
		return siTitular;
	}
	public void setSiTitular(boolean siTitular) {
		this.siTitular = siTitular;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public int getDiaAlta() {
		return diaAlta;
	}
	public void setDiaAlta(int diaAlta) {
		this.diaAlta = diaAlta;
	}
	public int getMesAlta() {
		return mesAlta;
	}
	public void setMesAlta(int mesAlta) {
		this.mesAlta = mesAlta;
	}
	public int getAnoAlta() {
		return anoAlta;
	}
	public void setAnoAlta(int anoAlta) {
		this.anoAlta = anoAlta;
	}


	
	@Override
	public String toString() {
		return "\nCuenta de: " + nombre + "\nUsuario: " + apodo + "\nSi Titular=" + siTitular + "\nNumero de Cuenta: "
				+ numeroCuenta + "\nFecha de Alta: " + diaAlta + "/" + mesAlta + "/" + anoAlta;
	}
	
	
}

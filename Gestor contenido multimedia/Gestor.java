package com.venancio.daw.examen;

public class Gestor {

	private Netflix cuentaNetflix1;
	private Netflix cuentaNetflix2;
	private Netflix cuentaNetflix3;
	private Hbomax cuentaHbomax1;
	private Hbomax cuentaHbomax2;
	private Primevideo cuentaPrimevideo1;
	
	//Constructor, por lo menos tiene que tener una de las cuentas
	public Gestor(Netflix cuentaNetflix1) {
		this.cuentaNetflix1 = cuentaNetflix1;
	}
	
	
	/**
	 * @author alumnoT
	 *Me muestra la informacion de los servicios que tenemos contratados
	 */
	public void mostrarInformacionServicios() {
		String mostrar = "\nCOSTES DE LOS SERCIOS POR PERSONA: ";
		if(cuentaNetflix1!=null) {
			mostrar+= "\nNetflix: " + cuentaNetflix1.getCosteServicio()+"€/mes por cuenta";
		}
		if(cuentaHbomax1!=null) {
			mostrar+="\nHbo Max: " + cuentaHbomax1.getCosteServicio()+"€/mes por cuenta";
		}
		if(cuentaPrimevideo1!=null) {
			mostrar+="\nPrime Video: " + cuentaPrimevideo1.getCosteServicio() + "€/mes por cuenta";
		}
		System.out.println(mostrar);
	}
	
	//Geters y Seters
	public Netflix getCuentaNetflix1() {
		return cuentaNetflix1;
	}
	public void setCuentaNetflix1(Netflix cuentaNetflix1) {
		
		if (cuentaNetflix1.isSiTitular()){
			this.cuentaNetflix1 = cuentaNetflix1;
		}
	}
	public Netflix getCuentaNetflix2() {
		return cuentaNetflix2;
	}
	public void setCuentaNetflix2(Netflix cuentaNetflix2) {
		this.cuentaNetflix2 = cuentaNetflix2;
	}
	public Netflix getCuentaNetflix3() {
		return cuentaNetflix3;
	}
	public void setCuentaNetflix3(Netflix cuentaNetflix3) {
		this.cuentaNetflix3 = cuentaNetflix3;
	}
	public Hbomax getCuentaHbomax1() {
		return cuentaHbomax1;
	}
	public void setCuentaHbomax1(Hbomax cuentaHbomax1) {
		if(cuentaHbomax1.isSiTitular()){
			this.cuentaHbomax1 = cuentaHbomax1;
		}
	}
	public Hbomax getCuentaHbomax2() {
		return cuentaHbomax2;
	}
	public void setCuentaHbomax2(Hbomax cuentaHbomax2) {
		this.cuentaHbomax2 = cuentaHbomax2;
	}
	public Primevideo getCuentaPrimevideo1() {
		return cuentaPrimevideo1;
	}
	public void setCuentaPrimevideo1(Primevideo cuentaPrimevideo1) {
		if (cuentaPrimevideo1.isSiTitular()) {
			this.cuentaPrimevideo1 = cuentaPrimevideo1;
		}
	}

	
	@Override
	public String toString() {
		String mostrar="\nSERVICIOS DISPONIBLES EN SU SMART TV:  ";
		
		if(cuentaNetflix1!=null) {
			mostrar+="\nNetflix";
		}
		if(cuentaHbomax1!=null) {
			mostrar+="\nHBO Max";
		}
		if(cuentaPrimevideo1!=null) {
			mostrar+="\nPrime Video";
		}
		
		return mostrar;
	}
	
	
	
}

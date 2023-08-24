package com.venancio.daw.examen;

public class Init {

	public static void main(String[] args) {
		
		Gestor gestor = new Gestor(new Netflix("Juan Miguel", "Juanmi", true, "ES928652394", 10, 10, 2021, "España"));
		gestor.setCuentaHbomax1(new Hbomax("Pedro", "Pedrito", true, "ES47893443", 10, 12, 2020, true));
		gestor.setCuentaPrimevideo1(new Primevideo("Adrian", "Adri", true, "ES382563492", 1, 5, 2021, "adri@gmail.com"));
		
		System.out.println(gestor);
		gestor.mostrarInformacionServicios();
		
		System.out.println(gestor.getCuentaNetflix1());
		System.out.println(gestor.getCuentaHbomax1());
		System.out.println(gestor.getCuentaPrimevideo1());
	
		
		
		
	}
}

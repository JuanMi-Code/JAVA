package com.venancio.daw.tema2;

import java.util.Scanner;

public class Pruebas_Mias {

	public static void main(String[] args) {
		pruebas();
	}
	private static void pruebas() {
		
		Scanner sc1 = new Scanner(System.in);
			System.out.println("Introducir numero: ");
		int numero = sc1.nextInt();
		
	//	String puntos = "";
		double aleatorio = Math.random();
		aleatorio = aleatorio*10;
		aleatorio=(int)aleatorio+1;
		
	//	System.out.println(aleatorio);
		
		while (numero != aleatorio) {
			
			
			String puntos = "";
	//	}
	
		
		for (int contador = 0; contador < numero; contador++) {
			
			puntos += "*";
			
			System.out.println(puntos);
			
		}
		System.out.println("El numero era: " + aleatorio + "\n");
		System.out.println("Prueba otra vez: ");
		numero = sc1.nextInt();
		}
			

		
		sc1.close();
	}
}

package com.venancio.daw.tema2;

import java.util.Scanner;

public class While_Ejercicio3 {

	public static void main(String[] args) {
		ejercicio2();
	}
	private static void ejercicio2() {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		double numero = sc2.nextDouble();	
		double media = 0;
		int contador = 0;
		
		while (numero != 0) {
			
			System.out.println("Introduce un numero: ");
			media = numero + media;
			numero = sc2.nextDouble();
			contador++;
			
		}
			double fin = media / contador;
			System.out.println(fin);

		
		
		sc2.close();
	}
}

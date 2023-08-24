package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		ejercicio8();
		
	}
	private static void ejercicio8() {
		
		Scanner sc8 = new Scanner(System.in);
			
			System.out.println("Introduce tu peso: ");
				double peso = sc8.nextDouble();
			System.out.println("Introduce tu altura: ");
				double altura = sc8.nextDouble(); 
				
		//Otra opción:	int resultado = peso / altura*altura;
					double resultado = peso / Math.pow(altura, 2);
						System.out.println("IMC: " + resultado);
		sc8.close();
		double saludable1 = 18.5d;
		double saludable2 = 24.9d;
		double malacacucu1 = 25.0d;
		double malacacucu2 = 29.9d;
		
		if (resultado >= saludable1 && resultado <= saludable2 ) {
			System.out.println("\nEstás sano, nice job");
		} else if (resultado >= malacacucu1 && resultado <= malacacucu2 ) {
			System.out.println("\nMalacacucu, come más manzanas y menos mierda");
		} else {
			System.out.println("\nWow, ve al médico, eso no es sano");
		}
			
	}
}

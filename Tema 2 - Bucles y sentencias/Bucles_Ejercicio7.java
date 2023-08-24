package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio7 {

	public static void main(String[] args) {
		ejercicio7();
	}
	private static void ejercicio7() {
		
		Scanner sc7 = new Scanner(System.in);
		int numero;
		int contador = 1;
		int mayor = 1;
		int mayor2 = 1;
		
		do {
			
			System.out.println("Introduce un numero entre 0 y 9; el 0 finaliza: ");
			numero = sc7.nextInt();
			
				if (numero > mayor) {
					mayor = numero;
					contador = 0;
				}
				if (numero == mayor) {
					contador++;
				}
				

		} while (numero != 0);
		
		
		System.out.println("El mayor es: " + mayor + "\nSe repite " + contador + " veces");

	sc7.close();	
	}
}

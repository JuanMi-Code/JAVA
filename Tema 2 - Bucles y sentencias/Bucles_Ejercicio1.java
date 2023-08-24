package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio1 {

	public static void main(String[] args) {
		ejercicio1();
	}
	private static void ejercicio1() {
		
		Scanner sc1 = new Scanner(System.in);
		int numero = 0;
		int anterior = 0;
		int contador = 0;
		
		while (numero >= 0) {
		
			System.out.println("Introducir numero: ");
			numero = sc1.nextInt();
			
			if (numero == anterior) {
				contador++;
			}
			anterior = numero;
		}
		
		
		if (contador>=1) {
			System.out.println("Si se repite");
		} else {System.out.println("No se repiten");}		
		
		sc1.close();
	}
}

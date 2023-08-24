package com.venancio.daw.tema2;

import java.util.Scanner;

public class While_Ejercicio2 {

	public static void main(String[] args) {
		ejercicio2();
	}
	private static void ejercicio2() {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = sc2.nextInt();	
		int contador = 0;
		
		do {
			System.out.println("Introduce de nuevo un numero: ");
			numero = sc2.nextInt();	
			contador++;
		} while (numero != 0);
		
		System.out.println(contador);
		
		
		sc2.close();
	}
}

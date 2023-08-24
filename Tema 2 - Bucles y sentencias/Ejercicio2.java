package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		ejercicio2();
		
}
	private static void ejercicio2() {
		
		Scanner sc2 = new Scanner(System.in);
		
			System.out.println("Introduce un numero: ");
			int numero = sc2.nextInt();
			
				if ((numero % 2) == 0) {
					System.out.println("Es un numero par");
				}
				else {System.out.println("Es un numero impar");
					
				}
		
		sc2.close();
		
	}
}

package com.venancio.daw.tema2;

public class Bucles_Ejercicio10 {

	public static void main(String[] args) {
		ejercicio10();
	}
	private static void ejercicio10() {
		
		for (int numero=100; numero<=999; numero++) {
			
			int cifra1 = numero / 100;
			int cifra2 = (numero /10)%10;	
			int cifra3 = numero %10;
			
			if (Math.pow(cifra1, 3) + Math.pow(cifra2, 3) + Math.pow(cifra3, 3) == numero) {
				System.out.println(numero + " ");
			}

		}
		
	}
}
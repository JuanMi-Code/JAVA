package com.venancio.daw.tema2;

import java.util.Scanner;

public class For_Ejercicio1 {

	public static void main(String[] args) {
		ejercicio1();
	}
	
	private static void ejercicio1() {
		
		Scanner sc1 = new Scanner(System.in);
		double media1 = 0;
		double cuenta = 0;
		
			for (int contador = 0; contador < 4; contador++ ) {
			
				System.out.println("Introduce un numero: ");
				double numero = sc1.nextDouble();
				
				media1 = media1 + numero;
				cuenta++;
		} double mediaF = media1 / cuenta;
			System.out.println(mediaF);
			sc1.close();
	}
}

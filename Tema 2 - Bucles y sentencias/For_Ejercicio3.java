package com.venancio.daw.tema2;

import java.util.Scanner;

public class For_Ejercicio3 {

	public static void main(String[] args) {
		ejercicio3();
	}
	private static void ejercicio3() {
		
		Scanner sc3 = new Scanner(System.in);
			System.out.println("Introduce un numero ");
		int numero = sc3.nextInt();
		
		for (int contador = 0; contador < 11; contador++) {
			
			System.out.println(numero + " x " + contador + " = " + numero*contador);
			
		}
		sc3.close();
	}
}

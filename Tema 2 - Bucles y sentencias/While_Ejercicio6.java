package com.venancio.daw.tema2;

import java.util.Scanner;

public class While_Ejercicio6 {

	public static void main(String[] args) {
		ejercicio6();
	}
	private static void ejercicio6() {
		
		Scanner sc6 = new Scanner(System.in);
			System.out.println("Introduce un numero del 1 al 10: ");
		int numero = sc6.nextInt();
		
		int resultado = 0;
		int contador = 0;
		
		while (contador != 11) {
			
			resultado = numero * contador;
			System.out.println(numero + " x "+contador+" = "+resultado);
			contador++;
			
		}
		sc6.close();
	}
}

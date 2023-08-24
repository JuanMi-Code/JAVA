package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio6 {

	public static void main(String[] args) {
		
		ejercicio6();
		
	}
	private static void ejercicio6() {
		
		Scanner sc6 = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			int numero = sc6.nextInt();
			
			System.out.println("Introduce un exponente: ");
			int exponente = sc6.nextInt();
			
			double numero2 = 1;
		
		if (exponente > 0) {
			//potencia normal
			for (int a = 0; a < exponente; a++) {
			numero2*=numero;
			}
			System.out.println(numero2);
		}
		
		if (exponente < 0) {
			// 1 / a ^ n
			for (int a = 0; a > exponente; a--) {
				numero2*=numero;
			}
			double resultado = 1/numero2;
			System.out.println(resultado);
		}
		
		if (exponente == 0) {
			System.out.println("La solución es 0");
		}
		sc6.close();
	}
}

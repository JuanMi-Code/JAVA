package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio3 {

	public static void main(String[] args) {
		ejercicio3();
	}
	private static void ejercicio3() {
		
		Scanner sc3 = new Scanner(System.in);
		
		int contador3 = 0;
		int contador5 = 0;
		int contador = 0;
		
			for (int i=0;i<5;i++) {
				
				System.out.println("Introduce un numero: ");
				int numero = sc3.nextInt();
				
				if (numero%3 == 0) {
					contador3++;
				}
				if (numero%5 == 0) {
					contador5++;
				}
				if (numero%3 != 0 && numero%5 != 0) {
					contador++;
				}	
			
			}
			System.out.println(contador3+" son multiplos de 3");
			System.out.println(contador5+" son multiplos de 5");
			System.out.println(contador+" no son multiplos de nada");
		
		sc3.close();
	}
}

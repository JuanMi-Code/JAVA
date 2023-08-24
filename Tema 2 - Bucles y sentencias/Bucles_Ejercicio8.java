package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio8 {

	public static void main(String[] args) {
		ejercicio8();
	}
	private static void ejercicio8() {

	Scanner sc8 = new Scanner(System.in);
		System.out.println("Introducir numero: ");
		int numero = sc8.nextInt();	
		int primo = 2;

		while (numero >= primo) {
			
			if (numero % primo == 0) {
				numero /=primo;
				System.out.println(primo + " ");
			} else { primo++;}
		}
		
	}
}

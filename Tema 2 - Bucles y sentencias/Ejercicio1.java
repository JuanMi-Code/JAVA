package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		ejercicio1();
	
	}

	private static void ejercicio1() {
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad = sc1.nextInt();
		if (edad > 18) {
			System.out.println("Puedes votar");
		}	
		else if (edad == 18) {
			System.out.println("Puedes votar");
		}
		else {
			System.out.println("No puedes votar");
		}
		sc1.close();
	}
}

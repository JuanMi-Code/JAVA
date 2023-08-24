package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio4 {

	public static void main(String[] args) {
		ejercicio4();
	}
	private static void ejercicio4() {
		
		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int numero = sc4.nextInt();
		
		String manolo = "";
		for (int i = 1; i < numero ; i++) {
			manolo += i;
			System.out.println(manolo);
		}
		
		sc4.close();
	}
}

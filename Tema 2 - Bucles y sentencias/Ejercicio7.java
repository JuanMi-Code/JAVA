package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		ejercicio7();
		
	}
	private static void ejercicio7() {
		
		//pedir numero y decir cual es mayor
		
		Scanner sc7 = new Scanner(System.in);
			System.out.println("Introduce número: ");
				int numero1 = sc7.nextInt();
			System.out.println("Introduce número: ");
				int numero2 = sc7.nextInt();
				
					if (numero1 < numero2) {
						System.out.println(numero1 + " < " + numero2);
					} else {
					System.out.println(numero1 + " > " + numero2);
					}
		sc7.close();
		
	}
}

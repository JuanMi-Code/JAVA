package com.venancio.daw.tema2;

import java.util.Scanner;

public class For_Ejercicio5 {

	public static void main(String[] args) {
		ejercicio5();
	}
	private static void ejercicio5() {
		
		Scanner sc5 = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
		int numero = sc5.nextInt();
		
	/*	int numero2 = numero;
	
		for (int a = 0; a < ((numero-=1)*numero2); a--) {
			
			for (int i=0; i<numero; i++) {
			
				System.out.print("*");
			}
			System.out.println("*");
		}
	*/	
			String manolo = "";
		for (int i = 0; i < numero ; i++) {
			manolo += "*";
			System.out.println(manolo);
		}
		sc5.close();
}
}

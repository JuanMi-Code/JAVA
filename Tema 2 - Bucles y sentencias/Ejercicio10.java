package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	
		ejercicio10();
	}
	
	private static void ejercicio10() {
	
		Scanner sc10 = new Scanner(System.in);
		System.out.println("Introducir numero 1: ");
			int numero1 = sc10.nextInt();
		System.out.println("Introducir numero 2: ");
			int numero2 = sc10.nextInt();
		
			if (numero1 < numero2) {
				System.out.println(numero1 +","+ numero2);
			}else if (numero1 > numero2) {
				System.out.println(numero2 +","+ numero1);
			}else if (numero1 == numero2) {
				System.out.println(numero1 + " = "+ numero2);
			}else {System.out.println("Errooooooor");}
		sc10.close();
		
	}
}

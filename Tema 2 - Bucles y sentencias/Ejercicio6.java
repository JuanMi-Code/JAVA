package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		ejercicio6();
		
	}

	private static void ejercicio6() {
		
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Introduce una letra : ");
		
		String caracter = sc6.next();
			caracter = caracter.toUpperCase();
			int numero = caracter.length();
			
			if (numero < 2) {
			
			switch (caracter) {
			
			case "A": System.out.println("Vocal: "+caracter);
				break;
			case "E": System.out.println("Vocal: "+caracter);
				break;
			case "I": System.out.println("Vocal: "+caracter);
				break;
			case "O": System.out.println("Vocal: "+caracter);
				break;
			case "U": System.out.println("Vocal: "+caracter);
				break;
			default: System.out.println("Consonante "+caracter);
			} 
			}else {System.out.println("jodete");}
			
		
		sc6.close();
	}

}

package com.venancio.daw.tema2;

import java.util.Scanner;

public class SelecciónMultiple2_Ejercicio3 {

	public static void main(String[] args) {
		
		ejercicio3();
		
	}
	private static void ejercicio3() {
		
		Scanner sc3 = new Scanner(System.in);
			System.out.println("Introduce la primera letra de tu estado civil: ");
		String letra = sc3.next();
		
		letra = letra.toUpperCase();
		
			
			switch (letra) {
			
			case "S": System.out.println("soltero");
				break;
			case "C": System.out.println("casado");
				break;
			case "D": System.out.println("divorciado");
				break;
			case "V": System.out.println("viudo");
				break;
			default : System.out.println("Introduce un valor válido");
			}

		sc3.close();
	}
	
}

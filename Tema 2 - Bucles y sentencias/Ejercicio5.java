package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		
		ejercicio5();
		
	}

	private static void ejercicio5() {
		
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Introduce tu estado civil: s, c, d, v");
		String letra = sc5.next();			//.charAt(0) para seleccionar la posicion 0 de las letras del string
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
		default: System.out.println("No valido");
		}
		sc5.close();
	}

}

package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio8 {

	public static void main(String[] args) {
		ejercicio8();
	}
	private static void ejercicio8() {
		
		Scanner sc7 = new Scanner(System.in);
			System.out.println("Introduce un numero entre 0 y 9.999: ");
		int numero = sc7.nextInt();
		
		if (numero >= 0 && numero <=9999) {
			
				int a = numero / 1000;
			int b = numero / 100;
				int b2 = b % 10;
			int c = numero / 10;
				int c2 = c % 10;
				int d = numero % 10;
			System.out.println(d+""+c2+""+b2+""+a );
			
		}else {System.out.println("Error");}
		sc7.close();
	}
}

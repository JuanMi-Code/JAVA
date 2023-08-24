package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio9 {

	public static void main(String[] args) {
		ejercicio9();
	}
	private static void ejercicio9() {
		
			
		Scanner sc7 = new Scanner(System.in);
			System.out.println("Introduce un numero entre 0 y 9.999: ");
		int numero = sc7.nextInt();		
		
		int a = numero / 1000;
		int b = numero / 100;
			int b2 = b % 10;
		int c = numero / 10;
			int c2 = c % 10;
			int d = numero % 10;
		
		if (numero >= 1000 && numero <=9999) {
			
		/*		int a = numero / 1000;
			int b = numero / 100;
				int b2 = b % 10;
			int c = numero / 10;
				int c2 = c % 10;
				int d = numero % 10;
		// a-1 b2-2 c2-3 d-4
		*///	System.out.println();
			
			if (a == d && b2 == c2) {
				System.out.println(a+""+b2+""+c2+""+d +" Es capicua");
			}else {System.out.println("No es capicua");}
				
		} else if (numero>=100 && numero <= 999) {
			if (d == b2) {System.out.println(b2+""+c2+""+d+" Es capicua");
			}else {System.out.println("No es capicua");}
		
		} else if (numero >=10 && numero <= 99) {
			if (c2 == d) {System.out.println(c2+""+d+""+" Es capicua");
			}else {System.out.println("No es capicua");}
		}
		else {System.out.println("Error, o es inferior a 10 o es superior a 9999");}
		sc7.close();
		
	}
}

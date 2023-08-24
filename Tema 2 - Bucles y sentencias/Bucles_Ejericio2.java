package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejericio2 {

	public static void main(String[] args) {
		ejercicio2();
	}
	private static void ejercicio2() {
		
		Scanner sc2 = new Scanner(System.in);
		int numero2 = 0;	
		int cero = 0;
		
		while (cero < 5) {
		
			System.out.println("Introducir numero");
			int numero = sc2.nextInt();
			
			numero2+=numero;
			
			if (numero == 0) { cero++;}
			
		} System.out.println("Total: " + numero2);
	}
}

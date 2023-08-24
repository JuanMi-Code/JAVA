package com.venancio.daw.tema2;

import java.util.Scanner;

public class SeleccionMultiple2_Ejercicio6 {

	public static void main(String[] args) {
		ejercicio5();
	}
	private static void ejercicio5() {
	
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 10: ");
		double numero = sc5.nextDouble();
			
			if (numero >= 0 && numero <= 4.99) {
				System.out.println("Insuficiente");
			} else if (numero >= 5 && numero <= 6.99) {
				System.out.println("Aprobado");
			} else if (numero >= 7 && numero <= 8.99) {
				System.out.println("Notable");
			} else if (numero >= 9 && numero <= 10) {
				System.out.println("Sobresaliente");
			} else {System.out.println("Numero no valido");}
		
		sc5.close();
}
}
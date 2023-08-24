package com.venancio.daw.tema2;

import java.util.Scanner;

public class SeleccionMultiple2_Ejercicio4 {

	public static void main(String[] args) {
	
		ejercicio4();
	}
	private static void ejercicio4() {
		
		Scanner sc4 = new Scanner(System.in);
		
			System.out.println("Introduce el nombre de una ciudad de CyL");
		
		String ciudad = sc4.next();
		
		ciudad = ciudad.toUpperCase();
		
		switch (ciudad) {
		
		case "SALAMANCA": System.out.println("Salmantino");
			break;
		case "ZAMORA": System.out.println("Zamorano");
			break;
		}
		sc4.close();
	}
}

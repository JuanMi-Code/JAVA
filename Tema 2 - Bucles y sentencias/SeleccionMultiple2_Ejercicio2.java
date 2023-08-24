package com.venancio.daw.tema2;

import java.util.Scanner;

public class SeleccionMultiple2_Ejercicio2 {

	public static void main(String[] args) {
		
		ejercicio2();
	}
	private static void ejercicio2() {
		
		Scanner sc2 = new Scanner(System.in);
		int numero = sc2.nextInt();
		
		if (numero >=1 && numero <=12) {
			
			switch (numero) {
			
			case 1: System.out.println("31");
			break;
			case 2: System.out.println("28");
			break;
			case 3: System.out.println("31");
			break;
			case 4: System.out.println("30");
			break;
			case 5: System.out.println("31");
			break;
			case 6: System.out.println("30");
			break;
			case 7: System.out.println("31");
			break;
			case 8: System.out.println("31");
			break;
			case 9: System.out.println("30");
			break;
			case 10: System.out.println("31");
			break;
			case 11: System.out.println("30");
			break;
			case 12: System.out.println("31");
			break;
			
			
			}
			
		}else {System.out.println("Mete un numero entre 1 y 12");}
		sc2.close();
	}
}

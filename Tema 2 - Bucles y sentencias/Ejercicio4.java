package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
	
		ejercicio4();
	}

	private static void ejercicio4() {
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 12");
		int numero = sc4.nextInt();
		switch (numero) {
			
			case 1 : System.out.println("31 días");
			break;
			case 2: System.out.println("28 días"); 
			break;
			case 3: System.out.println("31 días");
			break;
			case 4: System.out.println("30 días");
			break;
			case 5: System.out.println("31 días");
			break;
			case 6: System.out.println("30 días");
			break;
			case 7: System.out.println("31 días");
			break;
			case 8: System.out.println("31 días");
			break;
			case 9: System.out.println("30 días");
			break;
			case 10: System.out.println("31 días");
			break;
			case 11: System.out.println("30 días");
			break;
			case 12: System.out.println("31 días");
			break;
			}
		sc4.close();
		
	}

}


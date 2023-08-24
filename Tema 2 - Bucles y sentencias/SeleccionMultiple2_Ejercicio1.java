package com.venancio.daw.tema2;

import java.util.Scanner;

public class SeleccionMultiple2_Ejercicio1 {

	public static void main(String[] args) {
		ejercicio1();
	}
	private static void ejercicio1() {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 7: ");
		
		int numero = sc1.nextInt();
		
		if (numero >= 1 && numero <= 7) {
			
			switch (numero) {
			
			case 1: System.out.println("Lunes");
			break;
			case 2: System.out.println("Martes");
			break;
			case 3: System.out.println("Miercoles");
			break;
			case 4: System.out.println("Jueves");
			break;
			case 5: System.out.println("Viernes");
			break;
			case 6: System.out.println("Sabado");
			break;
			case 7: System.out.println("Domingo");
			break;
			}
			
		} else {System.out.println("Que metas entre 1 y 7");}
		sc1.close();
		
		
	}
}

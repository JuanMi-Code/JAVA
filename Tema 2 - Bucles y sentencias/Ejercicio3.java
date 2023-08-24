package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		ejercicio3();
		
	}
	
	private static void ejercicio3() {
		
		Scanner sc3 = new Scanner(System.in);
		
			System.out.println("Introduce un numero, a poder ser, entre 1 y 7");
			int numero = sc3.nextInt(); 
			
				
				switch (numero) {
				case 1: {
					System.out.println("Lunes");
				break;
				}
				case 2: {
					System.out.println("Martes");
				break;
				}
				case 3: {
					System.out.println("Miercoles");
				break;
				}
				case 4: {
					System.out.println("Jueves");
					break;
				}
				case 5: {
					System.out.println("Viernes");
					break;
				}
				case 6: {
					System.out.println("Sabado");
					break;
				}
				case 7: {
					System.out.println("Domingo");
					break;
				}
				default: System.out.println("Número no válido");
				}
				
		
		sc3.close();
		
	}
}

package com.venancio.daw.tema2;

import java.util.Scanner;

public class While_Ejercicio5 {

	public static void main(String[] args) {
		ejercicio2();
	}
	private static void ejercicio2() {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = sc2.nextInt();
		//si un numero es divisible entre si mismo y entre 1
		int divisor = numero - 1;
		int contador = 2;
		
		do {
				if (numero % divisor != 0) {
					contador++;
				}
			divisor--;
		} while (divisor != 1);
		
		if (contador == 2) {
			System.out.println("Primo");
		} else {System.out.println("No primo");}
		
	//	dfhsdfh
		
		
		
		/*	if (numero / numero == 1 && numero / 1 == numero) {
			
			int contador = 2;
			int sum_restos = 0;
			
			while (contador != numero) {
				
				int resto = numero % contador;
				sum_restos = sum_restos + resto;
				contador++;
				System.out.println(sum_restos);
			} if (sum_restos > 0) {System.out.println("No es primo");
			} else {System.out.println("Es primo");}
		} else {System.out.println("No valido");}
				
	*/			
	/*		cogemos el numero y lo dividimos entre si mismo
			cogemos el numero y lo dividivmos entre 1
			
				contador = 2
			mientras contador != numero
			
				resto = numero % contador
				
				sumar_restos = sumar_restos + resto
				
				contador++
				
			//	double resto = numero % contador;
			//	restof += resto;
			//	contador++;
			//	System.out.println(resto);
			
				//https://lineadecodigo.com/java/numeros-primos-en-java/
			
			}
			
			if (restof == 1 || restof == numero) {
				System.out.println("Es primo");
			} else { System.out.println("No es primo");}
		*/	
		sc2.close();
	}
}



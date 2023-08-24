package com.venancio.daw.examen1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc2 = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
				//recogemos numero
			int numero = sc2.nextInt();
			
				//para sumar los divisores y calcular el sobrante
			int contador = 0;
			
			
			//en el enunciado pone un número positivo n, asi que pongo if para no meter negativos
			if (numero > 0) {
				
				//bucle para generar los divisores
				for (int divisor = numero-1 ; divisor > 0 ; divisor--) {
					
					//con esto sabemos si el divisor nos sirve y lo sumamos al contador
					if (numero%divisor == 0) {
						System.out.print(divisor + " ");
						contador+=divisor;
						
					}
					
				}
				//enseñamos contador
				System.out.println("\nSuma de divisores: " + contador);
				
				if (contador > numero) {
					System.out.println("Es sobrante");
				} else {
					System.out.println("No es sobrante");
				}

				
			}else {System.out.println("El numero tiene que ser positivo");}
			
		sc2.close();
	}
}

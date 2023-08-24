package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio5 {

	public static void main(String[] args) {
		ejercicio5();
	}
	private static void ejercicio5() {
		
		Scanner sc5= new Scanner (System.in);
			System.out.println("Introducir valor para a: ");
		double a = sc5.nextDouble();
			System.out.println("Introducir valor para b: ");
		double b = sc5.nextDouble();
			System.out.println("Introducir valor para c: ");
		double c = sc5.nextDouble();
		
			double interior = Math.pow(b, 2);
			double interior2 = interior - (4*a*c);
			
			if (interior2 > 0) {
				
				double raiz1 = Math.sqrt(interior2);
				double raiz2 = raiz1;
				
				double dividendo1 = (-1 * b)+raiz1;
				double dividendo2 = (-1 * b)-raiz2;
				
				double resultado1 = dividendo1 / (2 * a);
				double resultado2 = dividendo2 / (2 * a);
				
				System.out.println("Exsisten dos soluciones: X = "+resultado1+ " y X= "+resultado2);
				
			} else if (interior2 < 0) {
				
				System.out.println("No exisite una solución real.");
				
			} else if (interior2 == 0) {
				
				double resultado3 = (-1 * b) / (2 * a);
				System.out.println("Resultado: X= "+resultado3);
				
			}
			
		sc5.close();
	}
}

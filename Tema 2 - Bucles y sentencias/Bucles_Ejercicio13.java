package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio13 {

	public static void main(String[] args) {
		ejercicio13();
	}
	private static void ejercicio13() {
		
		Scanner sc13 = new Scanner(System.in);
		
			System.out.println("Introduce un numero: ");
		int num1 = sc13.nextInt();
			System.out.println("Introduce un numero: ");
		int num2 = sc13.nextInt();
		
		int num1Original = num1;
		int num2Original = num2;
		
		int factor = 2, mcm = 1;
		
		while (num1 != 1 || num2 != 1 ) {
			
			if (num1 % factor == 0 || num2 % factor == 0) {
				
					System.out.print(factor + " ");		
				
				mcm = mcm * factor;
				
				if (num1 % factor == 0) {
					num1 /= factor;
				}
				if (num2 % factor == 0) {
					num2 /= factor;
				}
				
			} else {factor++;}
				
		}
		System.out.println("\nEl mcm de " + num1Original + " y " + num2Original + " es " + mcm);
		
		sc13.close();
		

		
		//forma rara de un chaval que lo sacó
		
/*		int sumatorio1 , sumatorio2;
		sumatorio1 = num1;
		sumatorio2 = num2;
		
		while (sumatorio1 != sumatorio2) {
			System.out.println(sumatorio1 + "\t" + sumatorio2);
			if (sumatorio1 > sumatorio2) {
				sumatorio2 += num2;
			}else {
				sumatorio1 += num1;
			}
		}
		System.out.println("El mcm de " + num1 + " y " + num2 + " es " + sumatorio1);
*/		//System.out.println("El mcm de " + num1 + " y " + num2 + " es " + sumatorio1);
	}
	
}

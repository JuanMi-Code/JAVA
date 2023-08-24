package com.venancio.daw.tema2;

import java.util.Scanner;

public class While_Ejercicio4 {

	public static void main(String[] args) {
		ejercicio2();
	}
	private static void ejercicio2() {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = sc2.nextInt();	
		double aleatorio = 0;
			
			while (numero != aleatorio) {
				
				System.out.println("Introduce un numero: ");
				numero = sc2.nextInt();
				
				//aleatorio = Math.floor(Math.random()*11);
				double azar = Math.random();
				azar = (azar*10)+1;
				aleatorio = (int)azar;
				
				System.out.println(aleatorio);
				
			}System.out.println("son iguales");
		
		sc2.close();
	}
}

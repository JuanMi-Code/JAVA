package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio7 {

	public static void main(String[] args) {
		
		ejercicio7();
		
	}
	private static void ejercicio7() {
		
		Scanner sc7 = new Scanner(System.in);
			System.out.println("Introduce un numero entre 0 y 9.999");
		int numero = sc7.nextInt();
		int contador = 0;
		
		if (numero >= 0 && numero <= 9999) {
		
		while (numero != 0) {
			numero /= 10;
			contador++;
		} System.out.println(contador);
		sc7.close();
	
		}else {System.out.println("MAL, METE UN VALOR DE LOS QUE SE PIDEN");}
	}
}

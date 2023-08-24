package com.venancio.daw.examen1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
			int numero = sc4.nextInt();
		
		//int numero = 10;
		String asterisco = "*";
		char espacio = ' ';
		
		//hacemos que lo repita las veces que queremos
		for (int altura = 0; altura < numero-1; altura ++) {
			
			//lo mostramos y sumamos a la string un asterisco
			System.out.println(asterisco);
			asterisco+="*";
			
		}
		//Ahora vamos a eliminar asteriscos de la parte derecha de la String
		//con esto lo que hacemos es irle sustituyendo las ultimas posiciones en las que hay astericos por un espacio y lo vamos mostrando.
		for (int i = 1; i <= numero; i++) {
			
		StringBuilder quitar = new StringBuilder(asterisco);
			quitar.setCharAt(asterisco.length()-i, espacio);
			System.out.println(asterisco);
		asterisco = quitar.toString();
		
		}
		sc4.close();
	}
}

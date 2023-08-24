package com.venancio.daw.tema2;

import java.util.Scanner;

public class Pruebas_yoquese {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce una vocal o consonante");
		int numero = sc1.nextInt();
		
		if (numero >= 65 && numero <= 90 || numero >=97 && numero <= 122) {
		char letra = (char)numero;
		System.out.println(letra);
		}else {System.out.println("No me vale");}
		
		
		
		
	}
}

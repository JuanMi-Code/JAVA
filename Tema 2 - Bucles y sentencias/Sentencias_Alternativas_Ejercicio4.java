package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio4 {

	public static void main(String[] args) {
		ejercicio4();
	}
	private static void ejercicio4() {
		
		Scanner sc4 = new Scanner(System.in);
			System.out.println("Introduce tu boleto completo: ");
		int numero = sc4.nextInt();
		
		double aleatorio = Math.random()*100000;
		//int aleatorio = 28;
		int once = (int)aleatorio;
		
			System.out.println(once);
		//obtenemos cifra primera y ultima del numero aleatorio
		double cifra1 = aleatorio /10000;
			int primero = (int)cifra1;
		double cifra2 = aleatorio % 10;
			int ultimo = (int)cifra2;
			//obtenemos cifra primera y ultima de nuestro numero
		double primero_numero = numero / 10000;
			int numero1 = (int)primero_numero;
		double ultimo_numero = numero % 10;
			int numerof = (int)ultimo_numero;
			//comparamos y mostramos resultado
		if (primero == numero1 || ultimo == numerof) {
			System.out.println("Conseguido Reintegro");
		} else if (numero == aleatorio) {
			System.out.println("Numero premiado");
		} else {System.out.println("No te ha tocado nada");}
		
		System.out.println(primero + " " + ultimo);
		System.out.println(numero1+" "+numerof);
		sc4.close();
	}
}

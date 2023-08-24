package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio12 {

	public static void main(String[] args) {
		ejercicio12();
	}
private static void ejercicio12() {
	
/*	Scanner sc12 = new Scanner(System.in);

	System.out.println("Introduce un número: ");
	int numero = sc12.nextInt();

		int posicion = (numero * 2) -1;
		int principio = numero;
		int fin = numero;


	for (int a=0; a<numero; a++) {
		int contador = 1; 	//Como la piramide empieza por 1, lo declaramos aquí
		String resultado = ""; 
		//este string es para almacenar los numeros que se mostraran al final

		
		for (int b=0; b<=posicion; b++) {
			//comprobamos si tenemos que poner numero
			
			if ((b < principio) || (b > fin)) {
				resultado += " ";
			} else {		//aqui añadimos los numeros
				if (b < numero) {
					resultado += contador;
					contador++;
				} else {	// aqui quitamos numeros de la parte derecha
					resultado += contador;
					contador--;
				}
			}
		}
	System.out.println(resultado);
	fin++;
	principio--;

	
	}
	sc12.close();
*/

	Scanner sc12 = new Scanner(System.in);
		System.out.println("Introduce un número");
		int altura = sc12.nextInt();
		int espacios=altura-1;
		
		for (int fila=1; fila<=altura; fila++) {
			//numeros en la fila
			
			for (int i=1; i <= espacios; i++) {
				System.out.print(" ");
					//espacios izqda
			}
			for (int i=1; i<=fila; i++) {
				System.out.print(i);
					//numeros
			}
			for (int i=fila-1; i>0; i--) {
				System.out.print(i);
					
			}
		espacios--;
		System.out.println();

		}
	}
}

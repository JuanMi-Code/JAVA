package com.venancio.daw.examen1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
			int numero = sc3.nextInt();
			int contadorpar=1;
			int contadorimpar=1;
			
			
			if (numero == 0 || numero == -1) {
				System.out.println("1");
			}else if (numero%2==0) {
				
				System.out.println(numero + "!! es par, así que: ");
				
					//generamos los numeros pares que hay por debajo del introducido
				for (int par = numero; par>0; par-=2) {
					
						System.out.print(par + " ");
					
					contadorpar*=par;
				}
				System.out.println("\nResultado: " + contadorpar);
				
			}else {
				
				System.out.println(numero + "!! es impar, así que: ");
				//generamos los numeros impares que hay por debajo del introducido
				
				for (int impar = numero; impar>0; impar-=2) {
					
					System.out.print(impar + " ");
					
					contadorimpar*=impar;
				}
				System.out.println("\nResultado: " + contadorimpar);
				
			} 
		sc3.close();
	}
}

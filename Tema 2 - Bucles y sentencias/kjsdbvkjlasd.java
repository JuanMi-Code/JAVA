package com.venancio.daw.tema2;

import java.util.Scanner;
import java.util.Set;

public class kjsdbvkjlasd {

	public static void main(String[] args) {
		
		
		
/*
		int numero = 12;
		int contador = numero-1;
		int resultado = 0;
		
		while (contador > 0) {
			
			if (numero % contador == 0) {
				
				resultado+=contador;
				
			}
			contador--;
			
		}
		System.out.println(resultado);
*/		
		
/*		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introioducir numero");
		int numero = sc1.nextInt();
		
		for (int par = numero-2; par > 0; par-=2) {
			System.out.print(" " + par);
		}	
		sc1.close();
*/
		
/*		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introioducir numero");
		int numero = sc1.nextInt();
		int op=1;
		
		for (int par = numero-2; par > 0; par-=2) {
			
			op*=par;
		}
		System.out.println(op);
			
		
		sc1.close();
*/		
		
		
/*		String manolo = "";
		int numero = 5;
		int contador = numero-1;
		for (int i = 0; i<numero; i++) {
			
			System.out.println(manolo);
			manolo+="*";
			
		}
		System.out.println(manolo);
		for (int i = 0; i< numero-1; i++) {
			
			for (int b = contador; b>0; b--) {
				
				System.out.print("*");
				
			}
			contador--;
			System.out.println();
		}
*/		

		
/*		int numero = 7/2;
		String espacio = " ";
		String asterisco = "*";
		int contador = numero;
		int contador2 = numero;
		
		char espacioblanco = ' ';
		
		for (int altura = 0; altura < numero; altura++) {
								
				
			for (int izquierda = 0; izquierda< contador; izquierda++) {
					
				System.out.print(espacio);
						
			}
			contador--;	
				System.out.print(asterisco);
				asterisco+= "**";
				
			for (int derecha = 0; derecha<contador2; derecha++) {
					
				System.out.print(espacio);
				
			}
			contador2--;	
			System.out.println();
		}
		System.out.println(asterisco);
		
		for (int i = 1; i<numero*2-1; i++) {
			
		StringBuilder hola = new StringBuilder(asterisco);
			hola.setCharAt(i-1, espacioblanco);
			hola.setCharAt(asterisco.length()-i, espacioblanco);
			asterisco = hola.toString();
		
		
			
			System.out.println(asterisco);
			
		}
			
		
*/
	}
}

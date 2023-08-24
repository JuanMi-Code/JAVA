package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio10 {

	public static void main(String[] args) {
		ejercicio10();
	}
	private static void ejercicio10() {
		
		Scanner sc10 = new Scanner(System.in);
			System.out.println("Introduce tu nota: ");
		double nota = sc10.nextDouble();
		
		double insuficiente = 4.99; double suficiente = 5.99;
		double bien = 6.99; double notable = 7.99;
		double sobresaliente = 10;
		
		if (nota >= 0 && nota <= 10) {
				
				if (nota <= insuficiente) {
					System.out.println("Insuficiente");
				}else if (nota > insuficiente && nota <= suficiente){
					System.out.println("Suficiente");
				} else if (nota > suficiente && nota <= bien) {
					System.out.println("Bien");
				} else if (nota > bien && nota <= notable) {
					System.out.println("Notable");
				} else if (nota > notable && nota <= sobresaliente) {
					System.out.println("Sobresaliente");
				}
		}else {System.out.println("Numero no valido");}
		
		sc10.close();
	}
}

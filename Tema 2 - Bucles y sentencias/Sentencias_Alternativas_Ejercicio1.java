package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introducir vértice 1: ");
			int a = sc1.nextInt();
		System.out.println("Introducir vértice 1: ");
			int b = sc1.nextInt();
		System.out.println("Introducir vértice 1: ");
			int c = sc1.nextInt();
			
			//acutangulo, todos los angulos suman 180º
			//acutangulo cada angulo menor de 90º
				
			
			if (a < 90 && b < 90 && c < 90) {
				if (a+b+c==180) {
					System.out.println("Triangulo acutangulo");
				}
			} else if (a==90||b==90||c==90) {
					if (a+b==90||a+c==90||b+c==90) {
						System.out.println("Triangulo rectangulo");					
					}
			} else if (a>90||b>90||c>90) {
				if (a<90 && b<90 || a<90 && c<90 ||b<90 && c<90) {
					System.out.println("Triangulo Obtusangulo");
				}
			} else  {System.out.println("Valor no válido");}			
			
		sc1.close();
	}
}

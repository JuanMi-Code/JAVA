package com.venancio.daw.tema2;

public class Cuadrado_Asteriscos {

	public static void main(String[] args) {
		
		
		int valor = 5;
			
			
			for (int a=0; a<valor; a++) {
				
				System.out.println();
				for (int b=0; b<valor; b++) {
					System.out.print("* ");
				}
			}
	
	System.out.println();
	System.out.println();
	
		int valor2 = 4;
		String espacio = "";
		
		for (int i=0; i<valor2; i++) {
			
			System.out.print(espacio + "*");
			System.out.println();
			espacio += "  ";
		}
		
	}
}

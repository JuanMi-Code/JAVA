package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio9 {

	public static void main(String[] args) {
		ejercicio9();
	}
	private static void ejercicio9() {
		
		Scanner sc9 = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			int numero = sc9.nextInt();
			
			String info = "";
			while (numero!=0) {
				
				int resultado = numero % 2;
				
					info+=resultado;

					numero/=2;
						
			}
			int longitud = info.length();
			 
			for (int i=longitud; i>0; i--) {
				System.out.print(info.charAt(i-1));
			}		
		sc9.close();
	}
}

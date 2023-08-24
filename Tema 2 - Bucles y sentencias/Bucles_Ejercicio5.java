package com.venancio.daw.tema2;

import java.util.Scanner;

public class Bucles_Ejercicio5 {

	public static void main(String[] args) {
		ejercicio5();
	}
	private static void ejercicio5() {
		
		Scanner sc5 = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			int numero = sc5.nextInt();
			
			int var1 = 0;
			int var2 = 1;
			int var3;
			
			System.out.print(var1 + " " +var2 + " ");
			
				for (int i = 1; i <= numero/3; i++) {
					
					var3 = var1 + var2;
					System.out.print(var3 + " ");

						   var1 = var2 + var3;
						   System.out.print(var1 + " ");
						   
						   		  var2 = var3 + var1;
						   		  System.out.print(var2 + " ");
					//Salen mal por el sysout y la division del for	   		  		  
				}
		
		sc5.close();
	}
}

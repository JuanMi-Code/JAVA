package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio11 {

	public static void main(String[] args) {
		ejercicio11();
	}
	private static void ejercicio11() {
		
		Scanner sc11 = new Scanner(System.in);
			System.out.println("Introduce un numero entre 0 y 99: ");
		int numero = sc11.nextInt();
			
		if (numero >= 0 && numero <= 99) {
			
			int a = numero / 10;
			int b = numero % 10;
			
		if (numero != 0 && numero != 10 && numero != 12 && numero != 13 && numero != 14 && numero != 15 && 
				numero != 20 && numero != 30 && numero != 40 && numero != 50 && numero != 60 && 
				numero != 70 && numero != 80 && numero != 90) {
			
			switch (a) {
			case 1: System.out.print("Dieci");
			break;
			case 2: System.out.print("Veinti");
			break;
			case 3: System.out.print("Treinta y ");
			break;
			case 4: System.out.print("Cuarenta y ");
			break;
			case 5: System.out.print("Cincuenta y ");
			break;
			case 6: System.out.print("Sesenta y ");
			break;
			case 7: System.out.print("Setenta y ");
			break;
			case 8: System.out.print("Ochenta y ");
			break;
			case 9: System.out.print("Noventa y ");
			break;
			}
			switch (b) {
			case 1: System.out.println("uno");
			break;
			case 2: System.out.println("dos");
			break;
			case 3: System.out.println("tres");
			break;
			case 4: System.out.println("cuatro");
			break;
			case 5: System.out.println("cinco");
			break;
			case 6: System.out.println("seis");
			break;
			case 7: System.out.println("siete");
			break;
			case 8: System.out.println("ocho");
			break;
			case 9: System.out.println("nueve");
			}
		}else {
			switch (numero) {
			case 0: System.out.println("Cero");
			break;
			case 10: System.out.println("Diez");
			break;
			case 11: System.out.println("Once");
			break;
			case 12: System.out.println("Doce");
			break;
			case 13: System.out.println("Trece");
			break;
			case 14: System.out.println("Catorce");
			break;
			case 15: System.out.println("Quince");
			break;
			case 20: System.out.println("Veinte");
			break;
			case 30: System.out.println("Treinta");
			break;
			case 40: System.out.println("Cuarenta");
			break;
			case 50: System.out.println("Cincuenta");
			break;
			case 60: System.out.println("Sesenta");
			break;
			case 70: System.out.println("Setenta");
			break;
			case 80: System.out.println("Ochenta");
			break;
			case 90: System.out.println("Noventa");
			break;
			}
		}
		}else {System.out.println("Valor no valido");}
		
		sc11.close();
	}
}

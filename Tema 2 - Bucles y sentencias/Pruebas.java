package com.venancio.daw.tema2;

import java.util.Scanner;

//import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
	
		//ejemploIfElse();
		//ejemploSwitch();
		//ejemploSwitch2();
		//ejemploWhile();
		//ejemploNoseque();
		ejercicio();
	}

	/*	
	private static void ejemploIfElse() {
		
		Scanner sc1prueba = new Scanner(System.in);
		System.out.println("Introduce un número ");
		
		int numero = sc1prueba.nextInt();
		
		if (numero > 15) {
			System.out.println("Es mayor que 15");
		}
		else if (numero == 15) {
				System.out.println("Es igual a 15");
		}		
		else {	
			System.out.println("No es mayor que 15");	
		}
		
		sc1prueba.close();
	}
*/
/*
	private static void ejemploSwitch() {
		
		String cadena;
		cadena = "cuatro";
		
		switch (cadena) {
		case "uno":
			System.out.println("La condicion es uno");
			break;
		case "dos":
			System.out.println("La condicion es dos");
			break;
		case "tres":
			System.out.println("La condicion es tres");
			break;
		default:
			System.out.println("La condicion no es ninguna de las anteriores");
		}
	}
*/

// si numero negativo, indicar que es negativo, si = 0 indicar que =0, si > 0 o positivo indicarlo	
/*
	private static void ejemploSwitch2() {
		
		Scanner sc1 = new Scanner(System.in);
		int numero = sc1.nextInt();
		
		switch (numero) {
		
		case -1 :
				System.out.println("Numero negativo");
		break;
		
		case 0 :
				System.out.println("Numero igual a 0");
		break;
		case 1 :
				System.out.println("Numero positivo");
		break;
		}
		sc1.close();
		
	}
*/
/*	
	//While, mostrar numeros pares hasta el tope que queramos (40)
	private static void ejemploWhile() {
		
		int numero = 0;
		while (numero < 40) {
			
			System.out.println(numero);
			numero+=2;
		}
		
	}
*/
	//Pedir numeros por consola y los sume hasta que introduzcas -1
/*	
	private static void ejemploNoseque() {
		Scanner sc1 = new Scanner(System.in);
		int suma = 0;
		int numero = 0;
		do {
			System.out.println("Introduce un número; -1 finaliza; suma actual: " + suma);
			suma = suma + numero;
			numero = sc1.nextInt();
			
				//System.out.println(suma);
		} while (numero != -1);
			//System.out.println("Suma: "+suma);
		//int num=0,total=0;
		//do {
		//System.out.println("Introduce un numero: ");
		//total=total+num;
		//num = sc1.nextInt();
		//} while (num != -1)
		//System.out.println("El total es: "+total);
		System.out.println(suma);
		sc1.close();
}
*/
	//Hacer la tabla del 3
	
private static void ejercicio() {
	int numero = 3;
		for (int multiplicador = 0; multiplicador < 11; multiplicador++) {
			System.out.println(numero + " * " + multiplicador + " = " + multiplicador*numero);
		}
		
}


}

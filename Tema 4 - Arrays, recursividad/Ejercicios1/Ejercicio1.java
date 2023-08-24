package Ejercicios1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introducir numero: ");
		int numero = Integer.valueOf(sc.nextLine());
		
		int [] arr = new int [20];
		for (int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10);
		}
		
		int contador=0;
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			if (numero == arr[i]) {
				contador++;
			}
		}
	System.out.println("\nContador: " + contador);	
	}
}

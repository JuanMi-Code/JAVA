package Ejercicios1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [5];
		for (int i=0;i<arr.length;i++) {
			System.out.println("Mete valor: ");
			arr[i] = Integer.valueOf(sc.nextLine());
		}
		
		int contador=0;
		int mal=0;
		for (int i=1;i<arr.length;i++) {
			
			if (arr[contador]>arr[i]) {
				mal++;
			}
			contador ++;
		}
		if (mal>0) {
			System.out.println("desordenado");
		}else {
			System.out.println("ordenado");
		}

	}
}

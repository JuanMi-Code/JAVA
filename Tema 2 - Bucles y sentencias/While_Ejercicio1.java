package com.venancio.daw.tema2;

import java.util.Scanner;

public class While_Ejercicio1 {
public static void main(String[] args) {
	ejercicio1();
}
private static void ejercicio1() {
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Introduce una cifra: ");
	int numero = sc1.nextInt();
		
		int i = 0;
		while (numero != 0) {
			numero = numero / 10;
			i++;
		} System.out.println(i);
	sc1.close();
	
}
}

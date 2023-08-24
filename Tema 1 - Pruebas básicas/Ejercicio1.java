package com.venancio.daw.examen1;

//import java.security.DomainCombiner;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		

		int contadorpar=0;
		int contadorimpar=0;
		
		for (int repeticiones = 0; repeticiones < 10; repeticiones++) {
		
			System.out.println("Introducir numero");
			int numero = sc1.nextInt();
			
		if (numero%2==0) {
			System.out.println("Es par");
			contadorpar++;
		} else if (numero != 0) {
			System.out.println("Es impar");
			contadorimpar++;
		}else if (numero == 0) {
			System.out.println("cero no es ni par ni impar");
		}
		}
		System.out.println(contadorpar + " numeros pares " + contadorimpar + " numeros impares");
	sc1.close();	
	}
	
}

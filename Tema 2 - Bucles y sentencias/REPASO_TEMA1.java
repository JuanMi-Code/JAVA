package com.venancio.daw.tema2;

import java.util.Random;

public class REPASO_TEMA1 {

public static void main(String[] args) {
		
		double numero = Math.random()*5+1; //numero aleatorio del 1 al 5  / Math.floor() redondea //  
										   //Math.random()*(m-n) + n; m=80 n=30 (nos da numeros entre 20 y 50 ¿o entre 30 y 50?)
											Random r = new Random();
											System.out.println(r.nextInt(6)); //numero aleatorio entre 0 y 5
											System.out.println(r.nextInt(6)+2); //numero aleatorio entre 2 y 8

		System.out.println(numero);
		
		
		double prueba = 0.4635654d;
		System.out.printf("%.2f%n", prueba);
		double prueba2 = 0.4635654d;
		System.out.printf("%.3f", prueba2);
		
		
		System.out.printf("%10.2f", numero);  //tabulación anterior a la variable
		
			System.out.println("");
		
		System.out.printf("%s%20s%20s\n", numero , "HOLA", "hey");  //tabulaciones entre variables
		
		numero = (int)numero;
			System.out.println(numero);
			
		char ascii = (char)numero;
			System.out.println(ascii);
			
		String palabra = "hola";
		System.out.println(palabra.charAt(1)); //letra en posicion 1 // empieza en 0
		System.out.println(palabra.length()); //ultima letra // empieza en 1
		
		String mayuscula = palabra.toUpperCase();
			System.out.println(mayuscula);
		
		String minuscula = palabra.toLowerCase();
			System.out.println(minuscula);
		
		int numerito = 20;
		double resultado_raiz_cuadrada = Math.sqrt(numerito);
			System.out.println(resultado_raiz_cuadrada);
			
		double exponentes = Math.pow(5, 2);
			System.out.println(exponentes);
			
		final int ENTRADA = 0;	//esta variable nunca va a cambiar
			System.out.println(ENTRADA);
			
	}
}
/*
	public static void main(String[] args) {
		System.out.printf("%s%20s%20s%20s%20s\n", "Lunes", "Martes", "MiÃ©rcoles", "Jueves", "Viernes");
		System.out.printf("%s%20s%20s%20s%20s\n", "Prog", "BBDD", "Prog", "LMSG", "SI");
		System.out.printf("%s%20s%20s%20s%20s\n", "Prog", "BBDD", "Prog", "LMSG", "SI");
		System.out.printf("%s%20s%20s%20s%20s\n", "Prog", "BBDD", "Prog", "LMSG", "SI");
		System.out.printf("%s%20s%20s%20s%20s\n", "Prog", "BBDD", "Prog", "LMSG", "SI");
		System.out.printf("%s%20s%20s%20s%20s\n", "Prog", "BBDD", "Prog", "LMSG", "SI");
		
		float num = 12.456789f;
		System.out.printf("%10.2f", num);
	}
}
*/
/*	public static void main(String[] args) {
		
		double peso, altura, imc;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu peso: ");
		peso = sc.nextDouble();
		
		System.out.print("Introduce tu altura: ");
		altura = sc.nextDouble();
		sc.close();
		
		imc = peso / Math.pow(altura, 2);
		
		System.out.printf("IMC: %.2f\n", imc);
		
		if(imc < 18.5) {
			System.out.println("Extrema delgadez");
		} else if(imc < 25) {
			System.out.println("Normal");
		} else {
			System.out.println("Obesidad");
		}
		
	}

}
*/

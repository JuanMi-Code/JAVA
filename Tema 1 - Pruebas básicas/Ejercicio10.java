package com.venancio.daw.tema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main (String[] args) {
		
//Ejercicio10		(calculo area y longitud con radio)
		
		Scanner sc10 = new Scanner(System.in);
		System.out.print("Introduce radio: ");
		double radio = (double)sc10.nextDouble();
		
		final double PI = 3.14d;
			double longitud = 2*(double)PI*(double)radio;
			double area = PI*((double)radio*(double)radio);
			//double radio, longitud, area;
			//longitud = 2* Math.PI * radio;
			//area = Math.PI * Math.pow(radio,2); //Math.pow es elevado a.... al cuadrado, al cubo, etc
			
		System.out.print("Longitud= "+(double)longitud+"\nArea= "+(double)area);
		sc10.close();
		
	}
}

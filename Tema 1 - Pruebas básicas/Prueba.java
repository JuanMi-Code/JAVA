
package com.venancio.daw.tema1;

import java.util.Scanner;

public class Prueba {
	
public static void main (String[] args) {
	
	
	final double PI = 3.1415920;
	System.out.println(PI);
	
	int edadAlumno;
	edadAlumno = 23;
	System.out.println(edadAlumno);
	
	long enteroLargo = 990000l;
	System.out.println(enteroLargo);
	
	float realSencilla = 9900000f;
	System.out.println(realSencilla);
	
	double realDoble = 990d;
	System.out.println(realDoble);
	
	boolean logico = true; //false
	System.out.println(logico);
	
	char textooo = 'h';
	System.out.println(textooo);
	System.out.println("HOLAAAAA " + edadAlumno);
	
	final String NOMBRE = "D.JM";
	System.out.println(NOMBRE);

/*
*Comentario largo	
*
*/
	
//Comentario corto

	
	int num1 = 1;
	int num2 = 2;
	int num3;
	num3 = num1 + num2;
	char textoo = '"';
	System.out.println("resultado " + textoo + num3);
	
	int num4 = 13;
	int num5 = 100;
	float num6;	
	num6 = (float)num4 / num5;
	System.out.println("resultado " + num6++);
	System.out.println("Incremento " + num6);
	System.out.println("resultado " + num4);
	System.out.println("resultado " + ++num4);
	
	int num7 = 10;
	int num8 = 5;
	int num9;
	num9 = num7 % num8;
	System.out.println("resultado " + num9);	
	
	
	//Dar un valor a una variable y asignarle 
	//el resultado de una multiplicación
	
		int num10= 10;
		System.out.println(num10);
		//num10 = num10 * 2;
		//System.out.println(num10);
		num10 *= 2;
		System.out.println(num10);
		
		
//Precio de un producto mayor que el precio de dos productos
int precio1 = 20;
int precio2 = 5;
int dosProductos= precio2 * 2;
System.out.println("Precio1 es mayor que precio2*2? " + (precio1 > dosProductos));


	//ejemplo
int i, j;
i=10;
j=11;
System.out.println(     (i>j) || (i<=j)     );


//4 variables y probamos las puertas logicas

	int a,b,c,d;
	a=1; b=2; c=3; d=4;
	System.out.println(      (a<b)  &&  (c<d)      );

	//ejemplo
	//boolean valor = a>b ?
	//dos valores enteros y sacar cadena si se cumple una cosa u otra
	
	int valorx = 15;
	int valory = 18;
	String opcion1 = "Es mayor de edad";
	String opcion2 = "Es menor de edad";
	String resultado = valorx > valory ? opcion1: opcion2;
	System.out.println( resultado );
//		Otra opción sería:
//		String resultado = valorx > valory ? "X es mayor que Y" : "X NO es mayor que Y";
//		System.out.println(  resultado);

//Ejemplo guay de dos ?:
//	int edad = -1;
//	System.out.println( edad >= 18 ? "Es mayor de edad" : edad > 0 ? "Es menor de edad": "No exisites");
	
	
	System.out.printf("Mensaje");
	System.out.println("Mensaje con retorno de carro");
	
	
	String prueba = "Hola a todos";
			System.out.println(prueba.charAt(1));
	
	String ejer = "Hey que pasa";
			System.out.println(ejer.length());
	
			
			
			
	Scanner sc = new Scanner(System.in);
	System.out.print("introduzca valor 1:");
	int v1 = sc.nextInt();
	System.out.print("Introduzca el valor 2:");
	int v2 = sc.nextInt();
	int v3 = v1 + v2;
	char comilla = '"';
	System.out.println("Resultado de " + v1 + "+" + v2 + "=" + v3 + comilla);
	sc.close();
}
}

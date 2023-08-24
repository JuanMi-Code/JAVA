package com.venancio.daw.tema1;

import java.util.Scanner;


public class MathUtils {
	/*
	 * Operaciones aritméticas
	 */
	
public static void main (String[] args) {
	
/*	int dato1, dato2, resultado;
	
	dato1=20;
	dato2=10;
	
	//suma
	resultado=dato1+dato2;
	System.out.println(dato1 + " + " + dato2 + " = " + resultado);
	
	//resta
	resultado = dato1 - dato2;
	System.out.println(dato1 + " + " + dato2 + " = " + resultado);
	
	//Producto
	resultado=dato1*dato2;
	System.out.println(dato1 + " * " + dato2 + " = " + resultado);
	//cociente
	resultado=dato1/dato2;
	System.out.println(dato1 + " / " + dato2 + " = " + resultado);
*/

//Ejercicio 2	 
/*
	Scanner sc = new Scanner(System.in);
	System.out.print("introduce edad:");
	int edad = sc.nextInt();
	
		String opcion1 = "Es mayor de edad";
		String opcion2 = "Es menor de edad";
		String resultadoEdad = edad >= 18 ? opcion1: opcion2;
		System.out.println( resultadoEdad );
	
	sc.close();

*/	
//Ejercicio 3
/*	
	Scanner sc2 = new Scanner(System.in);
	System.out.print("Introduce Nº para comprobar si es múltiplo de 7");
	int numMultiplo = sc2.nextInt();

		final int num_divisor = 8;
		int res3 = numMultiplo % num_divisor;
		String resEjer3_1 = "Es multiplo de "+num_divisor;
		String resEjer3_2 = "No es multiplo de "+num_divisor;		
		String res3f = res3 == 0 ? resEjer3_1 : resEjer3_2;
		System.out.print(res3f);
	sc2.close();

*/
/*
//Ejercicio 4 Si un año es bisiesto (Divisible por 4 y si acaba en 00 por 400)
	
	Scanner sc4 = new Scanner(System.in);
	System.out.print("Introduce un año para comprobar si es bisiesto: ");
		
		int ano = sc4.nextInt();
		String bisiesto = "Es bisiesto";
		String noBisiesto = "No es bisiesto";
		
			//String res4_2 = ano % 400 == 0.0f ? bisiesto : noBisiesto;
		
			//String res4_3 = ano % 4 == 0.0f ? bisiesto : res4_2;
			
String resultadoBisiesto = (ano % 4 == 0) && 
				((ano % 100 !=0) || (ano % 400 == 0)) ? bisiesto : noBisiesto ; 

				//(ano % 4 == 0 && ano % 100 !=0) || (ano % 400 ==0 && ano % 100 !=0);
		
		System.out.print(resultadoBisiesto);
		
	sc4.close();
*/

/*	
//Ejercicio5 Peso = masa * gravedad
	
	Scanner sc5 = new Scanner(System.in);
	System.out.print("Introduce tu peso para saber cuanto pesas en la luna: ");
	double peso = sc5.nextDouble();
		double masa = peso / 9.8d;
		double pesoLuna = masa * 1.62d;
		System.out.print("Tu peso en la Luna es: " + pesoLuna + " KG");
	sc5.close();
	
	//final float GLUNA = 1.62f;
	//final float GTIERRA = 9.8f;
	//float peso = sc5.nextFloat();
	//	float pesoLuna = peso * GLUNA / GTIERRA;
	//	System.out.print(pesoLuna);
*/
	
/*	
//Ejercicio 6
	
	Scanner sc6 = new Scanner(System.in);
	System.out.print("Introduce cuantos segundos duró el concierto: ");
	int segundos = sc6.nextInt();
	
		int minutos = segundos / 60;
		int horas = minutos / 60;
		
		int restoMinutos = minutos % 60;
		int restoHoras = horas % 60;
		int totalSegundos = segundos - (minutos * 60);
		
	System.out.print(restoHoras + ":" + restoMinutos + ":" + totalSegundos);
	sc6.close();

	
*/	
//Ejercicio 7
/*	
	Scanner sc7 = new Scanner(System.in);
	System.out.print("Introduce dinero a sacar: ");
	int dineros = sc7.nextInt();

		int eu500 = dineros / 500;
			int	resultado500 = dineros - (eu500 * 500);
			
		int eu200 = resultado500 / 200;
			int resultado200 = resultado500 - (eu200 * 200);
			
		int eu100 = resultado200 / 100;
			int resultado100 = resultado200 - (eu100*100);
					
		int eu50 = resultado100 / 50;
			int resultado50 = resultado100 - (eu50*50);
					
		int eu20 = resultado50 / 20;
			int resultado20 = resultado50 - (eu20*20);
		
		int eu10 = resultado20 / 10;
			int resultado10 = resultado20 - (eu10*10);
		
		int eu5 = resultado10 / 5;
			//int resultado5=resultado10-(eu5*5);
		 		
		//System.out.print(resultado500+" "+resultado200+" "+resultado100+" "+
		//resultado50+" "+resultado20+" "+resultado10+" "+resultado5);
		System.out.print(eu500 + " billetes de 500\n" +  eu200 + " billetes de 200\n" + eu100 + " billetes de 100\n" + eu50 + " billetes de 50\n" + eu20 + " billetes de 20\n" + eu10 + " billetes de 10\n" + eu5 + " billetes de 5");
	sc7.close();
*/
/*	
//Ejercicio 8 Pedir 3 numeros y comprobar si estan ordenados

	Scanner sc8 = new Scanner(System.in);
	System.out.print("Introduce 1º nº: ");
	int num8_x = sc8.nextInt();
	System.out.print("Introduce 2º nº: ");
	int num8_y = sc8.nextInt();
	System.out.print("Introduce 3º nº: ");
	int num8_z = sc8.nextInt();
	
	String resultado8_xyz = (num8_x < num8_y && num8_y < num8_z) || (num8_x > num8_y && num8_y > num8_z) ? "ESTAN ORDENADOS" : "NO ESTAN ORDENADOS";
	System.out.print(resultado8_xyz);
	sc8.close();
*/
/*
//Ejercicio 11 Conversión de tipos: convertir un entero a un char y comprobarlo con la tabla ASCII.
	
	Scanner sc11 = new Scanner(System.in);
	System.out.print("Introduce un numero del 1 al 255: ");
	int entero = sc11.nextInt();
	System.out.print((char)entero);
	sc11.close();
*/
/*
//Ejercicio 12 Escribe un programa que muestre tu nombre por pantalla
	
	Scanner sc12 = new Scanner(System.in);
	System.out.print("Escribe tu nombre: ");
	String nombre = sc12.nextLine();
	System.out.print("Tu nombre es: " + nombre);
	sc12.close();
*/
	
//Ejercicio 13 3 Modifica el programa anterior para que además se muestre tu
	//dirección y tu número de teléfono. Asegúrate de que los datos se
	//muestran en líneas separadas.
/*	
	Scanner sc12 = new Scanner(System.in);
	System.out.print("Escribe tu nombre: ");
	String nombre = sc12.nextLine();
		
		System.out.print("Escribe tu dirección: ");
		String direccion = sc12.nextLine();
		System.out.print("Escribe tu telefono: ");
		String telefono = sc12.nextLine();
		
	System.out.print("Tu nombre es: " + nombre + "\nTu direccion es: " + direccion + "\nTu telefono es: " + telefono);
	sc12.close();
	
*/
/*	
//Ejercicio 15 	Escribe un programa que muestre tu horario de clase. Puedes
	//usar espacios o tabuladores para alinear el texto.
	System.out.println("BBDD\tFOL\tPROG\tPROG\tLM\n"
			+ "FOL\tFOL\tPROG\tPROG\tBBDD\n"
			+ "ENT\tSIF\tSIF\tBBDD\tPROG\n"
			+ "ENT\tBBDD\tSIF\tBBDD\tPROG\n"
			+ "PROG\tBBDD\tLM\tENT\tSIF\n"
			+ "PROG\tLM\tLM\tSIF\tSIF");
*/
	//System.out.printf("%s%10s%10s%10s%10s\n","Lunes","Martes","Miercoles","J","V");
	//System.out.printf("%s%10s%10s%10s%10s\n","Lunes","Martes","Miercoles","J","V");
	//float numero = 12.456789f;
	//System.out.printf("%.2f", numero);
}
}

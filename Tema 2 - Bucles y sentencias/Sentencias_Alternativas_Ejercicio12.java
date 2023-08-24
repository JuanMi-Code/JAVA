package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio12 {

	public static void main(String[] args) {
		ejercicio12();
	}
	private static void ejercicio12() {
		
		Scanner sc12 = new Scanner(System.in);
		System.out.println("Introduce la hora: ");
		int hora = sc12.nextInt();
		System.out.println("Introduce los minutos: ");
		int minuto = sc12.nextInt();
		System.out.println("Introduce los segundos: ");
		int segundo = sc12.nextInt();
		
		int sumado = segundo + 1;
		
		//	if (sumado == 60) {
		//		minuto += 1;
		//		segundo *= 0;
		//		System.out.println(hora + ":" + minuto + ":" + segundo);
				
			//	if (minuto == 60) {
			//		hora+=1;
			//		minuto*=0;
			//			System.out.println(hora + ":" + minuto + ":" + segundo);
			//	}
			//}
		if (hora >=0 && minuto >=0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {	
		
			if (sumado == 60 && minuto == 59) {
				minuto *= 0;
				segundo *= 0;
				hora+=1;
				System.out.println(hora + ":" + minuto + ":" + segundo);
				
			} else if (sumado == 60) {
				minuto += 1;
				segundo *= 0;
				System.out.println(hora + ":" + minuto + ":" + segundo);
				
			} else {
				segundo+=1;
				System.out.println(hora + ":" + minuto + ":" + segundo);}
		} else {System.out.println("Valores no validos");}
		
		sc12.close();
	}
}

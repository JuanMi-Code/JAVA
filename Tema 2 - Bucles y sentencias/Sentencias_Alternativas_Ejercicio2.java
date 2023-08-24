package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejercicio2 {

	public static void main(String[] args) {
		ejercicio2();
	}
	private static void ejercicio2() {
		
		Scanner sc2 = new Scanner(System.in);
			System.out.println("Introducir HORAS: ");
		int h = sc2.nextInt();
			System.out.println("Introducir MINUTOS: ");
		int m = sc2.nextInt();
			System.out.println("Introducir SEGUNDOS: ");
		int s = sc2.nextInt();
		
	if (h < 0 || m<0 || s<0) {System.out.println("No valido");
	}else {
		
		int seg = (h * 3600) + (m * 60) + s;
		
			int minutos = seg / 60;
			int horas = minutos / 60;
		
			int restoMinutos = minutos %60;
			int restoHoras = horas %60;
			int totalSegundos = seg - (minutos*60);
		
		System.out.println(restoHoras + " horas, " + restoMinutos + " minutos, " + totalSegundos + " segundos");
		sc2.close();
	}
	}
}
/*
int minutos = segundos / 60;
int horas = minutos / 60;

int restoMinutos = minutos % 60;
int restoHoras = horas % 60;
int totalSegundos = segundos - (minutos * 60);

System.out.print(restoHoras + ":" + restoMinutos + ":" + totalSegundos);
sc6.close();
*/

package com.venancio.daw.tema2;

import java.util.Scanner;

public class Sentencias_Alternativas_Ejericio6 {

	public static void main(String[] args) {
		ejercicio6();
	}
	private static void ejercicio6() {
		
		Scanner sc6 = new Scanner(System.in);
		
		System.out.println("Introduce un día: ");
			int dia = sc6.nextInt();
		System.out.println("Introduce un mes: ");
			int mes = sc6.nextInt();
		System.out.println("Introduce un año: ");
			int año = sc6.nextInt();
		
		if (dia >= 1 && dia < 32 && mes >= 1 && mes < 13 && año > 0 && año < 9999) {
			
			if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
				// meses con 31 dias	

				//meses con 3o dias	

				//meses con 28	
			
			switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					dia+=1;
						if (dia == 32) {
						dia = 1;
						mes+=1;
						System.out.println(dia + " " + mes + " " + año);
						} else {System.out.println(dia + " " + mes + " " + año);}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					dia+=1;
						if (dia == 31) {
							dia = 1;
							mes+=1;
							System.out.println(dia + " " + mes + " " + año);
						} else {System.out.println(dia + " " + mes + " " + año);}
					break;
				case 2:
					dia+=1;
						if (dia == 29) {
						dia = 1;
						mes+=1;
						System.out.println(dia + " " + mes + " " + año);
						} else {System.out.println(dia + " " + mes + " " + año);}
					break;
				case 12:
					dia+=1;
						if (dia == 32) {
						dia = 1;
						mes=1;
						año+=1;
						System.out.println(dia + " " + mes + " " + año);
						} else {System.out.println(dia + " " + mes + " " + año);}
					break;
			}
			} else {System.out.println("Alguno de los valores no es valido");}
	
		}
	}		
}

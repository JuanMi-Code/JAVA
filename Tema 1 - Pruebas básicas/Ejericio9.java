package com.venancio.daw.tema1;

import java.util.Scanner;

public class Ejericio9 {
	public static void main (String[] args) {

//Ejercicio9	(ecuacion 2 grado)	
		Scanner sc9 = new Scanner(System.in);
		System.out.print("Introduce un coeficiente A: ");
		int coeficienteA = sc9.nextInt();
		System.out.print("Introduce un coeficiente B: ");
		int coeficienteB = sc9.nextInt();
		System.out.print("Introduce un coeficiente C: ");
		int coeficienteC = sc9.nextInt();
		
		System.out.print(coeficienteA + "X^2"+ " + "+coeficienteB+ "X"+ " + "
						+coeficienteC + " = 0 \n");
		
		int resultado1 = (coeficienteB*coeficienteB)-4*coeficienteA*coeficienteC;
		
		double resultado2 = Math.sqrt(resultado1);
		
		double resultado3_1 = (-1*coeficienteB)+resultado2;
			double resultado3_1_1 = resultado3_1 / (2*coeficienteA);
		double resultado3_2 = (-1*coeficienteB)-resultado2;
			double resultado3_2_1 = resultado3_2 / (2*coeficienteA);
			
			//int a = sc9.nextInt();
			//int b = sc9.nextInt();
			//int c = sc9.nextInt();
			//res1 = (-b + Math.sqrt(Math.pow(b, 2) -4*a*c))/(2*a);
			//res2 = (-b - Math.sqrt(Math.pow(b, 2) -4*a*c))/(2*a);
			
		//System.out.print("X= "+resultado3_1_1 + "\nX= "+resultado3_2_1);
		
		String de_if = resultado1 <=0 ?  "No existe": ("X= "+resultado3_1_1 + "\nX= "+resultado3_2_1);
		System.out.print(de_if);
		
		sc9.close();
}
}

package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
	
		ejercicio11();
	}
	
	private static void ejercicio11() {
	
		Scanner sc11 = new Scanner(System.in);
		System.out.println("Introducir numero 1: ");
			int a = sc11.nextInt();
		System.out.println("Introducir numero 2: ");
			int b = sc11.nextInt();
		System.out.println("Introducir numero 3: ");
			int c = sc11.nextInt();
			
			if (a>b&&a>c) {
				if (b>c) {
					System.out.println(c +","+ b +","+ a);
				} else {System.out.println(b+","+c+","+a);}
			} else if (b>a&&b>c) {
				if (a>c) {
					System.out.println(c+","+a+","+b);
				} else {System.out.println(a +","+ c +","+ b);}
			} else if (c>a&&c>b) {
				if (a>b) {
					System.out.println(b+","+a+","+c);
				} else {System.out.println(a+","+b+","+c);}
			} else {System.out.println("ERROOOOOOR");}
		
/*			if (a>b&&a>c) {
				if (b>c) {
					System.out.println(a +","+ b +","+ c);
				} else {System.out.println(a+","+c+","+b);}
			} else if (b>a&&b>c) {
				if (a>c) {
					System.out.println(b+","+a+","+c);
				} else {System.out.println(b +","+ c +","+ a);}
			} else if (c>a&&c>b) {
				if (a>b) {
					System.out.println(c+","+a+","+b);
				} else {System.out.println(c+","+b+","+a);}
			} else {System.out.println("ERROOOOOOR");}
	*/		
			
	/*		if (a < b && b < c) {
				System.out.println(a +","+ b + "," + c);
			}else if (a > b && b > c) {
				System.out.println(a + "," + b +","+ c);
			}else if (a == b) {
				System.out.println(a + " = "+ b + " = " + c);
			}else {
				System.out.println("Errooooooor");
			}
	*/	sc11.close();
		
	}
}

package com.venancio.daw.tema2;

public class Bucles_Ejercicio11 {

	public static void main(String[] args) {
		ejercicio11();
	}
	private static void ejercicio11() {
		
		String asterisco = "*";
		int espacios = 3;
		int espaciosIzq = espacios;
		int espaciosDrc = espacios;
		char espacioblanco = ' ';
		
		for (int i=0; i!=4; i++) {
			
			for(int a=0; a<=espaciosIzq; a++) {
				System.out.print(" ");
			}
			espaciosIzq-=1;
			
			System.out.print(asterisco);
			asterisco+="**";
			
			for (int b=0; b<=espaciosDrc; b++) {
				System.out.print(" ");
			}
			espaciosDrc-=1;
			System.out.println();
			
		}
	
		
		for (int c=0; c<3; c++) {
			
			StringBuilder hola = new StringBuilder(asterisco);
			hola.setCharAt(0, espacioblanco);
			hola.setCharAt(asterisco.length()-1, espacioblanco);
			
			asterisco = hola.toString();
			System.out.print(asterisco);
			System.out.println();
		}
			
		
		/*for (int punto=0; punto < numero*numero; punto++ ) {
			
			if (punto < (numero/2) || punto> numero/2) {
				System.out.print(" ");
			}else if (punto == numero/2) {
				System.out.print("*");
			}
			System.out.println();

		}
		*/
		
	}
}

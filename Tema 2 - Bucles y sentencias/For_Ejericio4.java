package com.venancio.daw.tema2;

public class For_Ejericio4 {

	public static void main(String[] args) {
		ejercicio4();
	}
	private static void ejercicio4() {
			
		for (int a = 0; a < 11; a++) {
			
			for (int i=0; i<11; i++) {
			
				System.out.println(a + " x " + i + " = " + a*i);
			}
			System.out.println("\n");
		}	
	}
}

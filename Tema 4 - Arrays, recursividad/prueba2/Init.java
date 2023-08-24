package prueba2;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		
	/*	matriz de 5 elementos (5 filas) para la primera dimension 
		y n columnas (las metidas por teclado)
		van a tener valores aleatorios del 0 al 10 sin 
		incluir el 10 (del 0 al 9)
	*/	
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un numero de columnas: ");
		int columnas = Integer.valueOf(sc.nextLine());
		
		//int columnas = 6;
		//int filas = 5;
		int [][] matriz = new int[5][columnas];
		
		for (int i=0; i < matriz.length; i++) {
			
			for (int j=0; j<matriz[i].length; j++) {
				
				double aleatorio = Math.random()*9;
				matriz [i][j] = (int)aleatorio;
				//matriz[i][j] = (int) (Math.random()*10);
			}
		}
		//pintamos
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	/*	for (int [] fila : matriz) {
			for (int elem : fila ) {
				System.out.print(elem+" ");
			}
			System.out.println();
		}
	*/		//System.out.println(valor);
	}
}

package Ejercicios1;

import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int [][] arr = new int [5][5];
		
		arr[0][0]=15;arr[0][1]=8;arr[0][2]=1;arr[0][3]=24;arr[0][4]=17;
		arr[1][0]=16;arr[1][1]=14;arr[1][2]=7;arr[1][3]=5;arr[1][4]=23;
		arr[2][0]=22;arr[2][1]=20;arr[2][2]=13;arr[2][3]=6;arr[2][4]=4;
		arr[3][0]=3;arr[3][1]=21;arr[3][2]=19;arr[3][3]=12;arr[3][4]=10;
		arr[4][0]=9;arr[4][1]=2;arr[4][2]=25;arr[4][3]=18;arr[4][4]=11;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();	
		}
		
		//para las filas
		 int[] filas = new int[arr.length];
		 int contadorFilas=0;
			int columna=0;
			int fila=0;
			int suma =0;
			//accedemos al contenido del array
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					//obtenemos los numeros, su suma, y los anadimos a la otra array
					if(i==fila) {
						filas[fila]+=arr[i][j];
					}
					contadorFilas++;
					//con esto hacemos que cuente por individual cada fila
					if (contadorFilas==arr.length){
						fila++;
						contadorFilas=0;
					}
				}
			}
		//para las columnas
			int[] columnas = new int[arr.length];
			//hacemos que se recorra el array TAMANO veces y que coja los valores de cada columna
			int contadorColumnas=0;
			while (contadorColumnas<arr.length) {
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						
						if(j==columna) {
							columnas[columna]+=arr[i][j];
						}
					}
				}
				columna++;
				contadorColumnas++;
			}
		//para las diagonales
			//diagonal de izquierda superior a derecha inferior
			int contadorDiagonal=0;
			int valorDiagonal=0;
	/*		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {	
				if(i==contadorDiagonal&&j==contadorDiagonal) {
					valorDiagonal+=arr[i][j];
					contadorDiagonal++;
				}
			}
			}
	*/		for (int i = 0; i < arr.length; i++) {
				valorDiagonal += arr[i][i];
			}
			//diagonal de derecha superior a izquierda inferior
			int contador1 = 0;
			int contador2 = arr.length-1;
			int valorDiagonal2 = 0;
			
			for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
						
				if(i==contador1&&j==contador2) {
					valorDiagonal2+=arr[i][j];
					contador1++;
					contador2--;
				}
			}
			}			
		//representamos
			boolean resultado;
		System.out.println("--------------------FILAS----------------------");
	/*	for (int i : filas) {
			System.out.println(i);
			if(i==valorDiagonal) {
				resultado = true;
			}else {
				resultado = false;
				break;
			}
		}
	*/	
		resultado = calculaDiagonal(filas,valorDiagonal);
		System.out.println("\n--------------------COLUMNAS----------------------");
	/*	for (int i : columnas) {
			System.out.print(i+" ");
			if(i==valorDiagonal) {
				resultado = true;
			}else {
				resultado = false;
				break;
			}
		}
	*/	System.out.println("\n--------------------DIAGONALES----------------------");
		resultado = calculaDiagonal(columnas,valorDiagonal);
		System.out.println(valorDiagonal + " " + valorDiagonal2);
		if(valorDiagonal2==valorDiagonal) {
			resultado = true;
		}else {
			resultado = false;
		}
		//booleano que nos devuelve el texto
		if(resultado) {
			System.out.println("\nes un cuadrado magico");
		}else {
			System.out.println("no es un cuadrado magico");
		}		
	}
	
	public static boolean calculaDiagonal(int array[], int valor) {
		for (int i : array) {
			if(i==valor) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	} 
}
package examen;

import java.util.Iterator;
import java.util.Random;

public class Examen45 {
	
	public static void main(String[] args) {
		
		int[][]arr = new int[0][0];
		System.out.println("Ejercicio1: \n");
		int[][]arrBi = ejercicio1(arr);
		System.out.println("\nEjercicio2: \n");
		int[]arrUni = ejercicio2(arrBi);
		System.out.println("\nEjercicio3: \n");
		int[]arrMayor = ejercicio3(arrBi,arrUni);
		Pila pila = ejercicio4(arrMayor);
		
		pila.print();
		
	}
	
	/**
	 * Método que crea un array bidimensional y lo muestra.
	 */
	public static int[][] ejercicio1(int[][]arr) {
		
		Random r = new Random();
		int filas = r.nextInt(6)+3;
		int columnas = 10;
		arr = new int [filas][columnas];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				Random r2 = new Random();
				int numero = r2.nextInt(9)+1;
				arr[i][j] = numero;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}System.out.println();
		}
		return arr;
	}
	
	public static int[] ejercicio2(int[][]arr) {
		int contador = 0;
		for (int i = 0; i < arr.length; i++) {
			contador++;
		}
		int[]arrUni=new int[contador];
		
		int cont =-1;
		int suma = 0;
		
		for (int i = 0; i < arr.length; i++) {
			cont++;
			for (int j = 0; j < arr[i].length; j++) {
				if(i==cont) {
					suma+=arr[i][j];
				}	
			}
			arrUni[cont]=suma;
			suma = 0;	
		}
		System.out.println("Array de las sumas: ");
		for (int i = 0; i < arrUni.length; i++) {
			System.out.print(arrUni[i]+" ");
		}
		System.out.println();
		return arrUni;
	}
	
	public static int[] ejercicio3(int[][]arrBi, int[] arrUni) {		
		
		int numMayor = 0;
		int filaMayor = 0;
		for (int i = 0; i < arrUni.length; i++) {
			if(arrUni[i]>numMayor) {
				numMayor=arrUni[i];
				filaMayor=i;
			}
		}
		
		int arrMayor[] = new int[10];
		int contador = 0;
		
		for (int i = 0; i < arrBi.length; i++) {
			for (int j = 0; j < arrBi[i].length; j++) {
				if(i==filaMayor) {
					arrMayor[contador]=arrBi[i][j];
					contador++;
				}
			}
		}
		for (int i = 0; i < arrMayor.length; i++) {
			System.out.print(arrMayor[i]+" ");
		}
		
		//ordenacion en burbuja
		for (int i = 0; i < arrMayor.length; i++) {
			for (int j = 0; j < arrMayor.length-1; j++) {
				if(arrMayor[j]>arrMayor[j+1]) {
				int aux = arrMayor[j];
				arrMayor[j]=arrMayor[j+1];
				arrMayor[j+1] = aux;
				}
			}
		}
		//muestro ordenado
		System.out.println();
		System.out.println("Ordenado:");
		for (int i = 0; i < arrMayor.length; i++) {
			System.out.print(arrMayor[i]+" ");
		}
		return arrMayor;
	}
	 public static Pila ejercicio4(int[] arr) {
		 
		 //Aquí agregamos los elementos del array a la pila
		 Pila pila = new Pila();
		 for (int i = 0; i < arr.length; i++) {
			pila.insertar(arr[i]);
		}
		 return pila;
		 
	 }
	
	
	
}

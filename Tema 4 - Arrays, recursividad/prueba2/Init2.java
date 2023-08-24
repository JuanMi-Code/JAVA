package prueba2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Init2 {

	public static void main(String[] args) {
		
		//2 matrices columnas y filas variables metemos 2 y es de (2*2)
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un valor para el tamaño de las matrices: ");
		int valor = Integer.valueOf(sc.nextLine());
		
		//valores 1
		//int valor = 2;
		int valor1 = 0;
		int [][] arr1= new int [valor] [valor];
		for (int i=0; i < arr1.length; i++) {
			for (int j=0; j<arr1[i].length;j++) {
				
				System.out.println("Mete numerito para la 1º matriz: ");
				arr1 [i][j] = Integer.valueOf(sc.nextLine());
				//Para que los valores los meta aleatoriamente
				//arr1 [i][j] = (int) (Math.random()*10);
				valor1 = arr1 [i][j]; 
			}
		}
		
		System.out.println("-----------Segunda matriz-----------");
		
		//valores 2
		int valor2 = 0;
		int [][] arr2= new int [valor] [valor];
		for (int i=0; i < arr2.length; i++) {
			for (int j=0; j<arr2[i].length;j++) {
				
				System.out.println("Mete numerito para la segunda matriz: ");
				arr2 [i][j] = Integer.valueOf(sc.nextLine());
				//Para que los valores los meta aleatoriamente
				//arr2 [i][j] = (int) (Math.random()*10);
				valor2 = arr2 [i][j];
			}
		}
		//suma
		int [][] arr3= new int [valor] [valor];
		for (int i=0; i < arr3.length; i++) {
			for (int j=0; j<arr3[i].length;j++) {
				
				arr3 [i][j] = valor1 + valor2;				
			}
		}
		
		mostrarMatrices(arr1, arr2, arr3);
	/*	System.out.println("-----------RESULTADO-----------");
		
		//sacar valor 1
				for (int i=0; i < arr1.length; i++) {
					for (int j=0; j<arr1[i].length;j++) {
						
						System.out.print(arr1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
		//sacar valor 2
		for (int i=0; i < arr2.length; i++) {
			for (int j=0; j<arr2[i].length;j++) {
				
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//sacar suma
		for (int i=0; i < arr3.length; i++) {
			for (int j=0; j<arr3[i].length;j++) {
				
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	*/
	}
	
	public static void mostrarMatrices(int [][] arr1, int [][] arr2, int [][] arr3) {
		
System.out.println("-----------RESULTADO-----------");
		
		//sacar valor 1
				for (int i=0; i < arr1.length; i++) {
					for (int j=0; j<arr1[i].length;j++) {
						
						System.out.print(arr1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
		//sacar valor 2
		for (int i=0; i < arr2.length; i++) {
			for (int j=0; j<arr2[i].length;j++) {
				
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//sacar suma
		for (int i=0; i < arr3.length; i++) {
			for (int j=0; j<arr3[i].length;j++) {
				
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

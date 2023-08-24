package Ejercicios1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de personas: ");
		int n = Integer.valueOf(sc.nextLine());
		
		Ejercicio3_Persona [] arr = new Ejercicio3_Persona[n];
		
		for (int i=0;i<arr.length;i++) {
			System.out.println("Introduce Nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduce Direccion");
			String direccion = sc.nextLine();
			
			arr[i]=new Ejercicio3_Persona(nombre, direccion);
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------");
		//para buscar la direccion
		String buscaDireccion="calle";
		String buscaNombre="alvaro";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getDireccion().equals(buscaDireccion)||arr[i].getNombre().equals(buscaNombre)) {
				System.out.println(arr[i].getDireccion());
				System.out.println(arr[i].getNombre());
			}
		}
		
	}
}

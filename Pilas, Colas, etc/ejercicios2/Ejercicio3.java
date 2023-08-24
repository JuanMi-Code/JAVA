package ejercicios2;

import java.util.Stack;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Stack<Integer> pila = new Stack<>();
		
		//número aleatorio que indica el tamano de la lista
		int numElementos = (int) (Math.random()*10+1);
				
		//anadimos los elementos a la lista
		for (int i = 0; i < numElementos; i++) {
					
			//números aleatorios entre -99 y 99
			int alea = (int) (Math.random()*100);
			int signo = (int) (Math.random()*2);
				if(signo==0) {
					alea*= -1;
				}
			//anadimos a la lista
			pila.push(alea);
		}
		
		mostrarPila(pila);
		
		//insertar en pila
		int numero = 555;
			System.err.println("\nInsertamos en la pila el numero "+numero);
		insertarPila(pila, numero);
			mostrarPila(pila);
		
		//extraer en pila
			System.err.println("\nExtraemos en la pila");
		extraerPila(pila);
			mostrarPila(pila);
			
		//obtener sin extraer
			System.err.println("\nExtraemos en la pila sin eliminar");
		obtenerPila(pila);
			mostrarPila(pila);
		
		//obtener tamano
			System.err.println("\nEl tamano de la pila es: ");
		obtenerTamano(pila);
		
		//imprimir
		//mostrarPila(pila);
		
	}//métodos
	
	public static void mostrarPila(Stack<Integer> pila) {
		
		System.out.println("La pila contiene los siguientes datos: ");
		for (int i = 0; i < pila.size(); i++) {
			System.out.print(pila.get(i)+"  ");
		}
		System.out.println();
	}
	public static void insertarPila(Stack<Integer> pila, int numero) {
		pila.push(numero);
	}
	public static void extraerPila(Stack<Integer> pila) {
		System.out.println(pila.pop());
	}
	public static void obtenerPila(Stack<Integer> pila) {
		System.out.println(pila.peek());
	}
	public static void obtenerTamano(Stack<Integer> pila) {
		System.out.println(pila.size());
	}
	
	
}

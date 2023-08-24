package ejercicios2;

import java.util.LinkedList;

public class Ejercicio1 {
	public static void main(String[] args) {

		LinkedList<Integer> listaEnlazada = new LinkedList<>();
		
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
			listaEnlazada.add(alea);
		}
		//mostramos la lista
		mostrarLista(listaEnlazada);				
		
		//método para ver el primer elemento
		System.err.println("\nEl primer elemento es: "+primerElem(listaEnlazada));
		
		//método para ver el último elemento
		System.err.println("El último elemento es: "+últimoElem(listaEnlazada));
		
		//insertamos al principio y mostramos
		int número=100;
			System.err.println("\nInsertamos el número "+número+" al principio");
		insertarPrincipio(listaEnlazada, número);
		mostrarLista(listaEnlazada);
		
		//insertamos al final y mostramos
		int número2=101;
			System.err.println("\nInsertamos el número "+número2+" al final");
		insertarFinal(listaEnlazada, número2);
		mostrarLista(listaEnlazada);
		
		//insertamos en posición dada
		int número3 = 555;
		int posición = 1;
			System.err.println("\nInsertamos el número "+número3+" en la posición "+ posición);
		insertarposición(listaEnlazada, número3, posición);
		mostrarLista(listaEnlazada);
		
		//buscamos por valor
		int valor = 101;
			System.err.println("\nBuscamos el número "+valor+" en la lista");
		System.out.println(buscarValor(listaEnlazada, valor));
		
		//buscamos por posición
		int posición2 = 3;
			System.err.println("\nBuscamos la posición "+posición2+" en la lista");
		System.out.println(buscarposición(listaEnlazada, posición2));
		
		//eliminar elemento dado un valor
		int eliminar = 101;
			System.err.println("\nEliminarmos el valor "+eliminar+" de la lista");
		eliminarValor(listaEnlazada, eliminar);
		mostrarLista(listaEnlazada);
		
		//eliminar elemento dada una posición
		int posición3 = 0;
			System.err.println("\nEliminarmos el valor en la posición "+posición3+" de la lista");
		eliminarposición(listaEnlazada, posición3);
		mostrarLista(listaEnlazada);
		
		//para ver la lista completa
		//mostrarLista(listaEnlazada);
	}
	
	public static void mostrarLista(LinkedList<Integer> listaEnlazada) {
		System.out.println("\nLa lista contiene los siguientes elementos:");
		for (int i = 0; i < listaEnlazada.size(); i++) {
			System.out.print(listaEnlazada.get(i)+"  ");	
		}
		System.out.println();
	}
	public static int primerElem(LinkedList<Integer> listaEnlazada) {
		return (int) listaEnlazada.get(0);
	}
	public static int últimoElem(LinkedList<Integer> listaEnlazada) {
		return (int) listaEnlazada.get(listaEnlazada.size()-1);
	}
	public static void insertarPrincipio(LinkedList<Integer> listaEnlazada, int número) {
		listaEnlazada.addFirst(número);
	}
	public static void insertarFinal(LinkedList<Integer> listaEnlazada, int número) {
		listaEnlazada.addLast(número);
	}
	public static void insertarposición(LinkedList<Integer> listaEnlazada, int número, int posición) {
		listaEnlazada.add(posición, número);
	}
	public static int buscarValor(LinkedList<Integer> listaEnlazada, int valor) {
		return listaEnlazada.get(listaEnlazada.indexOf(valor));
	}
	public static int buscarposición(LinkedList<Integer> listaEnlazada, int posición) {
		return listaEnlazada.get(posición);
	}
	public static void eliminarValor(LinkedList<Integer> listaEnlazada, int valor) {
		listaEnlazada.remove(listaEnlazada.indexOf(valor));
	}
	public static void eliminarposición(LinkedList<Integer> listaEnlazada, int posición) {
		listaEnlazada.remove(posición);
	}
}

package ejercicios2;
import java.util.ArrayList;

public class Ejercicio1o2 {
	//El nombre es asi porque no se si este es el ejercicio 1 o el 2 

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<>();		

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
			lista.add(alea);
		}
		//mostramos la lista
		mostrarLista(lista);				
		
		//método para ver el primer elemento
		System.err.println("\nEl primer elemento es: "+primerElem(lista));
		
		//método para ver el ultimo elemento
		System.err.println("El ultimo elemento es: "+ultimoElem(lista));
		
		//insertamos al principio y mostramos
		int número=100;
			System.err.println("\nInsertamos el número "+número+" al principio");
		insertarPrincipio(lista, número);
		mostrarLista(lista);
		
		//insertamos al final y mostramos
		int número2=101;
			System.err.println("\nInsertamos el número "+número2+" al final");
		insertarFinal(lista, número2);
		mostrarLista(lista);
		
		//insertamos en posición dada
		int número3 = 555;
		int posición = 1;
			System.err.println("\nInsertamos el número "+número3+" en la posición "+ posición);
		insertarposición(lista, número3, posición);
		mostrarLista(lista);
		
		//buscamos por valor
		int valor = 101;
			System.err.println("\nBuscamos el número "+valor+" en la lista");
		System.out.println(buscarValor(lista, valor));
		
		//buscamos por posición
		int posición2 = 3;
			System.err.println("\nBuscamos la posición "+posición2+" en la lista");
		System.out.println(buscarposición(lista, posición2));
		
		//eliminar elemento dado un valor
		int eliminar = 101;
			System.err.println("\nEliminarmos el valor "+eliminar+" de la lista");
		eliminarValor(lista, eliminar);
		mostrarLista(lista);
		
		//eliminar elemento dada una posición
		int posición3 = 0;
			System.err.println("\nEliminarmos el valor en la posición "+posición3+" de la lista");
		eliminarposición(lista, posición3);
		mostrarLista(lista);
		
		//para ver la lista completa
		//mostrarLista(lista);
	}
	
	public static void mostrarLista(ArrayList<Integer> lista) {
		System.out.println("\nLa lista contiene los siguientes elementos:");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i)+"  ");	
		}
		System.out.println();
	}
	public static int primerElem(ArrayList<Integer> lista) {
		return (int) lista.get(0);
	}
	public static int ultimoElem(ArrayList<Integer> lista) {
		return (int) lista.get(lista.size()-1);
	}
	public static void insertarPrincipio(ArrayList<Integer> lista, int número) {
		lista.add(0, número);
	}
	public static void insertarFinal(ArrayList<Integer> lista, int número) {
		lista.add(lista.size(), número);
	}
	public static void insertarposición(ArrayList<Integer> lista, int número, int posición) {
		lista.add(posición, número);
	}
	public static int buscarValor(ArrayList<Integer> lista, int valor) {
		return lista.get(lista.indexOf(valor));
	}
	public static int buscarposición(ArrayList<Integer> lista, int posición) {
		return lista.get(posición);
	}
	public static void eliminarValor(ArrayList<Integer> lista, int valor) {
		lista.remove(lista.indexOf(valor));
	}
	public static void eliminarposición(ArrayList<Integer> lista, int posición) {
		lista.remove(posición);
	}
}

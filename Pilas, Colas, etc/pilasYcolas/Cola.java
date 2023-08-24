package pilasYcolasProfe;

import ejercicios2_1.Nodo;

public class Cola {
	
	// null <- ultimo <- penúltimo <- antepenúltimo <- ... <- primero
	//  ^														|
	//  |														v
	// encolar												  desencolar
	
	private Nodo primero; // Primero en salir
	private Nodo ultimo; // Último en salir
	
	private int size;
	
	public Cola() {
		this.primero = this.ultimo = null;
		this.size = 0;
	}
	
	/**
	 * Comprueba si la cola está o no vacía
	 * @return true si la cola está vacía.
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * Inserta un elemento al final de la cola
	 * @param info del elemento que se va a introducir en la cola
	 */
	public void enqueue(int info) {
		Nodo nuevo = new Nodo(info);
		if(isEmpty()) {
			primero = nuevo;
			ultimo = nuevo;
		} else {
			ultimo.setSig(nuevo);
			ultimo = nuevo;
		}
		size++;
	}
	
	
	/**
	 * Extrae un elemento del principio de la cola
	 * @param info del elemento que se va a extraer de la cola
	 */
	public int dequeue() {
		if(!isEmpty()) {
			int info = primero.getInfo();
			primero = primero.getSig();
			size--;
			return info;
		}
		return Integer.MIN_VALUE;
	}
	
	/**
	 * Extrae un elemento del principio de la cola sin eliminarlo
	 * @param info del elemento que se va a extraer de la cola
	 */
	public int front() {
		if(!isEmpty()) {
			return primero.getInfo();
		}
		return Integer.MIN_VALUE;
	}
	
	
	
	/**
	 * Imprime la información de la cola
	 */
	public void print() {
		System.out.println("\nLa cola contiene: ");
		if(!isEmpty()) {
			System.out.print("\"último\" ===> ");
			printElement(primero);
			System.out.print(" <=== \"primero\"\n");
		} else {
			System.out.println("La cola está vacía!!");
		}
	}
	
	private void printElement(Nodo nodo) {
		if(nodo.equals(ultimo)) {
			System.out.print(nodo.getInfo());
		} else {
			printElement(nodo.getSig());
			System.out.print(" <-- " + nodo.getInfo());
		}
	}

}

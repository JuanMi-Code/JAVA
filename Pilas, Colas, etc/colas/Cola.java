package colas;

import ejercicios2_1.Nodo;

public class Cola {

	private Nodo primero;
	private Nodo ultimo;
	
	private int size;
	
	public Cola() {
		this.primero=this.ultimo=null;
		this.size=0;
	}
	
	public boolean isEmpty() {
		return size==0;
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
		}else {
			ultimo.setSig(nuevo);
			ultimo = nuevo;
		}
		size++;
	}
	/**
	 * Extrae un elemento del principio de la cola
	 * @return info del elemento que se va a extraer de la cola
	 */
	public int dequeue() {
		if(!isEmpty()) {
			//Solo 1 elemento en la cola
			int info = primero.getInfo();
			primero = primero.getSig();
			size--;
			return info;
		}
			return Integer.MIN_VALUE;
	}
	
	/**
	 * 
	 * @return
	 */
	public int front() {
		if(!isEmpty()) {
			return primero.getInfo();
		}
		return Integer.MIN_VALUE;
	}
	
	public void print() {
		System.out.println("\nLa cola contiene: ");
		if(!isEmpty()) {
/*			Nodo aux = primero;
			while(aux.getSig() != null) {
				System.out.print(aux.getInfo() + " - ");
				aux = aux.getSig();
			}
*/			printElement(primero);
			//System.out.println(aux.getInfo());
		} else {
			System.out.println("La cola está vacía!!");
		}
	}
	
	private void printElement(Nodo nodo) {
		if(nodo.equals(ultimo)) {
			System.out.print(nodo.getInfo());
		}else {
			printElement(nodo.getSig());
			System.out.print(" <-- "+nodo.getInfo());
		}
	}
}

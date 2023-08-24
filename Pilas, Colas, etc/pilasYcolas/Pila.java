package pilasYcolasProfe;

import ejercicios2_1.Nodo;

public class Pila {

	private Nodo cima;
	private int size;
	
	public Pila() {
		this.cima = null;
		this.size = 0;
	}
	
	/**
	 * Comprueba si la pila está o no vacía
	 * @return true si la pila está vacía.
	 */
	public boolean isEmpty() {
		return cima == null;
	}
	
	/**
	 * Introduce un elemento en la pila (cima)
	 * @param info del elemento a introducir
	 */
	public void push(int info) {
		Nodo nuevo = new Nodo(info);
		if(!isEmpty()) {
			nuevo.setSig(cima);
		}
		cima = nuevo;
		this.size++;
	}
	
	/**
	 * Extrae la cima de la pila
	 * @return información de la cima.
	 */
	public int pop() {
		if(!isEmpty()) {
			Nodo borrar = cima;
			cima = cima.getSig();
			borrar.setSig(null);
			this.size--;
			return borrar.getInfo();
		}
		
		return Integer.MIN_VALUE;
	}
	
	/**
	 * Extrae la cima de la pila, sin eliminar ese elemento
	 * @return información de la cima.
	 */
	public int seek() {
		if(!isEmpty()) {
			return cima.getInfo();
		}
		
		return Integer.MIN_VALUE;
	}
	
	/**
	 * Obtiene el número de elementos de la pila
	 * @return número de elementos de la pila
	 */
	public int size() {
		return this.size;
	}
	
	/**
	 * Imprime la información de la pila
	 */
	public void print() {
		System.out.println("\nLa pila contiene: ");
		if(!isEmpty()) {
			Nodo aux = cima;
			System.out.println("\"cima\"");
			System.out.println("-----");
			while(aux.getSig() != null) {
				System.out.println("| " + aux.getInfo() + " |");
				aux = aux.getSig();
			}
			System.out.println("| " + aux.getInfo() + " |");
			System.out.println("-----\n");
		} else {
			System.out.println("La pila está vacía!!");
		}
	}
	
}

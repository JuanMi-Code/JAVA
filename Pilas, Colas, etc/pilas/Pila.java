package pilas;

import ejercicios2_1.Nodo;

public class Pila {

	private Nodo cima;
	private int size;
	
	public Pila() {
		this.cima = null;
		this.size=0;
	}
	
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
		cima=nuevo;
		this.size++;
	}
	/**
	 * Extrae la cima de la pila
	 * @return informacion de la cima
	 */
	public int pop() {
		if(!isEmpty()) {
			Nodo borrar = cima;
			cima = cima.getSig();
			borrar.setSig(null);
			this.size--;
			return borrar.getInfo();
		}else {
			return Integer.MIN_VALUE;
		}
	}
	/**
	 * Extrae la cima de la pila, sin eliminar ese elemento
	 * @return informacion de la cima
	 */
	public int seek() {
		if(!isEmpty()) {
			return cima.getInfo();
		}else {
			return Integer.MIN_VALUE;
		}
	}
	/**
	 * Obtiene el numero de elementos de la Pila
	 * @return numero de elementos de la pila
	 */
	public int size() {
		return this.size;
	}
	
	public void print() {
		System.out.println("La pila contiene: ");
		if(!isEmpty()) {
			Nodo aux = cima;
			while(aux.getSig() != null) {
				System.out.print(aux.getInfo() + " - ");
				aux = aux.getSig();
			}
			System.out.println(aux.getInfo());
		} else {
			System.out.println("La pila está vacía!!");
		}
	}
}


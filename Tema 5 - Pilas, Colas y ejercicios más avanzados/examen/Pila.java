package examen;

public class Pila {

	private Nodo cima;
	private int size;
	/**
	 * Para saber si la pila está vacía
	 * @return true si está vacía la pila, false si no lo está.
	 */
	public boolean isEmpty() {
		return this.cima == null;
	}
	/**
	 * Para insertar la información en la pila
	 * @param info que va a almacenar la pila
	 * @return true si lo completa.
	 */
	public boolean insertar(int info) {
		Nodo nuevo = new Nodo(info);
		if(!isEmpty()) {
			nuevo.setSig(this.cima);
			this.cima = nuevo;
			size++;
			return true;
		}else {
			this.cima=nuevo;
			size++;
			return true;
		}
	}
	/**
	 * Para eliminar el primer elemento de la pila
	 * @return true si extrae el primer elemento, false si la pila está vacía
	 */
	public boolean extraer() {
		if(!isEmpty()) {
			Nodo aux = this.cima;
			this.cima = aux.getSig();
			aux.setSig(null);
			aux=null;
			size--;
			return true;
		}
		return false;
	}
	
	public void print() {
		if(!isEmpty()) {
			Nodo aux = this.cima;
			while(aux.getSig()!=null) {
				System.out.println(aux);
				aux = aux.getSig();
			}System.out.println(aux);			
		}else {
			System.out.println("La pila está vacía");
		}
	}
	
}

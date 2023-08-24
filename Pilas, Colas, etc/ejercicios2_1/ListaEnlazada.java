package ejercicios2_1;

public class ListaEnlazada implements Lista {
	
	private Nodo primero;
	private int numElementos;
	
	public ListaEnlazada() {
		primero = null;
		numElementos = 0;
	}

	@Override
	public boolean isEmpty() {
		return primero == null;
	}

	@Override
	public int getFirst() {
		if(!isEmpty()) {
			return this.primero.getInfo();
		}
		return Integer.MIN_VALUE;
	}

	@Override
	public int getLast() {
		if(!isEmpty()) {
			Nodo aux = this.primero;
			while(aux.getSig() != null) {
				aux = aux.getSig();
			}
			
			return aux.getInfo();
		}
		return Integer.MIN_VALUE;
	}

	@Override
	public void insertAtBegin(int info) {
		Nodo nuevo = new Nodo(info);
//		if(isEmpty()) {
//			primero = nuevo;
//		} else {
//			nuevo.setSig(primero);
//			primero = nuevo;
//		}
		
		if(!isEmpty()) {
			nuevo.setSig(primero);
		} 
		primero = nuevo;
		this.numElementos++;
	}

	@Override
	public void insertAtEnd(int info) {
		Nodo nuevo = new Nodo(info);
		
		if(isEmpty()) {
			primero = nuevo;
		} else {
			Nodo aux = primero;
			while(aux.getSig() != null) {
				aux = aux.getSig();
			}
			aux.setSig(nuevo);
		}
		this.numElementos++;
	}

	@Override
	public void insertAtPosition(int info, int index) {
		if(index <= numElementos && index >= 0) {
			if(isEmpty()) {
				Nodo nuevo = new Nodo(info);
				primero = nuevo;
				this.numElementos++;
			} else if(index == numElementos) {
				insertAtEnd(info);
			} else {
				Nodo nuevo = new Nodo(info);
				Nodo aux = primero;
				for(int i = 1; i < index; i++) {
					aux = aux.getSig();
				}
				nuevo.setSig(aux.getSig());
				aux.setSig(nuevo);
				this.numElementos++;
			}
		}
	}

	@Override
	public boolean containsInfo(int info) {
		if(!isEmpty()) {
			Nodo aux = primero;
			while(aux.getSig() != null) {
				if(aux.getInfo() == info) {
					return true;
				}
				aux = aux.getSig();
			}
		}
		return false;
	}

	@Override
	public int getElementAt(int index) {
		if(index <= numElementos && index >= 0 && !isEmpty()) {
			Nodo aux = primero;
			for(int i = 0; i < index; i++) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		return Integer.MIN_VALUE;
	}

	@Override
	public boolean removeByInfo(int info) {
		if(!isEmpty()) {
			if(primero.getInfo() == info) {
				Nodo aux = primero;
				primero = primero.getSig();
				aux.setSig(null);
				aux = null;
				numElementos--;
				return true;
			} else {
				Nodo ant = primero;
				Nodo aux = primero.getSig();
				while(aux != null) {
					if(aux.getInfo() == info) {
						ant.setSig(aux.getSig());
						aux.setSig(null);
						aux = null;
						numElementos--;
						return true;
					}
					
					aux = aux.getSig();
					ant = ant.getSig();
				}
			}
		}
		return false;
	}

	@Override
	public boolean removeAt(int index) {
		if(index <= numElementos && index >= 0 && !isEmpty()) {
			if(index == 0) {
				Nodo aux = primero;
				primero = primero.getSig();
				aux.setSig(null);
				aux = null;
				numElementos--;
				return true;
			} else {
				Nodo ant = primero;
				Nodo aux = primero.getSig();
				
				for(int i = 1; i < index; i++) {
					aux = aux.getSig();
					ant = ant.getSig();
				}
				if(index != numElementos-1) {
					ant.setSig(aux.getSig());
					aux.setSig(null);
				} else {
					ant.setSig(null);
				}
				aux = null;
				numElementos--;
				return true;
			}
		}
		return false;
	}

	@Override
	public void print() {
		System.out.println("La lista contiene: ");
		if(!isEmpty()) {
			Nodo aux = primero;
			while(aux.getSig() != null) {
				System.out.print(aux.getInfo() + " - ");
				aux = aux.getSig();
			}
			System.out.println(aux.getInfo());
		} else {
			System.out.println("La lista está vacía!!");
		}
		
	}

	@Override
	public boolean clearList() {
		while(!isEmpty()) {
			removeAt(0);
		}
		return isEmpty();
	}

	@Override
	public int size() {
		return numElementos;
	}
}

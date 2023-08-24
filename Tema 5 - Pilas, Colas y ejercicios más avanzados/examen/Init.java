package examen;

public class Init {

	public static void main(String[] args) {
		
		//Aquí pruebo la pila
		
		Pila pila = new Pila();
		
		pila.insertar(1);
		pila.insertar(2);
		pila.insertar(3);
		pila.insertar(4);
		
		pila.print();
		System.out.println();
		pila.extraer();
		pila.extraer();
		pila.print();
		
		
		int[]arrMayor = {1,9,4,5};
		
		
		
	}
}

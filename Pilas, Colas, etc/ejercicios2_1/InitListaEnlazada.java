package ejercicios2_1;


public class InitListaEnlazada {
	
	public static void main(String[] args) {
		Lista le = new ListaEnlazada();
		
		le.print();
		
//		le.insertAtBegin(1);
//		le.insertAtBegin(2);
//		le.insertAtBegin(3);
//		le.insertAtBegin(4);
//		le.insertAtBegin(5);
//		le.insertAtBegin(6);
//		
//		le.print();
		
		le.insertAtEnd(7);
		le.insertAtEnd(8);
		le.insertAtEnd(9);
		le.insertAtEnd(10);
		le.insertAtEnd(11);
		le.insertAtEnd(12);
		
		le.print();
		
		System.out.println("La lista dispone de: " + le.size() + " elementos.");
		System.out.println("Primero: " + le.getFirst());
		System.out.println("Último: " + le.getLast());
		System.out.println("Índice 2 (tercer elemento): " + le.getElementAt(2));
		
		le.insertAtPosition(99, 2);
		System.out.println("Índice 2 (tercer elemento - nuevo): " + le.getElementAt(2));
		le.print();
		
		System.out.println("Contiene el valor 50? " + le.containsInfo(50));
		System.out.println("Contiene el valor 99? " + le.containsInfo(99));
		
		
		// Prueba de borrado de un elemento intermedio
		le.removeByInfo(99);
		le.print();
		
		// Prueba de borrado del primer elemento
		le.removeByInfo(7);
		le.print();
		
		// Prueba de borrado del último elemento
		le.removeByInfo(12);
		le.print();
		
		le.insertAtPosition(99, 2);
		le.insertAtPosition(99, 2);
		le.insertAtPosition(99, 2);
		le.insertAtPosition(99, 2);
		le.print();
		
		while(le.removeByInfo(99));
		le.print();
		
		// Prueba de borrado por posición
		// Prueba de borrado de un elemento intermedio
		le.removeAt(2);
		le.print();
		
		// Prueba de borrado del primer elemento
		le.removeAt(0);
		le.print();
		
		// Prueba de borrado del último elemento
		le.removeAt(le.size()-1);

		le.print();
		
		// Borrado en bulk
		le.insertAtEnd(7);
		le.insertAtEnd(8);
		le.insertAtEnd(9);
		le.insertAtEnd(10);
		le.insertAtEnd(11);
		le.insertAtEnd(12);
		
		while(le.removeAt(0));
		le.print();
		
		// Como el anterior pero con ClearList
		
		// Borrado en bulk
		le.insertAtEnd(7);
		le.insertAtEnd(8);
		le.insertAtEnd(9);
		le.insertAtEnd(10);
		le.insertAtEnd(11);
		le.insertAtEnd(12);
		le.print();
		le.clearList();
		le.print();
		
	}

}


package colas;

public class InitCola {

	public static void main(String[] args) {
		
		Cola cola = new Cola();
		
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		
		cola.print();
		
		System.out.println("\nExtraigo el primero: "+cola.dequeue());
		cola.print();
		
		System.out.println("\nConsulto el primero: "+cola.front());
		cola.print();
		
	}
}

package pilasYcolasProfe;

public class InitCola {

	public static void main(String[] args) {
		Cola cola = new Cola();
		
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		cola.enqueue(6);
		
		cola.print();
		
		System.out.println("Extraigo el primero: " + cola.dequeue());
		cola.print();
		
		System.out.println("Solo consulto el primero: " + cola.front());
		cola.print();
	}
}

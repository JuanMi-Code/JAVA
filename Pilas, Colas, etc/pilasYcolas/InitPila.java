package pilasYcolasProfe;

public class InitPila {

	public static void main(String[] args) {
		Pila pila = new Pila();
		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		pila.push(6);
		
		pila.print();
		
		System.out.println("Extraigo la cima: " + pila.pop());
		pila.print();
		
		System.out.println("Solo consulto la cima: " + pila.seek());
		pila.print();
	}
}

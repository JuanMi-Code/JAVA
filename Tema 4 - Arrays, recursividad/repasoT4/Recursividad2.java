package repasoT4;

public class Recursividad2 {

	public static void main(String[] args) {
		
		int numero = 7;
		System.out.println(factorial(numero));
		
	}

	private static int factorial(int numero) {
		
		if(numero == 1) {
			return 1;
		}else {
			
			return numero*factorial(numero-1);
		}
		
	}
}

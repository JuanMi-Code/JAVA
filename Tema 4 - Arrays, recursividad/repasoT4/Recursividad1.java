package repasoT4;

public class Recursividad1 {

	public static void main(String[] args) {
		
		int numero =4;
		
		System.out.println(fibonacci(numero));
		
	}

	private static int fibonacci(int numero) {
		
		if(numero == 1) {
			return 0;
		}else if (numero == 2) {
			return 1;
		}else {
			return fibonacci(numero-1)+fibonacci(numero-2);
		}
		
	}
}

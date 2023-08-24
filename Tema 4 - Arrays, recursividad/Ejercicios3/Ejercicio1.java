package Ejercicios3;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int valor = 10;
		
		
		for (int i = 1; i < valor; i++) {
			System.out.println(fibonacci(i));
		}
	}
	
	public static int fibonacci(int valor) {
		
		if (valor==1) {
			return 0;
		}else if(valor==2){
			return 1;
		}else {
			return fibonacci(valor-1)+fibonacci(valor-2);
		}	
	}
}

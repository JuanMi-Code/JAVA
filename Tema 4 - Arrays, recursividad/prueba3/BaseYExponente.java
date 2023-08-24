package prueba3;

public class BaseYExponente {

	public static void main(String[] args) {
		
		int base = 3;
		int exponente =5;
		System.out.println(metodoRecursividad(base,exponente));	
	}
	
	public static int metodoRecursividad(int base, int exponente) {
		
		if (exponente ==0) {
			return 1;
		}else {	
			return base * metodoRecursividad(base, exponente-1);
		
		}
	}
}

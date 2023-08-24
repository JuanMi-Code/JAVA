package Ejercicios3;

import java.math.BigInteger;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		BigInteger n = new BigInteger("9080");
		System.out.println("El factorial de "+n+" es:\n"+factorial2(n));
		
		int numero = 31;
		Integer valor = Integer.valueOf(numero);
		System.out.println(factorial(valor));
		
	}
	
	private static BigInteger factorial2(BigInteger num) {
		//caso base: 0!==1
		if(num == null) {
			//caso especial nulos
			return null;
		}else if(num.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		}else {
			return num.multiply(factorial2(num.subtract(BigInteger.ONE)));
		}
	}
	
	public static Integer factorial(Integer numero) {
		if(numero.equals(0)) {
			return 1;
		}else {
			return numero * factorial(numero-1);
		}
	}
}

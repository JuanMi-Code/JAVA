package Ejercicios3;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String palabra = "Hola";
		int longitud=palabra.length()-1;
		System.out.println(metodoPalabra(palabra, longitud));
	}
	private static String metodoPalabra(String palabra, int longitud) {
		
		if(longitud == 0) {
			return String.valueOf(palabra.charAt(longitud));
		}else {
			return palabra.charAt(longitud)+metodoPalabra(palabra, longitud-1);
		}
	}
}

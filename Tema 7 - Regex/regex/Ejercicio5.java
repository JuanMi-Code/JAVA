package regex;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		System.out.println(validarIP("192.168.1.25"));
		System.out.println(validarIP("256.168.1.25")); //256 está mal
		System.out.println(validarIP("0.0.0.0"));
		System.out.println(validarIP("500.500.500.500")); //500 está mal
		System.out.println(validarIP("01.08.01.01")); // 01 está mal
		System.out.println(validarIP("25.1.168.192"));		
}	
	public static boolean validarIP(String IP) {
		String valor = "((\\d|[1-9][\\d]|1[\\d][\\d]|2[0-5][0-5]))";
		
		/* Números del 0 al 255
		 * //d números del 0 al 9
		 * |[1-9][\\d]	o números del 10 al 99 (del 1 al 9 y del 0 al 9)
		 * |1[\\d][\\d] o números del 100 al 199 (el 1 seguido del 0 al 9 y seguido del 0 al 9)
         * |2[0-4][0-9] o números hasta 249: 2 + (0-4) + (0-9)
         * |25[0-5]     o números hasta 255: 25 + (0-5)
		 */
		
		return IP.matches("^" + valor + "\\."+ valor + "\\." +valor + "\\."+valor+"$");		
		/* “^” inicio de la cadena
		 * "$ fin de la cadena"
		 * \\.    hay un punto
		 */
	}
}

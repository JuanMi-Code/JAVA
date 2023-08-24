package Ejercicios3;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numero = 1523;
		
		//System.out.println(digitos(numero));
		//int centena=0;
		//int decena=0;
		//int unidad=0;
		//int mil=0;
		
		//int resultado = numero%10;
		//System.out.println("--"+resultado);
		
/*		for (int i=1;i<numero%10;i++) {
			mil=numero/1000;
			centena=numero/100;
				centena = centena%10;
			decena = numero/10;
				
			unidad=numero%100;
		}
		System.out.println(mil + " " + centena + " " + decena + " " + unidad);
*/		String string="";
		System.out.println(digitos(numero));
		//System.out.println(digitosSuma(numero));
	}
//OPCION 1:
	public static int digitos(int numero) {
		
		if (numero<10) {
			//return numero%10;
			//string += numero;
			System.out.println(numero);
			return numero;
			
		}else {
			int suma = digitos(numero/10);
			System.out.println(numero%10);
			return numero%10+suma;
			//return digitos((numero/10)%10, string);
			//return digitos(numero/10) + digitos(numero%10);
		}
		
	}
/*public static int digitosSuma(int numero) {
		
		if (numero<10) {
			//return numero%10;
			//string += numero;
			return numero;
		}else {
			
			//return digitos((numero/10)%10, string);
			return digitosSuma(numero/10) + digitosSuma(numero%10);
			int suma=digitosSuma(num/10);
			return num%10 + suma;
		}
		
	}
*/
}

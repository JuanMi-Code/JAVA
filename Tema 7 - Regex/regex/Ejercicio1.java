package regex;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String avionGeneral = "^EC-[A-W]{1}[A-Z]{2}$";
		String artesanal = "^EC-[X-Z]{1}[A-Z{2}]$";
		String ultraligero = "^EC-[A-Z]{2}[0-9]{1}$";
		String pruebaEntrega = "^EC-[0-9]{1}[0-9]{1}[1-9]{1}$";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la matricula: ");
		String matricula = sc.nextLine();
		sc.close();
		
		if (matricula.matches(avionGeneral)) {
			System.out.println("Es una aronave de tipo Aviacion General");
		}else if (matricula.matches(artesanal)) {
			System.out.println("Es una aronave de tipo Artesanal");
		}else if (matricula.matches(ultraligero)) {
			System.out.println("Es una aronave de tipo Ultraligero");
		}else if (matricula.matches(pruebaEntrega)) {
			System.out.println("Es una aronave de tipo Prueba y Entrega");
		}else {
			System.out.println("No coincide ningun tipo con la matricula introducida");
		}
		
		
		
	}
}

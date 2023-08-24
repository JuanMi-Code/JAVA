package prueba;

import java.util.Scanner;

import com.sun.tools.javac.code.Attribute.Array;

public class Init {

	public static void main(String[] args) {
		
	/*	Fruta fruta1 = new Fruta(0.5,2.3, "Manzana");
		Fruta fruta2 = new Fruta(1.0,3.4,"Pera");
		Fruta fruta3 = new Fruta(1.5,4.5,"Melón");
		Fruta fruta4 = new Fruta(2.0,5.6,"Sandía");
		Fruta fruta5 = new Fruta(2.5,6.7,"Melocotón");
		
		
		Fruta [] frutas = {fruta1, fruta2, fruta3, fruta4, fruta5};
		for (int i=0; i<frutas.length; i++)
			System.out.println(frutas[i]);
		
		System.out.println("----------------------------");
		
		int precioSuperior = 3;
			Fruta [] precios = new Fruta[5];
			Fruta objeto;
				
				for (int i=0; i<frutas.length; i++) {
					objeto = frutas[i];
					
					if (objeto.getPrecio() > precioSuperior) {
							precios[i] = objeto;
					}
				}
				for (Fruta p : precios) 
					System.out.println(p);
				
	*/	System.out.println("----------------------------");
		
		final double PRECIO = 3.f;
				
		Fruta fruta1 = new Fruta(0.5,2.3, "Manzana");
		Fruta fruta2 = new Fruta(1.0,3.4,"Pera");
		Fruta fruta3 = new Fruta(1.5,4.5,"Melón");
		Fruta fruta4 = new Fruta(2.0,5.6,"Sandía");
		Fruta fruta5 = new Fruta(2.5,6.7,"Melocotón");
				
		int contador = 0;		
		Fruta [] frutas = {fruta1, fruta2, fruta3, fruta4, fruta5};
		for (int i=0; i<frutas.length; i++) {
			//Esta linea está mal creo 	System.out.println(frutas[i].getNombre() + " - " + frutas[i].getPrecio());
			if (frutas[i].getPrecio() > PRECIO) {
				System.out.println(frutas[i].getNombre() + " - " + frutas[i].getPrecio());
				//System.out.println(frutas[i]);
				contador ++;
			}
		}
		System.out.println("\nSe pasan de precio: "+contador);		
		
		//for para calcular el numero de elementos del segundo Array
		//otro for para ir almacenando lo que se pase del precio
		
		
		
		//for (Fruta i : frutas) 
		//	System.out.println(i);
			
		//OTRAS OPCIONES:
		//Fruta [] frutas = new Fruta[5];
		//frutas[0]=fruta1;
		//frutas[1]=new Fruta(1.0,3.4,"Pera");
		
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Introduce posición: ");
	//	int i = sc.nextInt();
	//	System.out.println(frutas[i]);
		
	}
}

package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Init {

	public static void main(String[] args) {
		
//		Cuadrado cuadrado = new Cuadrado("Rojo", 2);
//		System.out.println(cuadrado);
//		System.out.println("Area del cuadrado: "+cuadrado.calculaArea());
//		System.out.println("Perimetro del cuadrado: "+cuadrado.calculaPerimetro());
		
		Figura cuadrado = new Cuadrado("Rojo", 2);
		((Cuadrado)cuadrado).imprimeUnMensajito();
		
		if(cuadrado instanceof Cuadrado) {
			System.out.println("Es un cuadrado");
		}
		if(cuadrado instanceof Figura) {
			System.out.println("Es una Figura");
		}
		if(cuadrado instanceof Triangulo) {
			System.out.println("Es una Figura");
		}
		
		Triangulo triangulo = new Triangulo("Azul", 3, 4);
		System.out.println(triangulo);
		System.out.println("Area del triangulo: "+triangulo.calculaArea());
		System.out.println("Perimetro del triangulo: "+triangulo.calculaPerimetro());
		
		List<Figura> lista = new ArrayList<>();
		lista.add(cuadrado);
		lista.add(triangulo);
		
		for (Figura figura : lista) {
			if(figura instanceof Cuadrado) {
				System.out.println("Cuadrado: ");
			}else if(figura instanceof Triangulo) {
				System.out.println("Triangulo: ");
			}
			System.out.println(figura);
		}
	}
}

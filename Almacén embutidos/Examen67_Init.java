package examen.examen;

import java.util.Random;

public class Examen67_Init {

	public static void main(String[] args) {
		
		Almacen al =new Almacen();
		
		for (int i = 0; i < 25; i++) {
			Producto prod = (new Jamon());
			al.agregarProducto(prod);
			Producto prod2 = (new Chorizo());
			al.agregarProducto(prod2);
		}
		
		al.mostrarEstanteria();
		
		al.calcularMarca("5j");
		
		

		
	}
}

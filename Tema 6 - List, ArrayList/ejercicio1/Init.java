package tema6.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		ArrayList<LineaFactura> lineasFactura = new ArrayList();
		
		Producto pera = new Producto(1, "Pera", 2, 100, 10);
		Producto manzana = new Producto(1, "manzana", 1, 50, 6);
		Producto melon = new Producto(1, "melon", 4, 60, 8);
		Producto sandia = new Producto(1, "sandia", 5, 80, 20);
			stock.anadir(pera);
			stock.anadir(manzana);
			stock.anadir(melon);
			stock.anadir(sandia);
			System.out.println(stock);
		
			lineasFactura.add(new LineaFactura(manzana, 1));
			lineasFactura.add(new LineaFactura(sandia, 2));
//		Factura factura = new Factura(1, lineasFactura, false);
		Factura factura = new Factura();
		System.out.println("\n"+factura);
		
		for (LineaFactura lineaFactura : factura.getLineasFactura()) {
			System.out.println(lineaFactura);
		}

	}
}
/*		
		
		
		Scanner sc = new Scanner(System.in);
		
		Stock stock = new Stock();
		
		CajonFacturas cajon = new CajonFacturas();
		
		//Metemos productos en el stock
		
		Producto prod = new Producto(1, "Pantalón", 24.99f, 20, 7);
		stock.anadir(prod);
		prod = new Producto(2, "Camiseta", 15, 40, 10);
		stock.anadir(prod);
		stock.anadir(new Producto(3, "Jersey", 14.99f, 30, 17));
		
		int opt = 0;
		
		do {
			System.out.println("-----MENÚ-----");
			System.out.println("\t1-Facturar");
			System.out.println("\t2-Stock");
			System.out.println("\t3-Salir");
			System.out.println("\n\n");
			
			do{
				System.out.println("Introduzca una opción");
				opt = Integer.valueOf(sc.nextLine());
			}while(opt <1 || opt > 3);
			
			switch (opt) {
			case 1:
				menuFacturar(stock,cajon,sc);
				break;
			case 2:
				menuStock(stock,cajon,sc);
				break;
			}
			
		}while(opt!=3);
	}

	private static void menuStock(Stock stock, CajonFacturas cajon, Scanner sc) {
		int opt = 0;
		Producto prod;
		do {
			System.out.println("-----MENÚ-----");
			System.out.println("\t1-Nuevo producto");
			System.out.println("\t2-Borrar producto");
			System.out.println("\t3-Buscar producto");
			System.out.println("\t3-Productos agotados");
			System.out.println("\t3-Rotura de stock(productos bajo minimos)");
			System.out.println("\t3-Mostrar stock");
			System.out.println("\t3-Salir");
			System.out.println("\n\n");
			
			do{
				System.out.println("Introduzca una opción");
				opt = Integer.valueOf(sc.nextLine());
			}while(opt <1 || opt > 7);
			
			int cod;
			switch (opt) {
			case 1:

				System.out.println("---Nuevo producto---");
				System.out.println("Introduzca el codigo:");
				cod = Integer.valueOf(sc.nextLine());
				
				System.out.println("Introduzca la descripcion:");
				String desc = String.valueOf(sc.nextLine());
				
				System.out.println("Introduzca el precio:");
				float precio = Integer.valueOf(sc.nextLine());
				
				System.out.println("Introduzca la cantidad:");
				int cant = Integer.valueOf(sc.nextLine());
				
				System.out.println("Introduzca el minimo:");
				int min = Integer.valueOf(sc.nextLine());
				
				prod = new Producto(cod, desc, precio, cant, min);
				stock.anadir(prod);
				System.out.println("Producto creado con exito");
				break;
			case 2:
				System.out.println("---BORRAR PRODUCTO---");
				System.out.println("Introduce el codigo");
				
				cod = Integer.valueOf(sc.nextLine());
				
				if(stock.borrar(cod)) {
					System.out.println("Borrado con exito");
				}else {
					System.out.println("Producto no encontrado");
				}
				break;
			case 3:
				System.out.println("---BUSCAR PRODUCTO");
				System.out.println("Introduciir codigo");
				cod = Integer.valueOf(sc.nextLine());
				
				prod = stock.buscar(cod);
				
				if(prod != null) {
					System.out.println("Codigo "+ cod + ":");
					System.out.println(prod);
				}else {
					System.out.println("Producto no encontradp");
				}
				
				if(stock.borrar(cod)) {
					System.out.println("Borrado con exito");
				}else {
					System.out.println("Producto no encontrado");
				}
				break;
			case 6:
				//falta completar el case 6
				System.out.println("Listado de Stock");
				List<Producto> productos = stock.getStock();
				
				if(!productos.isEmpty()) {
					System.out.println("Codigo, descripcion, precio, cantidad, minimo");
					for (Producto producto : productos) {
						System.out.println(producto);
					}
				}else {
					System.out.println("No hay productos en stock");
				}
				break;
			}
			
		}while(opt!=7);
		
	}

	private static void menuFacturar(Stock stock, CajonFacturas cajon, Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
}
*/

package ejercicio1_profe;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class MainVideoclub {

	public static void main(String[] args) {
		char opcion;
		Scanner sc = new Scanner(System.in);
		Videoclub videoclub = new Videoclub();
		
		// peliculas y clientes de prueba
		videoclub.aniadirCliente(new Cliente("Luis    "));
		videoclub.aniadirCliente(new Cliente("Juan    "));
		videoclub.aniadirCliente(new Cliente("Fernando"));

		videoclub.aniadirPelicula(new Pelicula(1, "Moonligth            "));
		videoclub.aniadirPelicula(new Pelicula(2, "Es por tu bien       "));
		videoclub.aniadirPelicula(new Pelicula(3, "La la land           "));
		videoclub.aniadirPelicula(new Pelicula(4, "El guardian invisible"));

		do {
			System.out.println("\n----MENU----");
			System.out.println("1-Prestamo");
			System.out.println("2-Devolucion");
			System.out.println("3-Listado Morosos");
			System.out.println("4-Listado Prestamos");
			System.out.println("5-Listado Peliculas");
			System.out.println("6-Salir");
			
			do {
				System.out.print("\nIntroduzca la opción deseada: \n");
				opcion = sc.nextLine().charAt(0);
			} while (opcion < '1' || opcion > '6');
			
			// Definición de variables
			int codigoPelicula;
			Pelicula p;
			
			switch (opcion) {
			case '1':
				System.out.println("NUEVO PRESTAMO");
				System.out.print("Codigo de pelicula:");
				codigoPelicula = Integer.valueOf(sc.nextLine());
				
				p = videoclub.buscarPelicula(codigoPelicula);
				// Compruebo que exista la película
				if(p != null) {
					// Compruebo que no esté alquilada
					if(!videoclub.isPrestada(codigoPelicula)) {
						// Pido el número de carnet
						System.out.print("Introduzca el número de carnet del cliente:");
						int numeroCarnet = Integer.valueOf(sc.nextLine());
						
						Cliente c = videoclub.buscarCliente(numeroCarnet);
						// Compruebo que exista
						if(c != null) {
							// Lógica de negocio (LN)
							if(videoclub.aniadirPrestamo(new Prestamo(p, c))) {
								System.out.println("Prestamo realizado con éxito");
							} else {
								System.err.println("Error al realizar el préstamo");
							}	
						} else {
							System.out.println("Debe registrarse el cliente.");
						}
					} else {
						System.out.println("La película aún no está disponible.");
					}
				} else {
					System.out.println("La película aún no está disponible.");
				}
				
				break;
			case '2':
				System.out.println("DEVOLUCION");
				System.out.print("Codigo de pelicula:");
				codigoPelicula = Integer.valueOf(sc.nextLine());
				
				p = videoclub.buscarPelicula(codigoPelicula);
				// Compruebo que exista la película
				if(p != null) {
					// Compruebo que SI esté alquilada
					if(videoclub.isPrestada(codigoPelicula)) {
						// Pido el número de carnet
						System.out.print("Introduzca el número de carnet del cliente:");
						int numeroCarnet = Integer.valueOf(sc.nextLine());
						
						Cliente c = videoclub.buscarCliente(numeroCarnet);
						// Compruebo que exista
						if(c != null) {
							
							// Lógica de negocio (LN)
							if(videoclub.devolucion(codigoPelicula, numeroCarnet)) {
								System.out.println("Devolución realizada con éxito");
							} else {
								System.err.println("Error al realizar la devolución");
							}	
						} else {
							System.out.println("Debe registrarse el cliente.");
						}
					} else {
						System.out.println("La película no estaba prestada.");
					}
				} else {
					System.out.println("La película aún no está disponible.");
				}

				break;
			case '3':
				System.out.println("LISTADO DE PRESTAMOS A MOROSOS");
				videoclub.mostrarPrestamosMosoros();
				
				break;
			case '4':
				System.out.println("LISTADO TOTAL DE PRESTAMOS");
				videoclub.mostrarPrestamos();
				
				break;
			case '5':
				System.out.println("CATÁLOGO DE PELÍCULAS");
				videoclub.mostrarPeliculas();
				break;
			}
			if (opcion != '6') {
				System.out.print("\nPulse una tecla para continuar");
				sc.nextLine();
			}
		} while (opcion != '6');
		
		sc.close();

	}

}

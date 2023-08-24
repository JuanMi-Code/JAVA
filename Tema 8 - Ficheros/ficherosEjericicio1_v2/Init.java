package ficherosEjericicio1_PROFESOR;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Init {
	
	private static final String RUTA = "ficheros";

	public static void main(String[] args) {
		actualizaPlantas();
		imprimirFichero();
	}
	
	
	private static void actualizaPlantas() {
		List<Planta> lista = new ArrayList<>();
		
		Path file = Paths.get(RUTA + "\\plantas.bin");
		
		try (InputStream is = Files.newInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is)) {
			
			System.out.println("Leo el fichero de plantas...");
			Planta p = null;
			
			for(;;) {			
				try {
					p = (Planta) ois.readObject();
					System.out.println("Planta leída: " + p);
					lista.add(p);		
				} catch (EOFException e) {
					System.out.println("Fin de la lectura del fichero!!");
					break;
				} catch (ClassNotFoundException e) {
					System.out.println("Problemas con la lectura del fichero...");
					e.printStackTrace();
				}				
			}	
		} catch (IOException e) {
			System.err.println("Problemas al leer el fichero...");
			e.printStackTrace();
		}
		
//		System.out.println("\nContenido del ArrayList: ");
//		lista.forEach(v -> System.out.println(v));
		
		System.out.println("Actualizamos los precios...");
		
		for (Planta elem : lista) {
			if(elem.getCantidad() < 10) {
				elem.setPrecio(elem.getPrecio() * 0.8);
			} else if(elem.getCantidad() <= 50 ) {
				elem.setPrecio(elem.getPrecio() * 0.7);
			} else {
				elem.setPrecio(elem.getPrecio() * 0.6);
			}
		}
		
		System.out.println("Precios actualizados!!");
		
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			
			os = Files.newOutputStream(file);
			oos = new ObjectOutputStream(os);
			
			System.out.println("Actualizo el fichero de plantas...");
			
			for (Planta elem : lista) {
				oos.writeObject(elem);
			}
			
			System.out.println("Fin de la escritura del fichero!!");
			
		} catch (IOException e) {
			System.err.println("Problemas al leer el fichero...");
			e.printStackTrace();
		} finally {
			try {
				if(oos!= null) {
					oos.close();
				}
				
				if(os!= null) {
					os.close();
				}
			} catch (IOException e) {
				System.out.println("Problemas al cerrar los streams...");
				e.printStackTrace();
			}
		}
		
		
		
		
	}

	private static void imprimirFichero() {
		Planta planta = null;
		
		Path file = Paths.get(RUTA + "\\plantas.bin");
		
		try (InputStream is = Files.newInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is)) {
			
			System.out.println("Leo el fichero de plantas...");
			
			while(true) {			
				try {
					planta = (Planta) ois.readObject();
					System.out.println(planta);
				} catch (EOFException e) {
					System.out.println("Fin de la lectura del fichero!!");
					break;
				} catch (ClassNotFoundException e) {
					System.out.println("Problemas con la lectura del fichero...");
					e.printStackTrace();
				}				
			}			
			
		} catch (IOException e) {
			System.err.println("Problemas al leer el fichero...");
			e.printStackTrace();
		}
	}
	
}

package ficherosEjercicio3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Init {
	
	private static final String RUTA = "ficheros";

	
	public static void main(String[] args) {
		
		List<Vehiculo> lista = new ArrayList<>();
		
		// Leemos los coches
		lecturaCoches(lista);
		
		// Modificamos los coches
		LocalDateTime menos5dias = LocalDateTime.now().minusDays(5);
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getEntradaEnExposicion().isBefore(menos5dias)) {
				lista.get(i).setPrecio(lista.get(i).getPrecio() * 0.85);
			}
		}
		
		/*System.out.println("Comprobamos cómo queda la lista: ");
		
		for (Vehiculo vehiculo : lista) {
			System.out.println(vehiculo);
		}*/
		
		// Guardamos la información de los coches
		escrituraCoches(lista);
		System.out.println("Comprobamos cómo queda el fichero: ");
		lecturaCoches(lista);
		
	}

	private static void escrituraCoches(List<Vehiculo> lista) {
		Path file = Paths.get(RUTA + "\\vehiculos.bin");

		try (OutputStream os = Files.newOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(os);){
			
			
			System.out.println("Modificando el fichero...");

			for (Vehiculo v : lista) {
				oos.writeObject(v);
			}
			
			System.out.println("Fichero modificado con éxito!!");

		} catch (IOException e) {
			System.err.println("Error al intentar crear el fichero binario.");
			e.printStackTrace();
		}
		
	}

	private static void lecturaCoches(List<Vehiculo> lista) {
		Path file = Paths.get(RUTA + "\\vehiculos.bin");
		
		try (InputStream is = Files.newInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is);) {
			
			System.out.println("Leyendo el fichero...");
			
			while(true) {
				
				try {
					Vehiculo v = (Vehiculo) ois.readObject();
					System.out.println(v);
					lista.add(v);
				} catch (EOFException e) {
					System.out.println("Lectura finalizada con éxito!!");
					break;
				}
			}
			
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error al intentar leer el fichero binario.");
			e.printStackTrace();
		}
		
	}
}

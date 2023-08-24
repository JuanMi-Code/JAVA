package Output_InputStream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Prueba implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private int numero;
	
	public Prueba(String nombre, String apellido, int numero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
	}
	
	public Prueba() {
	}

	public static void escrituraFicheroObjetoPath(List<Prueba> lista) throws RevisionException, MuchaListaException{
		
		try (FileOutputStream fos = new FileOutputStream("src\\main\\java\\Output_InputStream\\archivos\\lectura.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			System.out.println("Escribiendo objeto...");
			
				if (lista.size()>2) {
					
					//throw new MuchaListaException("Error kk", RevisionException);
					
//					MuchaListaException e = new MuchaListaException("La lista es demasiado larga");
//					e.printStackTrace();
//					System.out.println("Mensaje de error: "+ e.getMessage());
//					System.out.println("---Objeto NO escrito---");
	
					
				}else {
					for (int i = 0; i < lista.size(); i++) {
						oos.writeObject(lista.get(i));
					}
					System.out.println("Objeto escrito");
				}
							
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void lecturaFicheroObjejoPath() {
		Prueba prueba = null;
		Path file = Paths.get("src\\main\\java\\Output_InputStream\\archivos\\lectura.bin");
		
		try (InputStream is = Files.newInputStream(file);ObjectInputStream ois = new ObjectInputStream(is);) {
			
			System.out.println("Leyendo objetos del archivo...");
			
				while (true) {
					try {
						prueba = (Prueba) ois.readObject();
						System.out.println("Leido: "+prueba+"\n");
					} catch (Exception e) {
						System.out.println("Fin de lectura");
						break;
					}
				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String toString() {
		return "Prueba [nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + "]";
	}
}

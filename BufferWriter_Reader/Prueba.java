package BufferWriter_Reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prueba {
	
	private static List<String> lista;

	public Prueba() {
		lista = new ArrayList<>();
	}

	public static void escrituraFicheroTextoBW() {
		
		Path file = Paths.get("src\\main\\java\\BufferWriter_Reader\\archivos\\escritura.txt");
		
		try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
			
			System.out.println("Escribiendo...");
			
			for (int i = 0; i < lista.size(); i++) {
				bw.write(lista.get(i));
			}
			
			System.out.println("Escritura completada");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void lecturaFicheroPath() {
		Path file = Paths.get("src\\main\\java\\BufferWriter_Reader\\archivos\\lectura.txt");
		
		try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
			
			System.out.println("Leyendo archivo...");
			
			String line = null;
			while((line = br.readLine())!=null){
				
				String[] separado = line.split(";");
				for (int i = 0; i < separado.length; i++) {
					lista.add(separado[i]);
				}
			}
			
			System.out.println("Archivo leido");
			
		} catch (Exception e) {
			
		}
	}
}

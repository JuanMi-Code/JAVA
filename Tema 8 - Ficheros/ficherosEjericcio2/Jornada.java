package ficherosEjericcio2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jornada {
	
	private static List<String> trabajadores = new ArrayList<>();
	private static List<String> peonadas = new ArrayList<>();
	private static Map<String,Integer>totalPeonadas = new HashMap<>();
	//HashMap, el codigo es el nombre del trabajador
	public Jornada() {
	}
	
	public void escrituraFicheroPath() {		
		
		Path file = Paths.get("src\\main\\java\\ficherosEjericcio2\\Ficheros\\totalPeonadas.txt");
		
		try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
			
			System.out.println("Escribiendo fichero...");
			
			int contador = 0;
			for (int i = 0; i < trabajadores.size(); i++) {
				for (int j = 0; j < peonadas.size(); j++) {
					if (trabajadores.get(i).equals(peonadas.get(j))) {
						contador++;
					}
				}
				totalPeonadas.put(trabajadores.get(i), contador);
				contador=0;
			}
			
			for (int i = 0; i < trabajadores.size(); i++) {
				System.err.println(totalPeonadas.get(i));
			}
//-------------------------------
//			int contador = 0;
//			for (int i = 0; i < trabajadores.size(); i++) {
//				for (int j = 0; j < peonadas.size(); j++) {
//													
//					if (trabajadores.get(i).equals(peonadas.get(j))) {					
//						contador++;
//					}	
//				}		
//				bw.write(trabajadores.get(i) + ": "+contador+"\n");
//				contador = 0;
//			}			
//-------------------------------
			System.out.println("Fin de escritura");	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void lecturaFicheroPeonadas() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			archivo = new File("src\\main\\java\\ficherosEjericcio2\\Ficheros\\Peonadas.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;
			
			while((linea=br.readLine())!=null) {

				String[] dosPuntos = linea.split(":");				
				String[] coma = dosPuntos[dosPuntos.length-1].split(",");
				
				for (int i = 0; i < coma.length; i++) {
					peonadas.add(coma[i]);
				}			
			}			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if(br!=null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void lecturaFicheroTrabajadores() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			archivo = new File("src\\main\\java\\ficherosEjericcio2\\Ficheros\\Trabajadores.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;			
			while((linea=br.readLine())!=null) {
				trabajadores.add(linea);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if(br!=null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}

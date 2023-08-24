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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Jornada2 {
	
	private static Map<String,Integer>totalPeonadas = new HashMap<>();
	//HashMap, el codigo es el nombre del trabajador
	public Jornada2() {
	}
	
	public void escrituraFicheroPath() {		
		
		Path file = Paths.get("src\\main\\java\\ficherosEjericcio2\\Ficheros\\totalPeonadas.txt");
		
		try (BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
			
			
			System.out.println("Escribiendo fichero...");
			
//			para recorrer el hasmap
			Iterator<String> it = totalPeonadas.keySet().iterator();
			while(it.hasNext()) {
				String clave = it.next();
				int valor = totalPeonadas.get(clave);
				bw.write(clave + ": "+ valor +"\n");
				//System.out.println(clave + " " + valor);
			}
			
			System.out.println("Fin de escritura");	
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void lecturaFicheroPeonadas() {
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
					
					if (totalPeonadas.containsKey(coma[i])) {
						totalPeonadas.put(coma[i], totalPeonadas.get(coma[i])+1);
						//otra opción sería esta
						//totalPeonadas.replace(coma[i], totalPeonadas.get(coma[i]), totalPeonadas.get(coma[i])+1);
					}
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
	
	public void lecturaFicheroTrabajadores() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			archivo = new File("src\\main\\java\\ficherosEjericcio2\\Ficheros\\Trabajadores.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;			
			while((linea=br.readLine())!=null) {
//				trabajadores.add(linea);
				//ponemos de int 0 para que tenga un valor almacenado, después lo modificamos
				totalPeonadas.put(linea, 0);
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

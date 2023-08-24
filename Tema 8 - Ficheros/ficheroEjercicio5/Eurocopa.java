package ficheroEjercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Eurocopa {

	public Eurocopa() {
		
	}

	public static List<String> lecturaFicheroJugadoresPath() {
		String url = "src\\main\\java\\ficheroEjercicio5\\ficheros\\jugadores.txt";
		Path file = Paths.get(url);
		List<String> jugadores = new ArrayList<>();
		
		try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
			System.out.println("Leyendo archivo...");
			String line = null;
			while((line = br.readLine())!=null) {
				jugadores.add(line);
			}
			System.out.println("Fin de lectura");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jugadores;
		
	}
	
	public static List<String> lecturaFicheroDemarcacionesPath() {
		String url = "src\\main\\java\\ficheroEjercicio5\\ficheros\\demarcaciones.txt";
		Path file = Paths.get(url);
		List<String> demarcaciones = new ArrayList<>();
		
		try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
			System.out.println("Leyendo archivo...");
			String line = null;
			while((line = br.readLine())!=null) {
				demarcaciones.add(line);
			}
			System.out.println("Fin de lectura");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return demarcaciones;
		
	}
	
	public static List<String> lecturaFicheroSeleccionesPath() {
		String url = "src\\main\\java\\ficheroEjercicio5\\ficheros\\selecciones.txt";
		Path file = Paths.get(url);
		List<String> selecciones = new ArrayList<>();
		
		try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
			System.out.println("Leyendo archivo...");
			String line = null;
			while((line = br.readLine())!=null) {
				selecciones.add(line);
			}
			System.out.println("Fin de lectura");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return selecciones;
		
	}
	
	public static String juntarTodo(List<String> jugadores, List<String> demarcaciones, 
			List<String> selecciones) {

		StringBuilder sb = new StringBuilder();

		for (String seleccion : selecciones) {
			String[] seleccionPartes = seleccion.split(";");
			sb.append(seleccionPartes[1]).append("\n");

			for (String jugador : jugadores) {
				String[] jugadorPartes = jugador.split(";");
				if (jugadorPartes[2].equals(seleccionPartes[0])) {
					// El jugador pertenece a la selección en curso
					sb.append(jugadorPartes[0]).append(";");
					for (String demarcacion : demarcaciones) {
						String[] demarcacionPartes = demarcacion.split(";");
						if (jugadorPartes[1].equals(demarcacionPartes[0])) {
							sb.append(demarcacionPartes[1]).append("\n");
						}
					}
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}

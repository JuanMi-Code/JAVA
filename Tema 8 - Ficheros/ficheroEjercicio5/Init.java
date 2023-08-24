package ficheroEjercicio5;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Init {

	private static final String RUTA = "src\\main\\java\\ficheroEjercicio5\\ficheros";
	private static final String DELIMITER = ":";

	public static void main(String[] args) {

		// Leemos todos los ficheros
		Path fich = Paths.get(RUTA, "selecciones.txt");
		List<String> selecciones = leerFichero(fich);

		fich = Paths.get(RUTA, "demarcaciones.txt");
		List<String> demarcaciones = leerFichero(fich);

		fich = Paths.get(RUTA, "jugadores.txt");
		List<String> jugadores = leerFichero(fich);

		// Crear el String con el contenido fusionado
		System.out.println("\nComprobación: ");
		String info = crearInfoFusionada(selecciones, demarcaciones, jugadores);

		// Comprobamos que el String sea correcto
		System.out.println(info);

		// Escribir el String en un fichero de texto
		fich = Paths.get(RUTA, "listaSelecciones.txt");
		escribirFichero(fich, info);
	}

	private static void escribirFichero(Path fich, String info) {
		try (BufferedWriter bw = Files.newBufferedWriter(fich, StandardCharsets.UTF_8)) {
			System.out.println("Escribimos el fichero...");

			bw.write(info);

			System.out.println("Escritura completa!!");
		} catch (IOException e) {
			System.err.println("Error al realizar la lectura del fichero " + fich.getFileName());
			e.printStackTrace();
		}

	}

	private static String crearInfoFusionada(List<String> selecciones, List<String> demarcaciones,
			List<String> jugadores) {

		StringBuilder sb = new StringBuilder();

		for (String seleccion : selecciones) {
			String[] seleccionPartes = seleccion.split(DELIMITER);
			sb.append(seleccionPartes[1]).append("\n");

			for (String jugador : jugadores) {
				String[] jugadorPartes = jugador.split(DELIMITER);
				if (jugadorPartes[2].equals(seleccionPartes[0])) {
					// El jugador pertenece a la selección en curso
					sb.append(jugadorPartes[0]).append(DELIMITER);
					for (String demarcacion : demarcaciones) {
						String[] demarcacionPartes = demarcacion.split(DELIMITER);
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

	private static List<String> leerFichero(Path fich) {
		List<String> lista = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(fich, StandardCharsets.UTF_8)) {
			System.out.println("Leemos el fichero...");

			String line = null;
			while ((line = br.readLine()) != null) {
				lista.add(line);
			}

			System.out.println("Lectura completa!!");
		} catch (IOException e) {
			System.err.println("Error al realizar la lectura del fichero " + fich.getFileName());
			e.printStackTrace();
		}

		return lista;
	}

}

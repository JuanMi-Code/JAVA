package ficherosEjercicio3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class CrearArchivoVehiculosOcasion {

	private static final String RUTA = "ficheros";

	public static void main(String[] args) {
		Path file = Paths.get(RUTA + "\\vehiculos.bin");

		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = Files.newOutputStream(file);
			oos = new ObjectOutputStream(os);
			
			System.out.println("Creando el fichero...");

			oos.writeObject(new Vehiculo("6574FDU", "OPEL INSIGNIA", 15500, LocalDateTime.of(2017, 5, 10, 10, 0)));
			oos.writeObject(new Vehiculo("8584DDZ", "CITROEN C3", 9800, LocalDateTime.of(2017, 5, 8, 10, 0)));
			oos.writeObject(new Vehiculo("5874FGM", "OPEL ASTRA", 11000, LocalDateTime.of(2017, 5, 2, 10, 0)));
			oos.writeObject(new Vehiculo("9984HET", "MERCEDES C270", 9500, LocalDateTime.of(2017, 5, 14, 10, 0)));
			oos.writeObject(new Vehiculo("1254BNG", "BMW X3", 15800, LocalDateTime.of(2017, 5, 8, 10, 0)));
//			oos.writeObject(new Vehiculo("0934GXY", "NISSAN QASHQAI2 2.0", 12800, LocalDateTime.of(2017, 5, 12, 10, 0)));
			oos.writeObject(new Vehiculo("0934GXY", "NISSAN QASHQAI2 2.0", 12800, LocalDateTime.now()));
			
			System.out.println("Fichero creado con éxito!!");

		} catch (IOException e) {
			System.err.println("Error al intentar crear el fichero binario.");
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				System.err.println("Error al intentar cerrar los streams del fichero binario.");
				e.printStackTrace();
			}
		}
	}

}

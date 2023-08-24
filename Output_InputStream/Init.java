package Output_InputStream;

import java.util.ArrayList;
import java.util.List;

public class Init {

	public static void main(String[] args) throws RevisionException {
		
		List<Prueba> lista = new ArrayList<>();
		Prueba p = new Prueba();
		
		Prueba p1 = new Prueba("Pepe", "Hola", 1234);
		lista.add(p1);
		Prueba p2 = new Prueba("Lucia", "Adios", 5678);
		lista.add(p2);
		Prueba p3 = new Prueba("Adri", "QUE", 6666);
		lista.add(p3);
		
		p.escrituraFicheroObjetoPath(lista);
		p.lecturaFicheroObjejoPath();
		
	}
}

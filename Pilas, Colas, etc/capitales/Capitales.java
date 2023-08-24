package capitales;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Capitales {

public static void main(String[] args) {
	
	Map<Integer, String> provincias = new HashMap<>();
	
	provincias.put(5001, "Ávila");
	provincias.put(37001, "Salamanca");
	provincias.put(47001, "Valladolid");
	provincias.put(42001, "Soria");
	provincias.put(49001, "Zamora");

	provincias.put(10001, "Cáceres");
	provincias.put(6001, "Badajoz");
	 
	provincias.put(45001, "Toledo");
	provincias.put(2001, "Albacete");
	
	//Recorremos el mapa
	System.out.println("Mostrar el mapa: ");
	for (Map.Entry<Integer, String> elem : provincias.entrySet()) {
		System.out.println(elem.getKey() + " - " + elem.getValue());
	}
	
/*	provincias.forEach((key, val) - > {
		System.out.println(key + " - " + value);
	});
*/
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca el CP de una capital:");
	int codPostal = Integer.valueOf(sc.nextLine());
	sc.close();
	
	if(provincias.containsKey(codPostal)) {
		System.out.println("Esta en nuestro mapa");
	}else {
		System.out.println("El CP np se encuentra en nuestro mapa");
	}
	
	//borrar elementos del mapa
	
	System.out.println("Elimino Valladolid");
	provincias.remove(47001);
	
	System.out.println("Elimino Badajoz");
	provincias.remove(6001);
	
	//Recorremos el mapa
		System.out.println("Mostrar el mapa: ");
		for (Map.Entry<Integer, String> elem : provincias.entrySet()) {
			System.out.println(elem.getKey() + " - " + elem.getValue());
		}
		
		
	//borrar por contenido
	Iterator<Integer> clavesProvincias = provincias.keySet().iterator();
	
	
	while(clavesProvincias.hasNext()) {
		int codigo = clavesProvincias.next();
		String provincia = provincias.get(codigo);
		if(provincia.equalsIgnoreCase("Albacete")) {
			provincias.remove(codigo);
		}
	}
}
	
}

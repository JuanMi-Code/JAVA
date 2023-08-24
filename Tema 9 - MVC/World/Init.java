package tema9_world;

import java.util.Set;

import tema9_world.model.City;
import tema9_world.service.WorldService;
import tema9_world.utils.DBConnection;




public class Init {
	
	public static void main(String[] args) {
		System.out.println("Inicio");

		WorldService service = new WorldService();
		Set<City> ciudades = service.listaCiudades();
		
		ciudades.forEach(elem -> System.out.println(elem));
		
//		System.out.println("Busco la ciudad cuyo id es 689: " + service.getCity(689L));
//		Set<City> ciudades = service.listaCiudades("spain");
		
//		ciudades.forEach(elem -> System.out.println(elem));

//		System.out.println(service.estaCiudadEnPais(689L, "ESP"));
		
		
//		System.out.println("Número de ciudades: " + service.numeroCiudades());
		
		System.out.println("Busco la ciudad cuyo id es 663L: " + service.getCity(663L));
		
		System.out.println("Actualizado? " + service.cambiarNombreCiudad("663", "Pucela"));
		
		System.out.println("Busco la ciudad cuyo id es 663L: " + service.getCity(663L));
		
		
		
		DBConnection.getInstance().destroyConnection();
		System.out.println("Fin");

	}

}


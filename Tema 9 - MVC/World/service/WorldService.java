package tema9_world.service;

import java.util.Set;

import tema9_world.model.City;
import tema9_world.repository.CityRepository;



public class WorldService {
	
	// Solo se hace esto si la tabla es pequeña o si se 
	// recupera un número muy pequeño de datos de forma muy frecuente.
	// Si hay muchos datos, siempre consultas.
	private Set<City> ciudades;
	
	
	public Set<City> listaCiudades() {
		if(ciudades == null || ciudades.isEmpty()) {
			ciudades = CityRepository.getInstance().findAll();
		}
		return ciudades;
	}
	
	
	public boolean existeCiudad(long codigoCiudad) {
		if(ciudades == null || ciudades.isEmpty()) {
			ciudades = CityRepository.getInstance().findAll();
		}
		
		if(ciudades != null) {
			for (City city : ciudades) {
				if(city.getId() == codigoCiudad) {
					return true;
				}
			}
		}
		return false;
	}
	
	public City getCity(long id) {
		if(ciudades == null || ciudades.isEmpty()) {
			ciudades = CityRepository.getInstance().findAll();
		}
		
		if(ciudades != null) {
			for (City city : ciudades) {
				if(city.getId() == id) {
					return city;
				}
			}
		}
		return null;
		
		// En este caso concreto es más eficiente comprobar si existe en la BBDD.
		// Si no tuvieramos los datos en memoria, se consultaría en la BBDD.
//		return CityRepository.getInstance().findById(id);
	}
	
	public Set<City> listaCiudades(String nombrePais) {
		// Se podría extraer el código del país del set con los países.
		return CityRepository.getInstance().findByCountryName(nombrePais);
	}
	
	public boolean estaCiudadEnPais(long codigoCiudad, String codigoPais) {
		if(ciudades == null || ciudades.isEmpty()) {
			ciudades = CityRepository.getInstance().findAll();
		}
		
		if(ciudades != null) {
			for (City city : ciudades) {
				if(city.getId() == codigoCiudad && city.getCountryCode().equalsIgnoreCase(codigoPais)) {
					return true;
				}
			}
		}
		return false;
	}

	public int numeroCiudades() {
		if(ciudades == null || ciudades.isEmpty()) {
			ciudades = CityRepository.getInstance().findAll();
		}
		return ciudades != null ? ciudades.size(): 0;
	}
	
	 public boolean cambiarNombreCiudad(String codigoCiudad, String nuevoNombre) {
		 boolean result = CityRepository.getInstance().update(Long.valueOf(codigoCiudad), nuevoNombre);
		 if(result) {
			 refrescaCiudades();
		 }
		 return result;
	 }

	private void refrescaCiudades() {
		ciudades = CityRepository.getInstance().findAll();
	}	
}

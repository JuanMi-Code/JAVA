package tema9_world.repository;

import java.util.Set;

import tema9_world.dao.CityDAO;
import tema9_world.model.City;

public class CityRepository {
	
	private CityDAO dao;
	
	private static CityRepository instance;
	
	public static synchronized CityRepository getInstance() {
		if(instance == null) {
			instance = new CityRepository();
		}
		return instance;
	}
	
	private CityRepository() {
		dao = new CityDAO();
	}
	
	public Set<City> findAll() {
		return dao.getCities();
	}

	public City findById(long id) {
		return dao.getCity(id);
	}

	public Set<City> findByCountryName(String countryName) {
		return dao.getCities(countryName);
	}

	public boolean update(long id, String newName) {
		return dao.update(id, newName);
	}

}

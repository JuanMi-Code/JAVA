package tema9_world.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import tema9_world.model.City;
import tema9_world.utils.DBConnection;

public class CityDAO {
	
	// Consultas de BBDD
	private final String SELECT_CITIES = "SELECT * FROM CITY";
	private final String SELECT_CITY_BY_ID = "SELECT * FROM CITY WHERE ID=?";
	
	private final String SELECT_CITIES_BY_COUNTRY_NAME = "SELECT C.* FROM CITY C "
			+ "INNER JOIN COUNTRY CO ON CO.CODE = C.COUNTRYCODE "
			+ "WHERE CO.NAME = ?";
	
	private final String UPDATE_CITY_NAME = "UPDATE CITY SET NAME=? WHERE ID=?";
	
	private final String INSERT = "INSERT INTO CITY SELECT MAX(ID) + 1, ?, ?, ?, ? FROM CITY;";
	

	public Set<City> getCities() {
		Set<City> lista = new HashSet<>();
		
		try (PreparedStatement stmt = DBConnection.getInstance().
				getConnection().prepareStatement(SELECT_CITIES)) {
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				City city = new City(rs.getLong("ID"), rs.getString("NAME"), 
						rs.getString("COUNTRYCODE"), rs.getString("DISTRICT"), rs.getLong("POPULATION"));
				lista.add(city);
			}
		} catch (SQLException e) {
			System.err.printf("SQL state:	%s%n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
		}
//		DBConnection.getInstance().destroyConnection();
		return lista;
	}
	
	public City getCity(long id) {
		City city = null;
		
		try (PreparedStatement stmt = DBConnection.getInstance().
				getConnection().prepareStatement(SELECT_CITY_BY_ID)) {
			
			// Preparo el statement antes de la consulta
			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				city = new City(rs.getLong("ID"), rs.getString("NAME"), 
						rs.getString("COUNTRYCODE"), rs.getString("DISTRICT"), rs.getLong("POPULATION"));
			}
		} catch (SQLException e) {
			System.err.printf("SQL state:	%s%n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
		}
		return city;
	}

	public Set<City> getCities(String countryName) {
		Set<City> lista = new HashSet<>();
		
		try (PreparedStatement stmt = DBConnection.getInstance().
				getConnection().prepareStatement(SELECT_CITIES_BY_COUNTRY_NAME)) {
			
			// Preparo el statement antes de la consulta
			stmt.setString(1, countryName);
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				City city = new City(rs.getLong("ID"), rs.getString("NAME"), 
						rs.getString("COUNTRYCODE"), rs.getString("DISTRICT"), rs.getLong("POPULATION"));
				lista.add(city);
			}
		} catch (SQLException e) {
			System.err.printf("SQL state:	%s%n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
		}
		return lista;
	}

	public boolean update(long id, String newName) {
		boolean result = false;		
		try (PreparedStatement stmt = DBConnection.getInstance().
				getConnection().prepareStatement(UPDATE_CITY_NAME)) {
			
			// Preparo el statement antes de la consulta
			stmt.setString(1, newName);
			stmt.setLong(2, id);
			
			System.out.println("Actualizando...");
			
			int row = stmt.executeUpdate();
			if(row > 0) {	
				result = true;
			} 
			System.out.println(result ? "Actualización realizada con éxito!!" : "No se ha podido actualizar...");
			
			
		} catch (SQLException e) {
			System.err.printf("SQL state:	%s%n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

}

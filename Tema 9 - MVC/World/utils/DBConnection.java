package tema9_world.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private final String URL = "jdbc:mysql://127.0.0.1:3306/world";
	private final String USER = "root";
	private final String PASS = "";
	
	private Connection conexion = null;
	
	private static DBConnection instance;
	
	public static synchronized DBConnection getInstance() {
		if(instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}
	
	private DBConnection() {
		System.out.println("Creando la conexión de BBDD...");
		
		// Registro el driver de BBDD
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			this.conexion = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conexión de BBDD creada con éxito!!");
		} catch (SQLException e) {
			System.err.println("Error al crear la conexión con la BBDD...");
			System.err.printf("Mensaje		: %s %n", e.getMessage());
			System.err.printf("SQL state	: %s %n", e.getSQLState());
			System.err.printf("Error code	: %s %n", e.getErrorCode());
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conexion;
	}
	
	public void destroyConnection() {
		try {
			System.out.println("Cerrando la conexión de BBDD...");
			this.conexion.close();
			System.out.println("Conexión de BBDD cerrada con éxito!!");
		} catch (SQLException e) {
			System.err.println("Error al cerrar la conexión con la BBDD...");
			System.err.printf("Mensaje		: %s %n", e.getMessage());
			System.err.printf("SQL state	: %s %n", e.getSQLState());
			System.err.printf("Error code	: %s %n", e.getErrorCode());
			e.printStackTrace();
		} finally {
			instance = null;
		}
	}
	
	

}

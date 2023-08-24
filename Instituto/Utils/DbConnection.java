package Instituto.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private final String URL = "jdbc:mysql://127.0.0.1:3306/cursos";
	private final String USER = "root";
	private final String PASS = "";
	
	private Connection conexion = null;
	private static DbConnection instance;
	
	public static synchronized DbConnection getInstance() {
		if(instance == null) {
			instance = new DbConnection();
		}
		return instance;
	}

	public DbConnection() {
		System.out.println("Crando conexion con BBDD...");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			this.conexion = DriverManager.getConnection(URL,USER,PASS);
			System.out.println("Conexion con BBDD establecida");
		} catch (SQLException e) {
			System.err.println("Mensaje  "+e.getMessage());
			System.err.println("Mensaje  "+e.getSQLState());
			System.err.println("Mensaje  "+e.getErrorCode());
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conexion;
	}
	
	public void destroyConnection() {
		
		try {
			System.out.println("Cerrando conexion...");
			this.conexion.close();
			System.out.println("Conexion cerrada");
		} catch (SQLException e) {
			System.err.println("Mensaje  "+ e.getMessage());
			System.err.println("Mensaje  "+ e.getSQLState());
			System.err.println("Mensaje  "+ e.getErrorCode());
			e.printStackTrace();
		} finally {
			instance = null;
		}
	}
	
}

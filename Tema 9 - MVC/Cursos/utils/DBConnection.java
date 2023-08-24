package cursos.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private final String URL = "jdbc:mysql://127.0.0.1:3306/cursos";
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

	public Connection getConexion() {
		return conexion;
	}
	
	private DBConnection() {
		try {
			System.out.println("Conectando con BBDD...");
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			this.conexion = DriverManager.getConnection(URL,USER,PASS);
			System.out.println("Conexion con BBDD establecida");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void destroyConnection() {
		try {
			System.out.println("Destruyendo conexion con BBDD...");
			this.conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			instance = null;
			System.out.println("conexion con BBDD destruida");

		}
	}
	
}

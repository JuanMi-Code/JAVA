package cursos.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import cursos.model.Alumno;
import cursos.model.AlumnosNotas;
import cursos.utils.DBConnection;

public class AlumnoDao {
	
	private final String INSERT_ALUMNO = "INSERT INTO ALUMNOS VALUES(?,?,?,?,?)";
	private final String SELECT_ALUMNOS = "SELECT * FROM ALUMNOS";
	private final String UPDATE_NOM_ALUMNO = "UPDATE ALUMNOS SET NOMBRE = ? WHERE CODIGOALUMNO = ?";
	private final String DELETE_ALUM = "DELETE FROM ALUMNOS WHERE CODIGOALUMNO = ?";
	private final String SELECT_NOTAS_ALUMNOS = "SELECT AL.NOMBRE, EV.NOTAFINAL FROM ALUMNOS AL JOIN EVALUACIONES EV ON EV.CODIGOALUMNO = AL.CODIGOALUMNO";
	
	
	public void insertarAlumno(Alumno alumno) {
		
		try (PreparedStatement stmt = DBConnection.getInstance()
				.getConexion().prepareStatement(INSERT_ALUMNO)) {
			
			stmt.setInt(1, alumno.getCodigoAlumno());
			stmt.setString(2, alumno.getNombre());
			stmt.setString(3, alumno.getApellidos());
			stmt.setString(4, alumno.getTelefono());
			stmt.setString(5, alumno.getFechaNacimiento());
			
			System.out.println("Insertando...");
			
			int row = stmt.executeUpdate();
			if (row > 0) {
				System.out.println("Insertado con exito");
			}else {
				System.out.println("Error al insertar");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void mostrarAlumnos() {
		List<Alumno> lista = new ArrayList<>();
		try (PreparedStatement stmt = DBConnection.getInstance()
				.getConexion().prepareStatement(SELECT_ALUMNOS)){
			
			System.out.println("Buscando alumnos...");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Alumno alumno = new Alumno(rs.getInt("codigoAlumno"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("telefono"), rs.getString("fechanacimiento"));
				lista.add(alumno);
			}
			System.out.println("Alumnos encontrados");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void actualizarNombreAlumno(int codigo, String nombre) {

		try (PreparedStatement stmt = DBConnection.getInstance()
				.getConexion().prepareStatement(UPDATE_NOM_ALUMNO)) {
			
			System.out.println("Actualizando informacion...");
			
			stmt.setString(1, nombre);
			stmt.setInt(2, codigo);
			
			int row = stmt.executeUpdate();
			if (row > 0) {
				System.out.println("Informacion actualizada");
			} else {
				System.out.println("Fallo al actualizar");

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarAlumno(int codigo) {
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConexion().prepareStatement(DELETE_ALUM)){
			
			stmt.setInt(1, codigo);
			
			int row = stmt.executeUpdate();
			if (row > 0) {
				System.out.println("Eliminado correctamente");
			}else {
				System.out.println("Error al eliminar");

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void mostrarNotasAlumnos() {
		List<AlumnosNotas> lista = new ArrayList<>();
		
		try(PreparedStatement stmt = DBConnection.getInstance().getConexion().prepareStatement(SELECT_NOTAS_ALUMNOS)){
			
			System.out.println("Buscando notas...");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				AlumnosNotas an = new AlumnosNotas(rs.getString("NOMBRE"), rs.getInt("NOTAFINAL"));
				lista.add(an);
			}
			System.out.println("Notas encontradas");
			
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
			
		} catch (SQLException e) {
				e.printStackTrace();
			}
		}

}

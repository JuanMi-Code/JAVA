package com.venancio.daw.proyectoClaseSSNN.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.venancio.daw.proyectoClaseSSNN.model.Alumno;
import com.venancio.daw.proyectoClaseSSNN.model.AlumnosNotas;
import com.venancio.daw.proyectoClaseSSNN.utils.DBConnection;

public class AlumnoDao {
	
	private final String INSERT_ALUMNO = "INSERT INTO ALUMNOS VALUES(?,?,?,?,?)";
	private final String SELECT_ALUMNOS = "SELECT * FROM ALUMNOS";
	private final String DELETE_ALUM = "DELETE FROM ALUMNOS WHERE CODIGOALUMNO = ?";
	private final String SELECT_NOTAS_ALUMNOS = "SELECT AL.NOMBRE, AL.Apellidos, CU.Curso, EV.NOTAFINAL, EV.Observaciones FROM ALUMNOS AL JOIN EVALUACIONES EV ON EV.CODIGOALUMNO = AL.CODIGOALUMNO JOIN cursos CU ON CU.CodigoCurso = EV.CodigoCurso";
	private final String SELECT_NOTA_ALUMNO = "SELECT AL.NOMBRE, AL.Apellidos, CU.Curso, EV.NOTAFINAL, EV.Observaciones FROM ALUMNOS AL JOIN EVALUACIONES EV ON EV.CODIGOALUMNO = AL.CODIGOALUMNO JOIN cursos CU ON CU.CodigoCurso = EV.CodigoCurso WHERE AL.CodigoAlumno = ?;";
	private final String UPDATE_ALUMNO = "UPDATE ALUMNOS SET NOMBRE = ?, Apellidos = ?, Telefono = ?, FechaNacimiento = ? WHERE CODIGOALUMNO = ?";
	private final String SELECT_IDALUMNO = "SELECT * FROM ALUMNOS WHERE CODIGOALUMNO = ?";
	
	private final String UPDATE_NOM_ALUMNO = "UPDATE ALUMNOS SET NOMBRE = ? WHERE CODIGOALUMNO = ?";
	
	public void insertarAlumno(Alumno alumno) {
		
		try (PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(INSERT_ALUMNO)) {
			
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

	public List<Alumno> mostrarAlumnos() {
		List<Alumno> lista = new ArrayList<>();
		try (PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(SELECT_ALUMNOS)){
			
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
		
		return lista;
	}
	
	public Alumno mostrarAlumno(int id) {
		Alumno a = new Alumno();
		try (PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(SELECT_IDALUMNO)){
			
			System.out.println("Buscando alumno...");
			
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				a.setCodigoAlumno(id);
				a.setNombre(DELETE_ALUM);
				a.setApellidos(DELETE_ALUM);
				a.setTelefono(DELETE_ALUM);
				a.setFechaNacimiento(DELETE_ALUM);
			}
			System.out.println("Alumnos encontrados");
				System.out.println(a);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return a;

	}

	public void actualizarNombreAlumno(int codigo, String nombre) {

		try (PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(UPDATE_NOM_ALUMNO)) {
			
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
				.getConnection().prepareStatement(DELETE_ALUM)){
			
			System.out.println("Eliminado alumno...");
			
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

	public List<AlumnosNotas> mostrarNotasAlumnos() {
		List<AlumnosNotas> lista = new ArrayList<>();
		
		try(PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(SELECT_NOTAS_ALUMNOS)){
			
			System.out.println("Buscando notas...");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				AlumnosNotas an = new AlumnosNotas(rs.getString("NOMBRE"), rs.getString("APELLIDOS"),rs.getString("CURSO"), rs.getInt("NOTAFINAL"), rs.getString("OBSERVACIONES"));
				lista.add(an);
			}
			System.out.println("Notas encontradas");
			
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
			
		} catch (SQLException e) {
				e.printStackTrace();
			}	
		
		return lista;
	}

	public void mostrarNotaAlumno(int codigo) {
		List<AlumnosNotas> lista = new ArrayList<>();
		
		try(PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(SELECT_NOTA_ALUMNO)){
			
			System.out.println("Buscando notas del alumno...");
			
			stmt.setInt(1, codigo);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				AlumnosNotas an = new AlumnosNotas(rs.getString("NOMBRE"), rs.getString("APELLIDOS"),rs.getString("CURSO"), rs.getInt("NOTAFINAL"), rs.getString("OBSERVACIONES"));
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

	public void modificarAlumno(int codigoAlumno, String nombreAl, String apellidos, String telefonoAl, String fechaNac) {
		
		try (PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(UPDATE_ALUMNO)) {
			
			System.out.println("Actualizando informacion...");
			
// UPDATE ALUMNOS SET NOMBRE = ?, Apellidos = ?, Telefono = ?, FechaNacimiento = ? WHERE CODIGOALUMNO = ?			
			
			stmt.setString(1, nombreAl);
			stmt.setString(2, apellidos);
			stmt.setString(3, telefonoAl);
			stmt.setString(4, fechaNac);
			stmt.setInt(5, codigoAlumno);
			
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

	
}

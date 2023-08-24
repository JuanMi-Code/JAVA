package com.venancio.daw.proyectoClaseSSNN.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.venancio.daw.proyectoClaseSSNN.model.AlumnosNotas;
import com.venancio.daw.proyectoClaseSSNN.model.Evaluacion;
import com.venancio.daw.proyectoClaseSSNN.utils.DBConnection;

public class EvaluacionDao {
	
	private final String SELECT_EVALUACIONES = "SELECT * FROM EVALUACIONES";
	private final String INSERT_EVALUACIONES = "INSERT INTO EVALUACIONES VALUES (?,?,?,?)";
	private final String DELETE_EVALUACIONES = "DELETE FROM EVALUACIONES WHERE CODIGOALUMNO=? AND CODIGOCURSO=?";
	private final String UPDATE_EVALUACIONES = "UPDATE EVALUACIONES SET NOTAFINAL:=? AND OBSERVACIONES:=? WHERE CODIGOALUMNO=? AND CODIGOCURSO=?";
	private final String SELECT_NOTA_ALUMNO = "SELECT AL.NOMBRE, AL.Apellidos, CU.Curso, EV.NOTAFINAL, EV.Observaciones FROM EVALUACIONES EV JOIN ALUMNOS AL ON EV.CODIGOALUMNO = AL.CODIGOALUMNO JOIN cursos CU ON CU.CodigoCurso = EV.CodigoCurso WHERE AL.CodigoAlumno = ?;";

	public List<Evaluacion> mostrarEvaluaciones() {
		
		List<Evaluacion> lista = new ArrayList<>();
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(SELECT_EVALUACIONES)){
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Evaluacion eva = new Evaluacion(rs.getInt("CODIGOALUMNO"),rs.getInt("CODIGOCURSO"),rs.getInt("NOTAFINAL"),rs.getString("OBSERVACIONES"));
				lista.add(eva);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return lista;
	}
	
	public void insertarEvaluacion(int codAlu, int codCur, int notaFinal, String observaciones) {
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(INSERT_EVALUACIONES)){
			
			stmt.setInt(1, codAlu);
			stmt.setInt(2, codCur);
			stmt.setInt(3, notaFinal);
			stmt.setString(4, observaciones);
			
			int row = stmt.executeUpdate();
			if (row > 0) {
				System.out.println("Insertado correctamente");
			}else {
				System.out.println("Error al insertar");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	public void borrarEvaluacion(int codAlu, int codCur) {
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(DELETE_EVALUACIONES)){
			
			stmt.setInt(1, codAlu);
			stmt.setInt(2, codCur);
			
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
	
	public void actualizarEvaluacion(int codAlu, int codCur, int notaFinal, String observaciones) {
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(UPDATE_EVALUACIONES)){
			
			stmt.setInt(1, notaFinal);
			stmt.setString(2, observaciones);
			stmt.setInt(3, codAlu);
			stmt.setInt(4, codCur);
			
			int row = stmt.executeUpdate();
			if (row > 0) {
				System.out.println("Actualizado correctamente");
			}else {
				System.out.println("Error al actualizar");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public List<AlumnosNotas> mostrarNotaAlumno(int codigo) {
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
		
		return lista;
		
		}

}

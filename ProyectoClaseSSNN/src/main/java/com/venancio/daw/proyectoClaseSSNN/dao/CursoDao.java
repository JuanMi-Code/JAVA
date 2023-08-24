package com.venancio.daw.proyectoClaseSSNN.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.venancio.daw.proyectoClaseSSNN.model.Curso;
import com.venancio.daw.proyectoClaseSSNN.utils.DBConnection;

public class CursoDao {

	private final String INSERTAR_CURSO = "INSERT INTO CURSOS VALUES(?,?,?,?,?,?)";
	private final String SELECT_CURSO = "SELECT * FROM CURSOS";
	private final String UPDATE_CURSO = "UPDATE CURSOS SET CURSO = ?, FECHAINICIO = ?, FECHAFIN = ?, HORAINICIO = ?, HORAFIN = ? WHERE CODIGOCURSO = ?";
	private final String DELETE_CURSO = "DELETE FROM CURSOS WHERE CODIGOCURSO = ?";
	
	public void insertarCurso(Curso curso) {
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(INSERTAR_CURSO)){
			
			stmt.setInt(1, curso.getCodigoCurso());
			stmt.setString(2, curso.getCurso());
			stmt.setString(3, curso.getFechaIncio());
			stmt.setString(4, curso.getFechaFin());
			stmt.setString(5, curso.getHoraInicio());
			stmt.setString(6, curso.getHoraFin());
			
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

	public List<Curso> mostrarCursos() {

		List<Curso> lista = new ArrayList<>();
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(SELECT_CURSO)){
			
			System.out.println("Buscando cursos...");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Curso curso = new Curso(rs.getInt("CODIGOCURSO"),rs.getString("CURSO"),rs.getString("FECHAINICIO"),rs.getString("FECHAFIN"),rs.getString("HORAINICIO"),rs.getString("HORAFIN"));
				lista.add(curso);
			}
			System.out.println("Cursos encontrados");
			
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	public void updateCurso(int codigoCurso, String curso, String fechaInicio, String fechaFin, String horaInicio) {
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(UPDATE_CURSO)){
			
			stmt.setString(1, curso);
			stmt.setString(2, fechaInicio);
			stmt.setString(3, fechaFin);
			stmt.setString(4, horaInicio);
			stmt.setInt(5, codigoCurso);
			
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
	
	public void eliminarCurso(int codigo) {
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConnection().prepareStatement(DELETE_CURSO)){
			
			System.out.println("Eliminado curso...");
			
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

}

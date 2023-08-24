package cursos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import cursos.model.Curso;
import cursos.utils.DBConnection;

public class CursoDao {

	private final String INSERTAR_CURSO = "INSERT INTO CURSOS VALUES(?,?,?,?,?,?)";
	private final String SELECT_CURSO = "SELECT * FROM CURSOS";
	
	public void insertarCurso(Curso curso) {
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConexion().prepareStatement(INSERTAR_CURSO)){
			
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

	public void mostrarCursos() {

		List<Curso> lista = new ArrayList<>();
		
		try(PreparedStatement stmt = DBConnection.getInstance()
				.getConexion().prepareStatement(SELECT_CURSO)){
			
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
		
	}

}

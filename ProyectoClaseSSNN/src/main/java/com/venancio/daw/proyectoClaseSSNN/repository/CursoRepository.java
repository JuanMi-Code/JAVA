package com.venancio.daw.proyectoClaseSSNN.repository;

import java.util.List;

import com.venancio.daw.proyectoClaseSSNN.dao.CursoDao;
import com.venancio.daw.proyectoClaseSSNN.model.Curso;

public class CursoRepository {

	private CursoDao dao;
	private static CursoRepository instance;

	public static synchronized CursoRepository getInstance() {
		if(instance == null) {
			instance = new CursoRepository();
		}
		return instance;
	}
	
	private CursoRepository() {
		dao = new CursoDao();
	}

	public void insertarCurso(Curso curso) {
		dao.insertarCurso(curso);
	}

	public List<Curso> mostrarCursos() {
		return dao.mostrarCursos();
	}

	public void updateCurso(int codigoCurso, String curso, String fechaInicio, String fechaFin, String horaInicio,
			String horaFin) {
		dao.updateCurso(codigoCurso, curso, fechaInicio, fechaFin, horaInicio);
		
	}

	public void eliminarCurso(int codigo) {
		dao.eliminarCurso(codigo);
	}
	
	
	
}

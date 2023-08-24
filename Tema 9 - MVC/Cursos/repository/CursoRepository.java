package cursos.repository;

import cursos.dao.CursoDao;
import cursos.model.Curso;

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

	public void mostrarCursos() {
		dao.mostrarCursos();
	}
	
	
	
}

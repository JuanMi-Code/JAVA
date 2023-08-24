package cursos.repository;

import cursos.dao.AlumnoDao;
import cursos.model.Alumno;

public class AlumnoRepository {

	private AlumnoDao dao;
	private static AlumnoRepository instance;
	
	public static synchronized AlumnoRepository getInstance() {
		if(instance == null) {
			instance = new AlumnoRepository();
		}
		return instance;
	}
	
	private AlumnoRepository() {
		dao = new AlumnoDao();
	}

	public void insertarAlumno(Alumno alumno) {
		dao.insertarAlumno(alumno);
	}

	public void mostrarAlumnos() {
		dao.mostrarAlumnos();
	}

	public void actualizarNombreAlumno(int codigo, String nombre) {
		dao.actualizarNombreAlumno(codigo,nombre);
	}

	public void eliminarAlumno(int i) {
		dao.eliminarAlumno(i);
	}

	public void mostrarNotasAlumnos() {
		dao.mostrarNotasAlumnos();
	}


}

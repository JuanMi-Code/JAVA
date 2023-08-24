package cursos.services;

import cursos.model.Alumno;
import cursos.model.Curso;
import cursos.repository.AlumnoRepository;
import cursos.repository.CursoRepository;

public class CursosServices {

	public void anadirAlumo(Alumno alumno) {
		AlumnoRepository.getInstance().insertarAlumno(alumno);
	}

	public void mostrarAlumnos() {
		AlumnoRepository.getInstance().mostrarAlumnos();
	}

	public void anadirCurso(Curso curso) {
		CursoRepository.getInstance().insertarCurso(curso);
	}

	public void mostrarCursos() {
		CursoRepository.getInstance().mostrarCursos();
	}

	public void actualizarNombreAlumno(int codigo, String nombre) {
		AlumnoRepository.getInstance().actualizarNombreAlumno(codigo,nombre);
	}

	public void eliminarAlumno(int i) {
		AlumnoRepository.getInstance().eliminarAlumno(i);
	}

	public void mostrarNotasAlumnos() {
		AlumnoRepository.getInstance().mostrarNotasAlumnos();
	}

	
}

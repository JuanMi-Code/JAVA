package com.venancio.daw.proyectoClaseSSNN.service;

import java.util.List;

import com.venancio.daw.proyectoClaseSSNN.model.Alumno;
import com.venancio.daw.proyectoClaseSSNN.model.AlumnosNotas;
import com.venancio.daw.proyectoClaseSSNN.model.Curso;
import com.venancio.daw.proyectoClaseSSNN.model.Evaluacion;
import com.venancio.daw.proyectoClaseSSNN.repository.AlumnoRepository;
import com.venancio.daw.proyectoClaseSSNN.repository.CursoRepository;
import com.venancio.daw.proyectoClaseSSNN.repository.EvaluacionRepository;

public class CursosServices {	
	
	//ALUMNO
	
	public List<Alumno> mostrarAlumnos() {
		return AlumnoRepository.getInstance().mostrarAlumnos();
	}
	
	public Alumno mostrarAlumno(int id) {
		return AlumnoRepository.getInstance().mostrarAlumno(id);
	}
	
	public List<AlumnosNotas> mostrarNotasAlumnos() {
		return AlumnoRepository.getInstance().mostrarNotasAlumnos();
	}
	
	public void anadirAlumo(Alumno alumno) {
		AlumnoRepository.getInstance().insertarAlumno(alumno);
	}
		
	
	public void eliminarAlumno(int i) {
		AlumnoRepository.getInstance().eliminarAlumno(i);
	}
	
	public void actualizarNombreAlumno(int codigo, String nombre) {
		AlumnoRepository.getInstance().actualizarNombreAlumno(codigo,nombre);
	}

	public void modificarAlumno(int i, String string, String string2, String string3, String string4) {
		AlumnoRepository.getInstance().modificarAlumno(i,string,string2,string3,string4);
	}
	
	public List<AlumnosNotas> mostrarNotaAlumno(int codigo) {
		return EvaluacionRepository.getInstance().mostrarNotaAlumno(codigo);
	}

	
	//EVALUACION
	
	public void insertarEvaluacion(int codAlu, int codCur, int notaFinal, String observaciones) {
		EvaluacionRepository.getInstance().insertarEvaluacion(codAlu, codCur, notaFinal, observaciones);
	}
	

	public List<Evaluacion> mostrarEvaluaciones() {
		return EvaluacionRepository.getInstance().mostrarEvaluaciones();
	}
	
	public void actualizarEvaluacion(int codAlu, int codCur, int notaFinal, String observaciones) {
		EvaluacionRepository.getInstance().actualizarEvaluacion(codAlu, codCur, notaFinal, observaciones);
	}
	
	public void borrarEvaluacion(int codAlu, int codCur) {
		EvaluacionRepository.getInstance().borrarEvaluacion(codAlu, codCur);
	}
	
	
	//CURSO
	
	public void anadirCurso(Curso curso) {
		CursoRepository.getInstance().insertarCurso(curso);
	}

	
	public List<Curso> mostrarCursos() {
		return CursoRepository.getInstance().mostrarCursos();
	}
	
	public void updateCurso(int codigoCurso, String curso, String fechaInicio, String fechaFin, String horaInicio, String horaFin) {
		CursoRepository.getInstance().updateCurso(codigoCurso, curso, fechaInicio, fechaFin, horaInicio, horaFin);
	}
	
	public void eliminarCurso(int codigo) {
		CursoRepository.getInstance().eliminarCurso(codigo);
	}
	
	
}

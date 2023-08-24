package com.venancio.daw.proyectoClaseSSNN.repository;

import java.util.List;

import com.venancio.daw.proyectoClaseSSNN.dao.AlumnoDao;
import com.venancio.daw.proyectoClaseSSNN.model.Alumno;
import com.venancio.daw.proyectoClaseSSNN.model.AlumnosNotas;

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

	public List<Alumno> mostrarAlumnos() {
		return dao.mostrarAlumnos();
	}
	
	public Alumno mostrarAlumno(int id) {
		return dao.mostrarAlumno(id);
	}

	public void actualizarNombreAlumno(int codigo, String nombre) {
		dao.actualizarNombreAlumno(codigo,nombre);
	}

	public void eliminarAlumno(int i) {
		dao.eliminarAlumno(i);
	}

	public List<AlumnosNotas> mostrarNotasAlumnos() {
		return dao.mostrarNotasAlumnos();
	}

	public void mostrarNotaAlumno(int i) {
		dao.mostrarNotaAlumno(i);
	}

	public void modificarAlumno(int codigoAlumno, String nombreAl, String apellidos, String telefonoAl, String fechaNac) {
		dao.modificarAlumno(codigoAlumno, nombreAl, apellidos, telefonoAl, fechaNac);
	}





}

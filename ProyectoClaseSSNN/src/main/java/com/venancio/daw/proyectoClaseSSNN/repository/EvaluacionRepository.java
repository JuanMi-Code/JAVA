package com.venancio.daw.proyectoClaseSSNN.repository;

import java.util.List;

import com.venancio.daw.proyectoClaseSSNN.dao.EvaluacionDao;
import com.venancio.daw.proyectoClaseSSNN.model.AlumnosNotas;
import com.venancio.daw.proyectoClaseSSNN.model.Evaluacion;

public class EvaluacionRepository {

	private EvaluacionDao dao;
	private static EvaluacionRepository instance;
	
	public static synchronized EvaluacionRepository getInstance() {
		if(instance == null) {
			instance = new EvaluacionRepository();
		}
		return instance;
	}
	
	private EvaluacionRepository() {
		dao = new EvaluacionDao();
	}

	public List<Evaluacion> mostrarEvaluaciones() {		
		return dao.mostrarEvaluaciones();
	}

	public void insertarEvaluacion(int codAlu, int codCur, int notaFinal, String observaciones) {
		 dao.insertarEvaluacion(codAlu, codCur, notaFinal, observaciones);
	}

	public void borrarEvaluacion(int codAlu, int codCur) {
		dao.borrarEvaluacion(codAlu, codCur);
	}

	public void actualizarEvaluacion(int codAlu, int codCur, int notaFinal, String observaciones) {
		dao.actualizarEvaluacion(codAlu, codCur, notaFinal, observaciones);
	}
	
	public List<AlumnosNotas> mostrarNotaAlumno(int codigo) {
		return dao.mostrarNotaAlumno(codigo);
	}
	
}

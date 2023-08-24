package cursos;

import cursos.model.Alumno;
import cursos.model.Curso;
import cursos.services.CursosServices;
import cursos.utils.DBConnection;

public class Init {
	public static void main(String[] args) {
		
		DBConnection.getInstance();
		
		CursosServices service = new CursosServices();
		
	//1	
		//service.mostrarAlumnos();
	//2	
		//service.mostrarCursos();
	//3	
		//service.mostrarNotasAlumnos();
	//4	
		
	//5	
		//service.anadirAlumo(new Alumno(501, "juanmi", "hercua", "000000000", "19990303"));
	//6	
		
	//7	
		//service.eliminarAlumno(501);
	//8	
		
		
		//service.anadirCurso(new Curso(500, "COSITAS", "20000101", "20000201", "12:00", "12:01"));
		//service.actualizarNombreAlumno(501,"DJM");
		
	}
}

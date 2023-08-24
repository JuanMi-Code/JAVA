package com.venancio.daw.proyectoClaseSSNN.model;

import java.util.Objects;

public class AlumnosNotas {

	private String nombre;
	private String apellidos;
	private String curso;
	private int notaFinal;
	private String observaciones;
	
	public AlumnosNotas(String nombre, String apellidos, String curso, int notaFinal, String observaciones) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.notaFinal = notaFinal;
		this.observaciones = observaciones;
	}

	public  String getNombre() {
		return nombre;
	}

	public  String getApellidos() {
		return apellidos;
	}

	public  String getCurso() {
		return curso;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "AlumnosNotas [nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + ", notaFinal="
				+ notaFinal + ", observaciones=" + observaciones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, curso, nombre, notaFinal, observaciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlumnosNotas other = (AlumnosNotas) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(curso, other.curso)
				&& Objects.equals(nombre, other.nombre) && notaFinal == other.notaFinal
				&& Objects.equals(observaciones, other.observaciones);
	}		
}

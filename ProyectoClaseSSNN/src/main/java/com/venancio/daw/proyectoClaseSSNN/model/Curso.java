package com.venancio.daw.proyectoClaseSSNN.model;

import java.util.Objects;

public class Curso {

	private int codigoCurso;
	private String curso;
	private String fechaIncio;
	private String fechaFin;
	private String horaInicio;
	private String horaFin;
	
	public Curso(int codigoCurso, String curso, String fechaIncio, String fechaFin, String horaInicio, String horaFin) {
		this.codigoCurso = codigoCurso;
		this.curso = curso;
		this.fechaIncio = fechaIncio;
		this.fechaFin = fechaFin;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}
	
	public Curso() {
		
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public String getCurso() {
		return curso;
	}

	public String getFechaIncio() {
		return fechaIncio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setFechaIncio(String fechaIncio) {
		this.fechaIncio = fechaIncio;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return "Curso [codigoCurso=" + codigoCurso + ", curso=" + curso + ", FechaIncio=" + fechaIncio + ", FechaFin="
				+ fechaFin + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaFin, fechaIncio, codigoCurso, curso, horaFin, horaInicio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(fechaFin, other.fechaFin) && Objects.equals(fechaIncio, other.fechaIncio)
				&& codigoCurso == other.codigoCurso && Objects.equals(curso, other.curso)
				&& Objects.equals(horaFin, other.horaFin) && Objects.equals(horaInicio, other.horaInicio);
	}
	
	
}

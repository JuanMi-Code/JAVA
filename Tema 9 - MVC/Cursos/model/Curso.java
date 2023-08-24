package cursos.model;

import java.util.Objects;

public class Curso {

	private int codigoCurso;
	private String curso;
	private String FechaIncio;
	private String FechaFin;
	private String horaInicio;
	private String horaFin;
	
	public Curso(int codigoCurso, String curso, String fechaIncio, String fechaFin, String horaInicio, String horaFin) {
		this.codigoCurso = codigoCurso;
		this.curso = curso;
		FechaIncio = fechaIncio;
		FechaFin = fechaFin;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public String getCurso() {
		return curso;
	}

	public String getFechaIncio() {
		return FechaIncio;
	}

	public String getFechaFin() {
		return FechaFin;
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
		FechaIncio = fechaIncio;
	}

	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return "Curso [codigoCurso=" + codigoCurso + ", curso=" + curso + ", FechaIncio=" + FechaIncio + ", FechaFin="
				+ FechaFin + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(FechaFin, FechaIncio, codigoCurso, curso, horaFin, horaInicio);
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
		return Objects.equals(FechaFin, other.FechaFin) && Objects.equals(FechaIncio, other.FechaIncio)
				&& codigoCurso == other.codigoCurso && Objects.equals(curso, other.curso)
				&& Objects.equals(horaFin, other.horaFin) && Objects.equals(horaInicio, other.horaInicio);
	}
	
	
}

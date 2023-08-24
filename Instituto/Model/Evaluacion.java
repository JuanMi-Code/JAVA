package Instituto.Model;

import java.util.Objects;

public class Evaluacion {

	private int codigoCurso;
	private String curso;
	private String fechaInicio;
	private String horaInicio;
	private String horaFin;
	
	public Evaluacion(int codigoCurso, String curso, String fechaInicio, String horaInicio, String horaFin) {
		this.codigoCurso = codigoCurso;
		this.curso = curso;
		this.fechaInicio = fechaInicio;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public String getCurso() {
		return curso;
	}

	public String getFechaInicio() {
		return fechaInicio;
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

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return "Evaluacion [codigoCurso=" + codigoCurso + ", curso=" + curso + ", fechaInicio=" + fechaInicio
				+ ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoCurso, curso, fechaInicio, horaFin, horaInicio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evaluacion other = (Evaluacion) obj;
		return codigoCurso == other.codigoCurso && Objects.equals(curso, other.curso)
				&& Objects.equals(fechaInicio, other.fechaInicio) && Objects.equals(horaFin, other.horaFin)
				&& Objects.equals(horaInicio, other.horaInicio);
	}
	
	
}

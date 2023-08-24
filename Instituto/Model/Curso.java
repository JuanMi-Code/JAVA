package Instituto.Model;

import java.util.Objects;

public class Curso {

	private int codigoAlumno;
	private int codigoCurso;
	private int notaFinal;
	private String observaciones;
	
	public Curso(int codigoAlumno, int codigoCurso, int notaFinal, String observaciones) {
		this.codigoAlumno = codigoAlumno;
		this.codigoCurso = codigoCurso;
		this.notaFinal = notaFinal;
		this.observaciones = observaciones;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Curso [codigoAlumno=" + codigoAlumno + ", codigoCurso=" + codigoCurso + ", notaFinal=" + notaFinal
				+ ", observaciones=" + observaciones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoAlumno, codigoCurso, notaFinal, observaciones);
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
		return codigoAlumno == other.codigoAlumno && codigoCurso == other.codigoCurso && notaFinal == other.notaFinal
				&& Objects.equals(observaciones, other.observaciones);
	}

}

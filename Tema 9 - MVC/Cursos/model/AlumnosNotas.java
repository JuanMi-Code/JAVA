package cursos.model;

import java.util.Objects;

public class AlumnosNotas {

	private String nombre;
	private int nota;
	
	public AlumnosNotas(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public synchronized String getNombre() {
		return nombre;
	}

	public synchronized int getNota() {
		return nota;
	}

	public synchronized void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public synchronized void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "AlumnoNotas [nombre=" + nombre + ", nota=" + nota + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, nota);
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
		return Objects.equals(nombre, other.nombre) && nota == other.nota;
	}
	
	
}

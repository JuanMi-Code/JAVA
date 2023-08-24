package Instituto.Model;

import java.util.Objects;

public class Alumno {

	private int codigoAlumno;
	private String nombre;
	private String Apellidos;
	private int Telefono;
	private String FechaNacimiento;
	
	public Alumno(int codigoAlumno, String nombre, String apellidos, int telefono, String fechaNacimiento) {
		this.codigoAlumno = codigoAlumno;
		this.nombre = nombre;
		Apellidos = apellidos;
		Telefono = telefono;
		FechaNacimiento = fechaNacimiento;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public int getTelefono() {
		return Telefono;
	}

	public String getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Alumno [codigoAlumno=" + codigoAlumno + ", nombre=" + nombre + ", Apellidos=" + Apellidos
				+ ", Telefono=" + Telefono + ", FechaNacimiento=" + FechaNacimiento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Apellidos, FechaNacimiento, Telefono, codigoAlumno, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(Apellidos, other.Apellidos) && Objects.equals(FechaNacimiento, other.FechaNacimiento)
				&& Telefono == other.Telefono && codigoAlumno == other.codigoAlumno
				&& Objects.equals(nombre, other.nombre);
	}
	
	
}

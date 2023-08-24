package ejercicios3.ejericio1;

import java.util.Objects;
import java.util.Random;

public class Persona {

	private Persona sig;
	private int edad;
	
	public Persona() {
		Random r = new Random();
		this.edad = r.nextInt(74)+7;
		//this.edad = (int) (Math.random()*80+7);
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getInfo() {
		return edad;
	}
	public Persona getSig() {
		return sig;
	}
	public void setInfo(int info) {
		this.edad = info;
	}
	public void setSig(Persona sig) {
		this.sig = sig;
	}

	@Override
	public String toString() {
		return "\nEdad: " + edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, sig);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(sig, other.sig);
	}
	
	

}

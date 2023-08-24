package examen;

import java.util.Objects;

public class Nodo {

	private Nodo Sig;
	private int info;
	//Constructor
	public Nodo(int info) {
		this.info = info;
	}
	//Geters y Seters
	public Nodo getSig() {
		return Sig;
	}
	public void setSig(Nodo sig) {
		Sig = sig;
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	//HashCode y Equals
	@Override
	public int hashCode() {
		return Objects.hash(Sig, info);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nodo other = (Nodo) obj;
		return Objects.equals(Sig, other.Sig) && info == other.info;
	}
	//To String
	@Override
	public String toString() {
		return "|"+info+"|";
	}
	
	
}

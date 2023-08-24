package ejercicios2_1;

import java.util.Objects;

public class Nodo {

	private int info;
	private Nodo sig;
	
	//public Nodo(int info, Nodo sig) {
	public Nodo(int info) {
		this.info = info;
		//this.sig = sig;
	}
	
	public int getInfo() {
		return info;
	}
	public Nodo getSig() {
		return sig;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(info, sig);
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
		return info == other.info && Objects.equals(sig, other.sig);
	}
	
	
	
}

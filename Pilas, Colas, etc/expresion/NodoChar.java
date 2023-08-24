package expresion;

import java.util.Objects;

public class NodoChar {
	
	private Character info;
	private NodoChar sig;
	
	public NodoChar(Character info) {
		this.info = info;
	}
	
	public Character getInfo() {
		return info;
	}
	public void setInfo(Character info) {
		this.info = info;
	}
	public NodoChar getSig() {
		return sig;
	}
	public void setSig(NodoChar sig) {
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
		NodoChar other = (NodoChar) obj;
		return Objects.equals(info, other.info) && Objects.equals(sig, other.sig);
	}
}

package examen.examen;

import java.util.Random;

public class Chorizo extends Producto{

	private boolean iberico;
	

	public Chorizo() {
		
		Random r =new Random();
		int numero = r.nextInt(30)+5;
		super.setPrecio(numero);
		
		if(super.getPrecio()>12) {
			this.iberico = true;
		}
		int pesoChori = r.nextInt(3)+1;
		super.setPeso(pesoChori);
	}

	public boolean isIberico() {
		return iberico;
	}
	public void setIberico(boolean iberico) {
		this.iberico = iberico;
	}

	@Override
	public String toString() {
		return "Chorizo iberico=" + iberico +" "+ super.toString();
	}

}

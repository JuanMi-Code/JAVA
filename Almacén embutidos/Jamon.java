package examen.examen;

import java.util.Random;

public class Jamon extends Producto{

	private boolean promocion;
	
	public Jamon() {
		
		Random r =new Random();
		int numero = r.nextInt(700)+300;
		super.setPrecio(numero);
		
		int pesoJamon = r.nextInt(10)+5;
		super.setPeso(pesoJamon);
				
		if (this.promocion) {
			super.setPrecio(((super.getPrecio()*15)/100));
		}

	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public String toString() {
		return "Jamon promocion=" + promocion +" "+super.toString();
	}
	
	
}

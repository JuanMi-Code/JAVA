package examen.examen;

import java.util.Random;

public class Producto {
	
	private static int cont = 1;

	private int identificador;
	private double precio;
	private int peso;
	private String marca;
	
	public Producto() {
		this.identificador = cont;
		
		Random r = new Random();
		int aleaMarca = r.nextInt(5)+1;
		if (aleaMarca == 1) {
			this.marca ="El pozo";
		}else if (aleaMarca == 2) {
			this.marca ="5j";
		}else if (aleaMarca == 3) {
			this.marca ="Joselito";
		}else if (aleaMarca == 4) {
			this.marca ="Blazquez";
		}else if (aleaMarca == 5) {
			this.marca ="Maximiliano";
		}
		this.cont++;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "identificador=" + identificador + ", precio=" + precio + ", peso=" + peso + ", marca=" + marca;
	}
	
	
	
}

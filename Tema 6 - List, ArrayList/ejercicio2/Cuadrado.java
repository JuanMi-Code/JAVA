package ejercicio2;

public class Cuadrado extends Figura{
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return lado*lado;
	}

	@Override
	public double calculaPerimetro() {
		return lado*4;
		
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + " color="+super.color +"]";
	}

	public void imprimeUnMensajito() {
		System.out.println("hola");
	}
	
}

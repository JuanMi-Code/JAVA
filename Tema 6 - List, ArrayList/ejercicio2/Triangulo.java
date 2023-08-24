package ejercicio2;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;

	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura=altura;
	}

	@Override
	public double calculaArea() {
		return (base*altura)/2;
	}

	@Override
	public double calculaPerimetro() {
		//suponemos que es un triangulo rectangulo
		return base + altura + Math.sqrt(Math.pow(altura, 2)+Math.pow(base, 2));
	}

	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", color="+color+"]";
	}
	
	

	
	
}

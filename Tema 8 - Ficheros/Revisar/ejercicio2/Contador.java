package venancio.daw.tema8.ejercicio2;

public class Contador {

	private int minimo;
	private int maximo;
	private int valor;
	
	public Contador(int minimo, int maximo, int valor) {
		this.minimo = minimo;
		this.maximo = maximo;
		this.valor = valor;
	}
	
	public void incrementar(int cantidad) throws DemasiadosDinerosException {
		
		if (cantidad>maximo|| (cantidad + valor) > maximo ) {
			throw new DemasiadosDinerosException("Pasas el máximo xaval");
		}else {
			this.valor+=cantidad;
			System.out.println(valor);
		}
	}
	public void decrementar(int cantidad) throws MinimoException {
		
		if ((valor - cantidad) < minimo) {
			throw new MinimoException("No se puede, quedarias por debajo del minimo, xaval");
		}else {
			this.valor-=cantidad;
			System.out.println(valor);
		}
	}
	
	public int getminimo() {
		return minimo;
	}
	public int getMaximo() {
		return maximo;
	}
	public int getValor() {
		return valor;
	}
	public void setminimo(int minimo) {
		this.minimo = minimo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Contador [minimo=" + minimo + ", maximo=" + maximo + ", valor=" + valor + "]";
	}
}

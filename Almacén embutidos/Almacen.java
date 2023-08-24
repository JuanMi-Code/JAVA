package examen.examen;

public class Almacen{

	private int alto=5;
	private int ancho=5;
	private Producto[][] prod = new Producto[ancho][alto];
		
	public Almacen() {
	}
	public Almacen(int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public boolean agregarProducto(Producto producto) {

		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[i].length; j++) {
				if(prod[i][j]==null) {
					prod[i][j]=producto;
					return true;
					//break;
				}
			}
		}		
		return false;
	}
	public boolean eliminarProducto(int identificador) {
		
		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[i].length; j++) {
				if(prod[i][j].getIdentificador() == identificador) {
					prod[i][j]=null;
					return true;
				}
			}
		}
		return false;
	}
	public void calcularTotal() {
		int total=0;
		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[i].length; j++) {
				total += prod[i][j].getPrecio();
			}
		}
		System.out.println("Precio de todos los embutidos: "+ total+"€");
	}
	public void calcularMarca(String marca) {
		int total = 0;
		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[i].length; j++) {
				
				if(prod[i][j].getMarca().equals(marca)) {
					total += prod[i][j].getPrecio();
				}	
			}
		}
		System.out.println("Precio de todos los embutidos de la marca "+marca+": "+total+"€");
	}
	public void calcularColumna(int columna) {
		int total = 0;
		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[i].length; j++) {
				
				if(j==columna) {
					total += prod[i][j].getPrecio();
				}	
			}
		}
		System.out.println("Precio de la columna: "+total+"€");
	}
	public void mostrarEstanteria() {
		
		System.out.println("---- PRODUCTOS EN LA ESTANTERIA ----");
		
		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[i].length; j++) {
				System.out.println("Fila "+i+", columna "+j+" "+prod[i][j]);
				
				if(prod[i][j] instanceof Jamon) {
					System.out.println("\tEs un Jamon\n");
				}
				if(prod[i][j] instanceof Chorizo) {
					System.out.println("\tEs un Chorizo\n");
				}
			}
		}
		
	}
	
}

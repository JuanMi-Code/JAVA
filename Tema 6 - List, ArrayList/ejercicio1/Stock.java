package tema6.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Stock{

	private ArrayList<Producto> productos;
		
	public Stock() {
		this.productos=new ArrayList();
	}
	
	public List<Producto> productosAgotados() {
		List<Producto> agotados = new ArrayList<>();
		
		for (Producto producto : productos) {
			if(producto.getCantidad() == 0) {
				agotados.add(producto);
			}
		}
		return agotados;
	}
	
	public List<Producto> productosBajoMinimos() {
		List<Producto> minimos = new ArrayList<>();
		for (Producto producto : productos) {
			if(producto.getCantidad() < producto.getMinimo()){
				minimos.add(producto);
			}
		}
		return minimos;
	}
	
	public void anadir(Producto producto) {
		productos.add(producto);
	}
	public boolean borrar(int codigo) {
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getCodigo()==codigo) {
				productos.remove(i);
				return true;
			}
		}
		return false;
	}
	public Producto buscar(int codigo) {
		for (Producto producto : productos) {
			if(producto.getCodigo()==codigo) {
				return producto;
			}
		}
		return null;
	}
	
	public List<Producto> getStock(){
		return productos;
	}

	@Override
	public String toString() {
		return "Stock [productos=" + productos + "]";
	}
}

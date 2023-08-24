package tema6.ejercicio1;

public class LineaFactura{
	
	private int codigo;
	private float precio;
	private int cantidad;
	
	/**
	 * @param codigo
	 * @param precio
	 * @param cantidad
	 */
	public LineaFactura(Producto producto, int cantidad) {
		this.codigo = producto.getCodigo();
		this.precio = producto.getPrecio()*cantidad;
		this.cantidad = cantidad;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "\n\tCodigo: " + codigo + ", Precio: " + precio +"€"+ ", Cantidad: " + cantidad;
	}
	
}

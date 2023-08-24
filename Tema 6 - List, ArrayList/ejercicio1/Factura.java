package tema6.ejercicio1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Factura {

	private LocalDateTime fecha;
	private int numeroFactura;
	private List<LineaFactura> lineasFactura;
	private boolean pagada;
	
	private static int codFact=0;

	/**
	 * @param numeroFactura
	 * @param lineasFactura
	 * @param pagada
	 */
//	public Factura(int numeroFactura, List<LineaFactura> lineasFactura, boolean pagada) {
	public Factura() {
		this.fecha = LocalDateTime.now();
		this.numeroFactura = ++codFact;
		this.lineasFactura = new ArrayList<>();
		this.pagada = false;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public List<LineaFactura> getLineasFactura() {
		return lineasFactura;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public void setLineasFactura(List<LineaFactura> lineasFactura) {
		this.lineasFactura = lineasFactura;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	@Override
	public String toString() {
		return fecha + ", Nº Factura: " + numeroFactura + lineasFactura
				+ "\npagada:" + pagada;
	}	
}

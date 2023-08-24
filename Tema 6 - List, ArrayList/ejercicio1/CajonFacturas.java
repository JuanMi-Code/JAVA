package tema6.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class CajonFacturas{

	private List<Factura> facturas;
	
	public CajonFacturas() {
		this.facturas = new ArrayList<>();
	}
	
	public void buscar(Factura factura){
		//hacerlo como en la otra clase con un for o for each
		facturas.get(facturas.indexOf(factura));
	}
	public void anadir(Factura factura) {
		facturas.add(factura);
	}
	public void facturasPendientesCobro(){
		for (int i = 0; i < facturas.size(); i++) {
			if(facturas.get(i).isPagada()) {
				System.out.println(facturas.get(i));
			}	
		}
	}

	@Override
	public String toString() {
		return "CajonFacturas [facturas=" + facturas + "]";
	}
	
	
}

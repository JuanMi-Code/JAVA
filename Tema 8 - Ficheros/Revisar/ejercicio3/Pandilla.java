package venancio.daw.tema8.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pandilla {
	
	private int capacidad;
	private List<Amigo> lista;
	
	public Pandilla(int capacidad) {
		this.capacidad = capacidad;
		this.lista = new ArrayList<>();
	}
	
	public void add(Amigo amigo) throws PandillaCompletaException, NoMeGustaTuNombreException{
		
		int total = lista.size();
		
		if (total >= capacidad) {
			throw new PandillaCompletaException("La pandilla está completa, se siente");
		}else {

			if (amigo.getNombre().charAt(amigo.getNombre().length()-1) == 's') {
				throw new NoMeGustaTuNombreException("Que asco de nombre, pa tu casa");
			} else {
				lista.add(amigo);
				System.out.println("\nAñadido: \n"+amigo);
			}
			
		}
	}

	public int getCapacidad() {
		return capacidad;
	}

	public List<Amigo> getLista() {
		return lista;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setLista(List<Amigo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Pandilla [capacidad=" + capacidad + ", lista=" + lista + "]";
	}
}

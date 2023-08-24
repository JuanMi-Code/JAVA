package ejercicio1_profe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Videoclub {
	private List<Pelicula> listaPeliculas;
	private List<Cliente> listaClientes;
	private List<Prestamo> listaPrestamos;

	public Videoclub() {
		this.listaClientes = new ArrayList<>();
		this.listaPeliculas = new ArrayList<>();
		this.listaPrestamos = new ArrayList<>();
	}

	public boolean aniadirPelicula(Pelicula p) {
		boolean result = false;
		if (!this.listaPeliculas.contains(p)) {
			this.listaPeliculas.add(p);
			result = true;
		}
		return result;
	}

	public boolean aniadirCliente(Cliente c) {
		boolean result = false;
		if (!this.listaClientes.contains(c)) {
			this.listaClientes.add(c);
			result = true;
		}
		return result;
	}

	public boolean aniadirPrestamo(Prestamo p) {
		boolean result = false;
		if (!this.listaPrestamos.contains(p)) {
			this.listaPrestamos.add(p);
			result = true;
		}
		return result;
	}

	/**
	 * Busca la pelicula correspondiente al código introducido en el parámetro
	 * 
	 * @param codPelicula
	 * @return la pelicula correspondiente o null si no la encuentra
	 */
	public Pelicula buscarPelicula(int codPelicula) {
		for (int i = 0; i < listaPeliculas.size(); i++) {
			if (listaPeliculas.get(i).getCodigo() == codPelicula) {
				return listaPeliculas.get(i);
			}
		}
		return null;
	}

	/**
	 * Busca el cliente correspondiente al número de carnet introducido.
	 * @param numCarnet del cliente
	 * @return el cliente correspondiente o null si no le encuentra
	 */
	public Cliente buscarCliente(int numCarnet) {
		for (Cliente elem : listaClientes) {
			if (elem.getNumeroCarnet() == numCarnet) {
				return elem;
			}
		}
		return null;
	}

	public List<Prestamo> getPrestamos() {
		return listaPrestamos;
	}

	/**
	 * Devuelve el listado de prestamos que tiene el cliente con numCarnet
	 * 
	 * @param numCarnet
	 * @return listado de prestamos
	 */
	public List<Prestamo> getPrestamos(int numCarnet) {
		List<Prestamo> prestamosCliente = new ArrayList<>();
		for (int i = 0; i < listaPrestamos.size(); i++) {
			if(listaPrestamos.get(i).getCliente().getNumeroCarnet() == numCarnet) {
				prestamosCliente.add(listaPrestamos.get(i));
			}
		}
		return prestamosCliente;
	}

	public List<Pelicula> getPeliculas() {
		return listaPeliculas;
	}
	
//	public int cantidadPrestamos(int numCarnet) {
//		return getPrestamos(numCarnet).size();
//	}	

	/**
	 * Permite realizar devoluciones de peliculas para un cliente concreto
	 * @param codPelicula
	 * @param numCarnet
	 * @return true si la devolución se ha realizado correctamente
	 */
	public boolean devolucion(int codPelicula, int numCarnet) {
//		for (Prestamo prestamo : listaPrestamos) {
//			if(prestamo.getCliente().getNumeroCarnet() == numCarnet &&
//					prestamo.getPelicula().getCodigo() == codPelicula) {
//				listaPrestamos.remove(prestamo);
//				return true;
//			}
//		}
		
		// Opción 2: Utilizar Iterator
		Iterator<Prestamo> it = listaPrestamos.iterator();
		while(it.hasNext()) {
			Prestamo p = it.next();
			if(p.getCliente().getNumeroCarnet() == numCarnet &&
					p.getPelicula().getCodigo() == codPelicula) {
				listaPrestamos.remove(p);
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Método que permite obtener todos los prestamos que se han pasado de la fecha
	 * @return listado de prestamos morosos
	 */
	public List<Prestamo> getPrestamosMorosos() {
		List<Prestamo> prestamosMorosos = new ArrayList<>();
		LocalDate fechaActual = LocalDate.now();
		for (int i = 0; i < listaPrestamos.size(); i++) {
			if(fechaActual.isAfter(listaPrestamos.get(i).getFechaDevolucion())) {
				prestamosMorosos.add(listaPrestamos.get(i));
			}
		}
		return prestamosMorosos;
	}
	
	public boolean isPrestada(int codPelicula) {
		for (Prestamo prestamo : listaPrestamos) {
			if(prestamo.getPelicula().getCodigo() == codPelicula) {				
				return true;	
			}
		}
		return false;
	}
	
	public boolean isPrestada(Pelicula pelicula) {
		for (Prestamo prestamo : listaPrestamos) {
			if(prestamo.getPelicula().equals(pelicula)) {				
				return true;	
			}
		}
		return false;
	}
	
	/**
	 * Método para mostrar todos los préstamos
	 */
	public void mostrarPrestamos() {
		if(!listaPrestamos.isEmpty()) {
			System.out.println("CLIENTE\tPELICULA\tFECHA_PRE\tFECHA_DEV");
			for (Prestamo pres : listaPrestamos) {
				System.out.print(pres.getCliente().getNombre());
				System.out.print("\t" + pres.getPelicula().getTitulo());
				System.out.print("\t" + pres.getFechaPrestamo());
				System.out.print("\t" + pres.getFechaDevolucion());
				System.out.println();
			}
		} else {
			System.out.println("No hay prestamos");
		}
	}
	
	/**
	 * Método para mostrar solo los préstamos de morosos
	 */
	public void mostrarPrestamosMosoros() {
		List<Prestamo> morosos = this.getPrestamosMorosos();
		if(!morosos.isEmpty()) {
			System.out.println("CLIENTE\tPELICULA\tFECHA_PRE\tFECHA_DEV");
			for (Prestamo pres : morosos) {
				System.out.print(pres.getCliente().getNombre());
				System.out.print("\t" + pres.getPelicula().getTitulo());
				System.out.print("\t" + pres.getFechaPrestamo());
				System.out.print("\t" + pres.getFechaDevolucion());
				System.out.println();
			}
		} else {
			System.out.println("No hay morosos");
		}
	}
	
	/**
	 * Método para mostrar todo el catálogo de películas
	 */
	public void mostrarPeliculas() {
		if(!listaPeliculas.isEmpty()) {
			System.out.println("CODIGO\tPELICULA");
			for (Pelicula peli : listaPeliculas) {
				System.out.print(peli.getCodigo());
				System.out.print("\t" + peli.getTitulo());
				System.out.println();
			}
		} else {
			System.out.println("No películas en el catálogo");
		}
	}

}

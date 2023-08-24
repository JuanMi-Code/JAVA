package ficherosEjercicio1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Planta implements Serializable{

	private int codigo;
	private String nombreVulgar;
	private String nombreCientifico;
	private double precio;
	private int cantidad;
	
	public Planta(int codigo, String nombreVulgar, String nombreCientifico, double precio, int cantidad) {
		this.codigo = codigo;
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.precio = precio;
		this.cantidad = cantidad;
		decuento();
	}
	
	private void decuento() {
//		- 20% para las plantas con una cantidad inferior a 10
//		- 30% para las plantas con una cantidad entre 10 y 50
//		- 40% para las plantas cuya cantidad supere los 50
		double aux = 0;
		if (this.cantidad<10) {
			aux = this.precio;
			this.precio = aux - (aux*0.1);
			System.out.println("Descuento del 10% aplicado");
		} else if (this.cantidad>=10 && this.cantidad <= 50) {
			aux = this.precio;
			this.precio = aux - (aux*0.3);
			System.out.println("Descuento del 10% aplicado");
		}else if (this.cantidad>50) {
			aux = this.precio;
			this.precio = aux - (aux*0.4);
			System.out.println("Descuento del 10% aplicado");
		}else {
			System.out.println("No tiene descuentos");
		}
	}

	public void escribirFicheroObjeto(Planta planta) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			System.err.println("Vamos a escribir la planta en el fichero...");
			fos = new FileOutputStream("C:\\Users\\alumnoT\\OneDrive - Educacyl\\Escritorio\\DAW JM\\Programacion\\tema8\\src\\main\\java\\ficherosEjercicio1\\Ficheros\\Plantas.bin");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(planta);
			
			//se puede descomentar y asi los añade todos directamente
			
//			oos.writeObject(new Planta(1, "Mimosa", "Acacia dealbata", 19.5, 16));
//			oos.writeObject(new Planta(2, "Camelia", "Camellia japonica", 9.95, 28));
//			oos.writeObject(new Planta(3, "Hortensia", "Hydrangea macrophylla", 19.5, 4));
//			oos.writeObject(new Planta(4, "Acebo", "Ilex Aquifolium", 18, 55));
//			oos.writeObject(new Planta(5, "Lirio", "Iris germanica", 3, 36));
//			oos.writeObject(new Planta(6, "Madreselva", "Lonicera japonica", 2.50, 40));
//			oos.writeObject(new Planta(7, "Cala", "Zantedeschia aethiopica", 8.90, 9));
//			oos.writeObject(new Planta(8, "Tejo", "Taxus bacata", 16.50, 5));
//			oos.writeObject(new Planta(9, "Romero", "Salvia rosmarinus", 4.5, 68));
//			oos.writeObject(new Planta(10, "Azalea", "Rhododendron indicum", 10, 20));
			
			System.err.println("Planta añadida correctamente");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void lecturaFicheroObjeto() {
		Planta planta = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			System.err.println("Vamos a leer el objeto planta del fichero: ");
			fis = new FileInputStream("C:\\Users\\alumnoT\\OneDrive - Educacyl\\Escritorio\\DAW JM\\Programacion\\tema8\\src\\main\\java\\ficherosEjercicio1\\Ficheros\\Plantas.bin");
			ois = new ObjectInputStream(fis);
			
			while (true) {
				try {
					planta = (Planta) ois.readObject();
					System.out.println("Planta leída: "+planta + "\n");
				} catch (EOFException e){
					System.err.println("Fin de la lectura");
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (ois != null) {
					ois.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombreVulgar() {
		return nombreVulgar;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Planta [codigo=" + codigo + ", nombreVulgar=" + nombreVulgar + ", nombreCientifico=" + nombreCientifico
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, codigo, nombreCientifico, nombreVulgar, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		return cantidad == other.cantidad && codigo == other.codigo
				&& Objects.equals(nombreCientifico, other.nombreCientifico)
				&& Objects.equals(nombreVulgar, other.nombreVulgar) && precio == other.precio;
	}
}

package ficherosEjercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Disco {

	private String nombre;
	private String ciudad;
	private int telefono;
	private List<String> personas = new ArrayList<>();
	
	public Disco(String nombre, String ciudad, int telefono) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.telefono = telefono;
	}
	
	public Disco() {
		
	}
	//si no hay ; lanza FaltaPuntoYComaException
	//si no hay direccion se pone Toledo
	public void arreglarArchivo() throws FaltaPuntoYComaException{
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			System.out.println("Leyendo...");
			
			archivo = new File("src\\main\\java\\ficherosEjercicio4\\Ficheros\\personas.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;
			
			while((linea=br.readLine())!=null) {
				
				String[] separado = linea.split(";");
				int contador = 0;
				
				for (int i = 0; i < separado.length; i++) {
					if (separado[i].matches("^[a-zA-Z]+\\s+[a-zA-Z]+$")||separado[i].matches("^[a-zA-Z]+$")) {
						
						personas.add(separado[i]);
						contador++;
						
					} else if (separado[i].matches("^[0-9]+$")) {
						
						if (contador == 1){
							contador = 0;
							personas.add("Toledo");
							personas.add(separado[i]);
						}else {
							personas.add(separado[i]);
						}
						
					} else {
						throw new FaltaPuntoYComaException("Falta ; cohone");
					}
				}
				
			}
			System.out.println("Leido con exito");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i));
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disco other = (Disco) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(nombre, other.nombre)
				&& telefono == other.telefono;
	}

	@Override
	public String toString() {
		return "Disco [nombre=" + nombre + ", ciudad=" + ciudad + ", telefono=" + telefono + "]";
	}
		
}

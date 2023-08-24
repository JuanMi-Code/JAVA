package venancio.daw.tema8.ejercicio3;

public class Init {
	public static void main(String[] args) throws PandillaCompletaException, NoMeGustaTuNombreException {
		

		Pandilla gilipollas = new Pandilla(2);
		Amigo adri = new Amigo("Adrian", "Hernandez");
		Amigo juanmi = new Amigo("Juanmi","Hernandez");
		Amigo anonimo = new Amigo("Anonimos","Cállate");
		
		Pandilla gilipollas2 = new Pandilla(3);
		
		try {
			gilipollas.add(juanmi);
			gilipollas.add(adri);
			gilipollas.add(anonimo);
		} catch (PandillaCompletaException s) {
			s.printStackTrace();
		} finally {
			System.err.println("Estamos llenos: "+gilipollas.getCapacidad());
		}
		
		try {
			gilipollas2.add(juanmi);
			gilipollas2.add(adri);
			gilipollas2.add(anonimo);
		} catch (NoMeGustaTuNombreException a) {
			a.printStackTrace();
		} finally {
			System.err.println("Mierda de nombre");
		}
		
	}
}

package venancio.daw.tema8.ejercicio2;

public class Init {

	public static void main(String[] args) throws MinimoException, DemasiadosDinerosException {
		
		Contador cont = new Contador(0,1000,500);
		 
		cont.decrementar(510);
		cont.incrementar(510);
		
		try {
			cont.decrementar(510);
		} catch (MinimoException e1) {
			System.out.println( "Pasado limite inferior" + e1.getMessage());
			e1.printStackTrace();
		}
		
		try {
			cont.incrementar(510);
		} catch (DemasiadosDinerosException e) {
			System.out.println( "Pasado limite superior" + e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
}

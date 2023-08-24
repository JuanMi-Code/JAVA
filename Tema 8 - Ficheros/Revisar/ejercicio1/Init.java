package venancio.daw.tema8.ejercicio1;

public class Init {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		CuentaCorriente cuenta = new CuentaCorriente(800500100,"Antonio",500);
		
		cuenta.ingreso(100);
		cuenta.reintegro(900);
		
		try {
			cuenta.reintegro(100);
		}catch (SaldoInsuficienteException s){
			s.printStackTrace(); //Imprime traza de error
		} finally {
			System.out.println("Salida tras el reintegro: "+cuenta.getSaldo());
		}
		
	}
}

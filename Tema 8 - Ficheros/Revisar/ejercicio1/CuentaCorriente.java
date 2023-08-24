package venancio.daw.tema8.ejercicio1;

public class CuentaCorriente{

	private long numeroCuenta;
	private String titular;
	private float saldo;
	
	public CuentaCorriente(long numeroCuenta, String titular, float saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void ingreso(float cantidad) {
		saldo += cantidad;
		System.out.println("Ingresado");
		System.out.println("Saldo actual: " + saldo);
	}
	
	public void reintegro(float cantidad) throws SaldoInsuficienteException {
		if (cantidad <= saldo) {
			saldo -= cantidad;
			System.out.println("Retirados: " + cantidad);
			System.out.println("Saldo actual: " + saldo);
		}else {
			throw new SaldoInsuficienteException("No se pudo realizar el ingreso");
		}
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	
}

package venancio.daw.tema8.ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {

	private String matricula;
	private LocalDateTime hora;
	private boolean pagado;
	

	
	public Ticket(String matricula, LocalDateTime hora, boolean pagado) {
		this.matricula = matricula;
		this.hora = hora;
		this.pagado = pagado;
	}

	public void calcularPrecio(LocalDateTime antes) throws TicketException {	

		LocalDateTime ahora = LocalDateTime.now();
		Duration diferencia = Duration.between(antes, ahora);				
		int dias,horas,minutos;
		dias = (int) diferencia.toDaysPart();
		horas = diferencia.toHoursPart();
		minutos = diferencia.toMinutesPart();
		
		double precio=0;
		if (dias!=0) {
			precio += dias*17;
		}
		if (horas!=0) {
			precio += horas*1.70;
		}
		if (minutos!=0) {
			precio += minutos*0.03;
		}
		if (precio < 0) {
			throw new TicketException("Precio Negativo wtf");
		}else {
			System.out.println(precio+"€");
		}

	}

	public String getMatricula() {
		return matricula;
	}
	public LocalDateTime getHora() {
		return hora;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	@Override
	public String toString() {
		return "Ticket [matricula=" + matricula + ", hora=" + hora + ", pagado=" + pagado + "]";
	}
}

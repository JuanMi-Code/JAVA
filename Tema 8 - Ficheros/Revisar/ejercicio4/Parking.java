package venancio.daw.tema8.ejercicio4;

import java.util.ArrayList;

public class Parking {

	private int capacidad;
	private ArrayList<Ticket> tickets;
	
	public Parking(int capacidad) {
		this.capacidad = capacidad;
		this.tickets = new ArrayList<>();
	}
	
	public void add(Ticket ticket) throws TicketException {
		
		if (tickets.size() >= capacidad) {
			throw new TicketException("Capacidad al completo");
		} else {
			boolean flag = false;
			for (int i = 0; i < tickets.size(); i++) {
				
				if (ticket.getMatricula() == tickets.get(i).getMatricula()) {
					throw new TicketException("Esa matricula ya está en el parking");
				}else {
					flag=true;
				}
			}
			if (flag = true){
				tickets.add(ticket);
				System.out.println("Añadido ticket: "+ticket);
			}
		}
	}
	public void remove(Ticket ticket) throws TicketException {
		
		if (ticket.isPagado()) {
			tickets.remove(ticket);
			System.out.println("ADIOSSS");
		}else {
			throw new TicketException("Ticket no pagado");
		}
	}

	public int getCapacidad() {
		return capacidad;
	}
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	@Override
	public String toString() {
		return "Parking [capacidad=" + capacidad + ", tickets=" + tickets + "]";
	}
	
}

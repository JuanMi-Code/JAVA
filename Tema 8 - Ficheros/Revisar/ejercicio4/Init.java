package venancio.daw.tema8.ejercicio4;

import java.time.LocalDateTime;

public class Init {

	public static void main(String[] args) throws TicketException {
		
		Parking p = new Parking(4);
		
		Ticket t0 = new Ticket("0000AAA", LocalDateTime.of(2022,5,5,18,59,0,0), false);
			p.add(t0);
		Ticket t1 = new Ticket("0000BBB", LocalDateTime.of(2022,5,4,18,59,0,0), false);
			p.add(t1);
		Ticket t2 = new Ticket("0000CCC", LocalDateTime.of(2022,5,3,18,59,0,0), false);
			p.add(t2);
		Ticket t3 = new Ticket("0000DDD", LocalDateTime.of(2023,5,3,18,59,0,0), false);
			p.add(t3);
			
			t1.calcularPrecio(t1.getHora());
			//t3.calcularPrecio(t3.getHora());
			t1.setPagado(true);
			p.remove(t1);
		


		
	}
}

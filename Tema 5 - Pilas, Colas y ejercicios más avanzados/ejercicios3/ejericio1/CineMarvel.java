package ejercicios3.ejericio1;

public class CineMarvel {

	public static void main(String[] args) {
		
		final double de_7_14 = 3;
		final double de_15_17 = 4;
		final double de_18 = 5;
		
		Cola cola = new Cola();
		
		cola.rellenar(cola);
			
		cola.print();
		
		int recaudar = 0;
		//pagar
		while(!cola.isEmpty()) {
			int edad = cola.dequeue();
			
			System.out.println("Persona de "+edad + " - ");
			//cobrar segun edad
			if(edad>=7 && edad<=14) {
				recaudar += de_7_14;
				System.out.println(de_7_14 + "€");
			}else if (edad >= 15 && edad <= 17) {
				recaudar += de_15_17;
				System.out.println(de_15_17 + "€");
			}else if (edad >= 18) {
				recaudar += de_18;
				System.out.println(de_18 + "€");
			}System.out.println();
		}
		System.out.println("El cine ha recaudado: "+recaudar);
	}
	
}

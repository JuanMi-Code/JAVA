package Ejercicios3;

public class Ejercicio6 {
	
	private static int movimientos = 1;
	
	public static void main(String[] args) {
		
		int nDiscos=3;
		System.out.println("Algoritmo torres de Haboi con "+nDiscos+" discos");
		int tOrigen = 1, tAux = 2, tDestino =3;
		hanoi(nDiscos, tOrigen, tAux, tDestino);
	}
	
	private static void hanoi(int nDiscos, int tOrigen, int tAux, int tDestino) {	
		//Caso base; cuando solo tengo un disco en el origen
		if (nDiscos==1) {
			mover(tOrigen,tDestino);
		}else {
			hanoi(nDiscos-1, tOrigen, tDestino, tAux);
			mover(tOrigen,tDestino);
			hanoi(nDiscos-1, tAux, tOrigen, tDestino);
		}
	}
	
	private static void mover(int tOrigen, int tDestino) {
		System.out.println(movimientos++ + ": "+tOrigen+" -> "+tDestino);
	}
}

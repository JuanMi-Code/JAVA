package Ejercicios1;

public class Ejercicio10 {

	public static void main(String[] args) {
		
 		int arr[][] = new int[5][5];
		int numero = 0;
		int fila = 1;
		int sumaResta=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			
				arr[i][j]=numero;

				if (numero==arr.length-1) {
					sumaResta=1;
				}
				
				if(sumaResta==1) {
					numero--;
				}else {
					numero++;
				}
			}
			sumaResta=0;
			numero=fila;
			fila++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/*	arr[i][j]=numero;

	if (numero==4) {
		numero=0;
	}
	numero++;
*/
/* fila 0 nada
 * fila 1 posicion 4
 * fila 2 posiciones 3 y 4
 * fila 3 posiciones 2, 3 y 4
 * fila 4 posiciones 1, 2, 3 y 4
 */

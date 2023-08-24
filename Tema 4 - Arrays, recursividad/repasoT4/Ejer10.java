
package repasoT4;

public class Ejer10 {

	public static void main(String[] args) {
		
		int [][] arr = new int[5][5];
		int numero = 0;
		int bandera = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(numero == 4) {
					bandera = 1;
				}
				
				if (bandera == 0) {
					arr[i][j]=numero;
					numero++;
				}else {
					arr[i][j]=numero;
					numero--;
				}			
			}
			numero = i+1;
			bandera = 0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		
	}
}

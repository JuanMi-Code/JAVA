package repasoT4;

public class Ejer7 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int[] arrF = new int [3];
		int[] arrC = new int [3];
		
		int num=1, fila=1,columna=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}num=1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		
		
		int contC=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (j==0) {
					arrC[j] += arr[i][j];
				}else if (j==1) {
					arrC[j] += arr[i][j];
				}
				else if (j==2) {
					arrC[j] += arr[i][j];
				}
				
			}
		}
		System.out.println("Columnas");
		for (int i : arrC) {
			System.out.print(i+" ");
		}
		
		int contF=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (i==0) {
					arrF[i] += arr[i][j];
				}else if (i==1) {
					arrF[i] += arr[i][j];
				}
				else if (i==2) {
					arrF[i] += arr[i][j];
				}
				
			}
		}
		System.out.println("\nFilas");
		for (int i : arrF) {
			System.out.print(i+" ");
		}
		
		
		
		
	}
}

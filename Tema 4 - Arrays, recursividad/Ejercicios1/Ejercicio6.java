package Ejercicios1;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		final int TAMANO = 10;
		int cont = 0;
		int arr[][] = new int[TAMANO][TAMANO];
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {
				//if(i==0&&j==0||i==1&&j==1||i==2&&j==2||i==3&&j==3) {
				if (i==cont&&j==cont) {
					arr[i][j]=1;
					cont++;
				}else {
					arr[i][j]=0;
				}
			}
		}	
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

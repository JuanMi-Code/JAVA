package prueba2;

public class Init3 {

	public static void main(String[] args) {
		
		final int FILAS = 2;
		final int COLUMNAS = 2;
		
		int [][] arr4= new int [FILAS] [COLUMNAS];
		for (int i=0; i < arr4.length; i++) {
			for (int j=0; j<arr4[i].length;j++) {
				
				//System.out.println("Mete numerito para la segunda matriz: ");
				//arr2 [i][j] = Integer.valueOf(sc.nextLine());
				//Para que los valores los meta aleatoriamente
				arr4 [i][j] = (int) (Math.random()*10);
				//valor2 = arr2 [i][j];
			}
		}
		mostrar1Matriz(arr4);
		String nombre="hola";
		muestraMatriz(arr4, nombre);
		
				//suma de 2 matricesen otra matriz
				int [][] arr1= new int [2] [2];
				int [][] arr2= new int [2] [2];
				int [][] arrSuma= new int [2] [2];
				for (int i=0; i < arr4.length; i++) {
					for (int j=0; j<arr4[i].length;j++) {
						
						arr1[i][j] = (int) (Math.random()*10);
						arr2 [i][j] = (int) (Math.random()*10);
						arrSuma [i][j] = arr1[i][j] + arr2[i][j];
					}
				}
				//----------------FIN----------------
	}
	
	private static void muestraMatriz(int [][] mat, String nombre) {
		System.out.println("El contenido de la matriz \""+nombre+"\": ");
		for (int[] fila:mat) {
			for (int elem :fila) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}
		
	}
	
	private static void mostrar1Matriz(int [][] arr4) {
		
		for (int i=0; i < arr4.length; i++) {
			for (int j=0; j<arr4[i].length;j++) {
				
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}

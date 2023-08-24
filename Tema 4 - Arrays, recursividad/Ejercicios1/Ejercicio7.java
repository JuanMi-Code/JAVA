package Ejercicios1;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		final int TAMANO=4;
		int arr[][]=new int [TAMANO][TAMANO];
		int arr2[]=new int[TAMANO];
		int arr3[]=new int[TAMANO];
		//creamos primer contenido de la array principal
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=(int)(Math.random()*10);
			}
		}
		int contadorFilas=0;
		int columna=0;
		int fila=0;
		int suma =0;
		//accedemos al contenido del array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//obtenemos los numeros, su suma, y los anadimos a la otra array
				if(i==fila) {
					arr2[fila]+=arr[i][j];
				}
				contadorFilas++;
				//con esto hacemos que cuente por individual cada fila
				if (contadorFilas==TAMANO){
					fila++;
					contadorFilas=0;
				}
			}
		}
		//hacemos que se recorra el array TAMANO veces y que coja los valores de cada columna
		int contadorColumnas=0;
		while (contadorColumnas<TAMANO) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					
					if(j==columna) {
						arr3[columna]+=arr[i][j];
					}
				}
			}
			columna++;
			contadorColumnas++;
		}

		//representamos
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		System.out.println("\n-------Filas------------------");
		for(int i=0;i<arr2.length;i++) {
			System.out.print("\t"+arr2[i]+"\n");
		}
		System.out.println("-------Columnas-----------------");
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}

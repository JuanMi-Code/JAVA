package Ejercicios1;

public class Ejercicio5 {

	public static void main(String[] args) {

		int arr[]=new int[50];
//Anadimos contenido al array		
		for(int i=1;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
		}
//Mostramos el array		
		for(int i=1;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}			
		System.out.println("\n-------------");
//validamos y mostramos los numeros que no estan en el array
		int contador=0;
		int aux=0;
		
		for(int a=1;a<=100;a++) {
			for(int i=0;i<arr.length;i++) {
				if (arr[i]==a) {
					contador++;
				}
			}
			if(contador==0) {
				System.out.print(a + ",");
			}
			contador=0;
		}
		
/*		for(int a=1;a<=100;a++) {
			for(int i=0;i<arr.length;i++) {
				//System.out.print(arr[i]+" ");
				if(arr[i]!=contador) {
					aux=contador;
				}
			}
			contador++;
			System.out.print(aux+" ");
		}
*/	}
}

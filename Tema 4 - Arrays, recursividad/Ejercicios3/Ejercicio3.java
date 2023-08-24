package Ejercicios3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,50};
		int valor = 4;
		int inicio=0;
		int ultimo=arr.length;
		System.out.println(busquedaBinaria(valor, arr, inicio, ultimo));
	}
	
	public static int busquedaBinaria(int valor, int arr[], int inicio, int ultimo) {
		
		int calculo = (inicio+ultimo)/2;
		
		if(valor==arr[calculo]) {
			return calculo;
		}else if (valor > arr[calculo]) {
			return busquedaBinaria(valor, arr, calculo+1, ultimo);
		}else{
			return  busquedaBinaria(valor, arr, calculo, calculo-1);
		}
	}
}

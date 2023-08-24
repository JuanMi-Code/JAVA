package Ejercicios1;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		int [] numeros = {34,54,12,85,45};
		int [] indices = new int [numeros.length];
		
		int[] aux = new int [numeros.length];
		
		//copia del array numeros
		for (int i = 0; i < aux.length; i++) {
			aux[i] = numeros[i];
		}
		
		for (int i = 0; i < aux.length; i++) {
			int posMayor=0;
			for (int j = 1; j < aux.length; j++) {
				if(aux[j]>aux[posMayor]) {
					posMayor = j;
				}
			}
			
			indices[i] = posMayor;
			aux[posMayor] = Integer.MIN_VALUE;
		}
		
		
		mostrarArray(numeros, "Array original");
		mostrarArray(indices, "Array indices");
	}		
		public static void mostrarArray(int[] arr, String info) {
			System.out.println(info);
			for(int elem:arr) {
				System.out.print(elem+" ");
			}System.out.println();
		}	
}			
/*		
		
		int [] arr = {34,54,12,85,45};
		int [] arr2 = new int [arr.length];
		
		
		String datos="";
		String datosb="";
		for (int i=0;i<arr.length;i++) {
			
			if (arr[0]<arr[i]) {
				
			}
			
			for (int cont=1;cont<arr.length;cont++) {
				
				if(arr[i]<arr[cont]) {
					datos+=arr[i];
					arr[i]=0;
				}else {
					datosb+=arr[i];
				}
			}
		}
		System.out.print(datos);
		System.out.println();
		System.out.print(datosb);
		
		
/*		int numero=arr[0];
		int indice=0;
		String numeroDatos="";
		String indiceDatos=""; 
		for (int a = 0; a<arr.length; a++) {
			if(arr[a]<numero) {
				numero = arr[a];
				
			}
		}	
					for (int i=0;i<arr.length;i++) {
						if(arr[i]>numero) {
							numero = arr[i];
							indice = i;
							arr2[indice] = numero;
							for (int x = 0; x<arr2.length; x++) {
								System.out.print(arr2[x]);
							}
						}				
					}
			
			numeroDatos+=numero;
			indiceDatos+=indice;
		}
		System.out.println(numeroDatos);
		System.out.println(indiceDatos);
	}
}
*/

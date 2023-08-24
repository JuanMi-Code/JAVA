package Ejercicios1;

public class Ejercicio9 {

	public static void main(String[] args) {
			
		int arr1[] = {4,8,15,22,25,40};
		int arr2[] = {3,6,18,21,25,47};
		
		int[]arr3 = new int [arr1.length+arr2.length];

		int indice1 = 0;
		int indice2 = 0;
		
		for(int i = 0; i<arr3.length;i++) {
			
			if(indice1==arr3.length) {
				arr3[i] = arr2[indice2];
				indice2++;
			}else if(indice2==arr3.length){
				arr3[i] = arr1[indice1];
				indice1++;
			}else if (arr1[indice1]<arr2[indice2]) {
				arr3[i]=arr1[indice1];
				indice1++;
			}else {
				arr3[i]=arr2[indice2];
				indice2++;
			}
		}
		
		for (int i : arr3) {
			System.out.print(arr3[i]);
		}
	}
}
			
			
			
/*			if(indice1<arr1.length&&indice2<arr1.length) {	
				
				if(arr1[indice1]<arr2[indice2]) {
					arr3[i]=arr1[indice1];
					indice1++;	
				}else{	
					arr3[i]=arr2[indice2];
					indice2++;	
				}
				
			}else if(indice1==arr1.length) {
				arr3[i]=arr2[indice2];
				indice2++;
				
			}else if(indice2==arr2.length) {
				arr3[i]=arr1[indice1];
				indice1++;	
			}
			
		}
		
		return arr3;
	}
}
*/
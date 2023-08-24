package repasoT5;

public class Prueba {

	public static void main(String[] args) {
		
		int []arr1 = {4,6,8};
		int []arr2 = {3,5,7};
		int []arr = new int[arr1.length+arr2.length];
		
		for (int i = 0; i < arr.length-1; i++) {
			
				if (arr1[i]>arr2[i]) {
					arr[i]=arr1[i];
					int aux = arr2[i];
					i++;
					arr[i]=aux;
				}else {
					arr[i]=arr2[i];
					int aux = arr1[i];
					i++;
					arr[i]=aux;
				}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}

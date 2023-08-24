package repasoT4;

public class Ejer9 {

	public static void main(String[] args) {
		
		int[] arr1 = {4,8,15,22,25,40};
		int[] arr2 = {3,6,18,21,25,47};
		int[] arr3 = new int[arr1.length+arr2.length];
		int cont = 0;
		for (int i = 0; i <= arr3.length; i++) {
			
			if(arr1[cont]<arr2[cont]) {
				arr3[cont]=arr1[i];
				cont++;
				arr3[cont]=arr2[i];
				cont++;
				
			}else if(arr1[cont]>arr2[cont]) {
				arr3[cont]=arr2[i];
				cont++;
				arr3[cont]=arr1[i];
				cont++;
				
			}else if (arr1[cont]==arr2[cont]) {
				arr3[cont]=arr1[i];
				cont++;
				arr3[cont]=arr2[i];
			}
			if (cont == 7) {
				break;
			}
			
		}
		for (int i : arr3) {
			System.out.print(i + " ");
		}
	}
}

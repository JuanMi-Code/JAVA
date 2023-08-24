package A_Importante;

public class Arrays_Creacion {

	public static void main(String[] args) {
		
		int[] notas = {4,8,5,4};
		for (int i=0;i<=notas.length-1;i++)
			System.out.println(notas[i]);
		
		//crear array
		int [] frutas = new int [5];
		//añadir variable
		int fruta1 = 4;
		frutas[0]=fruta1;
		//añadir objeto
			//frutas[1]=new Fruta(1.0,3.4,"Pera");	
		//mostrar objeto
			//for (Fruta i : frutas) 
				//System.out.println(i);
		//mostrar int
		for (int nota : notas)
			System.out.println(nota);
		
					
				
		
	}
}

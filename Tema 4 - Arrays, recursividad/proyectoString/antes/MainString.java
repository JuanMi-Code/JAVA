package proyectoString.antes;

public class MainString {

	public static void main(String[] args) {
		InvestigacionString investiga = new InvestigacionString();
		
		String prueba = "Esta cadena va a sufrir";
		
		
		//La primera comprobación que vamos a hacer es el endsWith perooooooooooo
		//¿Cómo funciona?
		
		if(investiga.terminaCon(prueba, "sufrir")) {
			System.out.println("Pues va a ser verdad.");
		}else {
			System.out.println("Mmm no no no...");
		}
		
		//La segunda que vamos a emplear es indexOf que es para ver el indice que tiene un caracter dentro de esa cadena
		//Obviamente tiene que estar este caracter dentro de la cadena...
		
		if(investiga.coincidenciaCadena(prueba, 'c', 6) >= 0){
			System.out.println("Tu índice es: " + investiga.coincidenciaCadena(prueba, 'c', 6));
		}else {
			System.out.println("El índice buscado no existe en tu cadena.");
		}
		
		//La tercera que se va a emplear es matches que si entendemos inglés que creemos que hará...
		String comprobacion = prueba + "No";
		
		if(investiga.mismaCadena(prueba, comprobacion)) {
			System.out.println("Tu cadena es: " + prueba);
		}else {
			System.out.println("Amigüito tu dacena no coincide, que sad :´(");
		}
		
		//La cuarta comprobación que vamos a hacer, a priori es de las más complejas de entender pero...
		//luego realmente no lo es tanto... o si? :´)
		
		if(investiga.mismasPartes(prueba, 0, comprobacion, 5, 3)) {
			System.out.println("Sí que conciden tus caracteres comparados, pero lo siento no te sirve de nada.");
		}else {
			System.out.println("Que pena, mejor vuelve al LOL.");
		}
		
		//La quinta comprobación de todo esto es una de las más sencillas y emplea el split
		//Que qué hace esto...
		String[] cadenaSeparada = investiga.separarCadena(prueba, " ");
		mostrarArray(cadenaSeparada);
		
		//--------------------------------------
		//ejemplo1
		System.out.println("---------------");
		
		String string = "Hola que tal";
		int valor = 5;
		System.out.println(investiga.startsWith(string,valor));
		
		//ejemplo2
		System.out.println("---------------");
				
		System.out.println(investiga.lastIndexOf(string));
				
		//ejemplo3
		System.out.println("---------------");
			
		int inicio = 0;
		int fin = 4;
		System.out.println(investiga.subSequence(string, inicio, fin));
			
		//ejemplo4
		System.out.println("---------------");
				
		String string2 = "?????";
		System.out.println(investiga.concat(string,string2));
				
		//ejemplo5
		System.out.println("---------------");
				
		//String s1=new String("Hola que tal");
		String s1=new String("Hola que tal").intern();
		String s3 = new String("Hola que tal").intern();
		System.out.println(s1==s3);
		//--------------------------------------
		
	}
	
	public static void mostrarArray(String[] array) {
		System.out.println("\nTu array es: ");
		for(String elem : array) {
			System.out.println(elem + " ");
		}
	}
}

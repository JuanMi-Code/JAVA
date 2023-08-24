package proyectoString;

public class MainString {

	public static void main(String[] args) {
		InvestigacionString investiga = new InvestigacionString();
		
		String prueba = "Esta cadena va a sufrir";
		
		
		System.out.println("---------------");
		//La primera comprobación que vamos a hacer es el endsWith
		//¿Cómo funciona?
		
		if(investiga.terminaCon(prueba, "sufrir")) {
			System.out.println("Pues va a ser verdad.");
		}else {
			System.out.println("Mmm no no no...");
		}
		
		System.out.println("---------------");
		//La segunda que vamos a emplear es indexOf que es para ver el indice que tiene un caracter dentro de esa cadena
		//Obviamente tiene que estar este caracter dentro de la cadena...
		
		if(investiga.coincidenciaCadena(prueba, 'c', 6) >= 0){
			System.out.println("Tu índice es: " + investiga.coincidenciaCadena(prueba, 'c', 6));
		}else {
			System.out.println("El índice buscado no existe en tu cadena.");
		}
		
		System.out.println("---------------");
		//La tercera que se va a emplear es matches que si entendemos inglés que creemos que hará...
		String comprobacion = prueba;
		
		if(investiga.mismaCadena(prueba, comprobacion)) {
			System.out.println("Tu cadena es: " + comprobacion);
		}else {
			System.out.println("Tu cadena no coincide");
		}
		
		System.out.println("---------------");
		//La cuarta comprobación que vamos a hacer, a priori es de las más complejas de entender pero...
		//luego realmente no lo es tanto... o si? :´)
		
		if(investiga.mismasPartes(prueba, 0, comprobacion, 5, 3)) {
			System.out.println("Sí que conciden tus caracteres comparados, pero lo siento no te sirve de nada.");
		}else {
			System.out.println("Que pena, mejor vuelve al LOL.");
		}
		
		System.out.println("---------------");
		//La quinta comprobación de todo esto es una de las más sencillas y emplea el split
		//Que qué hace esto...
		String[] cadenaSeparada = investiga.separarCadena(prueba, " ");
		mostrarArray(cadenaSeparada);
	
		
		
		
		
		System.out.println("---------------");
		//El método compareTo compara dos cadenas entre sí, convirtiendo cada caracter a UNICODE y contando 
		//la diferencia númerica entre posiciones del alfabeto, consigue saber que cadena es mayor (en cuanto a valor).
		//Si el primer valor es mayor, el resultado dará un número negativo, si es menor, uno positivo, y si es igual un 0.
		
		if(investiga.compararCon("a","b")==0) {
			System.out.println("Son iguales.");
		}else if(investiga.compararCon("a","b")<0) {
			System.out.println("Es mayor el primer valor.");
		}else {
			System.out.println("Es mayor el segundo valor.");
		}
	
		System.out.println("---------------");
		//Este metodo nos devuelve el codigo hash de una cadena mediante una simple operacion arimetica 
		//que aplica internamente el metodo, en caso de no pasar ninguna cadena nos devolvera cero, veamos su sintaxis:
		
		 System.out.println("El metodo hash es: "+investiga.hash(prueba));
		
		 System.out.println("---------------");
		//Trim es un metodo muy sencillo que devuelve la misma cadena omitiendo los espacios del principio y final.
		 String pruebaTrim = "         Esto es una prueba             ";
		 
		 System.out.println("La frase sin espacios es: "+investiga.quitarEspacios(pruebaTrim));
		 
		 System.out.println("---------------");
		 //El método contentEquals se encarga de comparar una variable de tipo String con un objeto de tipo StringBuffer
		 //devolviendo un valor boolean, true en caso de ser iguales, false en caso de ser distinto.
		 
		 System.out.println(investiga.compararConBuffer(new StringBuffer("Esto es una prueba"), "Esto es una prueba")
				 ?"Son iguales.":"Son distintos.");
		 
		 System.out.println("---------------");
		 //El método replace reemplaza un caracter por otro dentro de un texto. Por ejemplo, de la cadena "Esto es una prueba", 
		 //podemos cambiar las "e" por "i" quedando "Isto is una pruiba".
		 
		 System.out.println(investiga.reemplazar(prueba, 'e', 'i'));
		 
		 
		 
		 
		 
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
					
			String s1=new String("Hola que tal");
			//String s1=new String("Hola que tal").intern();
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
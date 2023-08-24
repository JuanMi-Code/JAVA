
public class trabajoString {

public static void main(String[] args) {
		//ejemplo1
		System.out.println("---------------");
		
		String string = "Hola que tal";
		int valor = 5;
		System.out.println(startsWith(string,valor));
		
		//ejemplo2
		System.out.println("---------------");
		
		System.out.println(lastIndexOf(string));
		
		//ejemplo3
		System.out.println("---------------");
		
		int inicio = 0;
		int fin = 4;
		System.out.println(subSequence(string, inicio, fin));
		
		//ejemplo4
		System.out.println("---------------");
		
		String string2 = "?????";
		System.out.println(concat(string,string2));
		
		//ejemplo5
		System.out.println("---------------");
		
		String s1=new String("Hola que tal");
		//String s1=new String("Hola que tal").intern();
		String s3 = new String("Hola que tal").intern();
		System.out.println(s1==s3);
	}
//--------------------------------------
	//ejemplo1
	public static boolean startsWith(String string, int valor) {	
		return string.startsWith("que", valor);	
	}
	//ejemplo2
	public static int lastIndexOf(String string) {
		return string.lastIndexOf("tal");
	}
	//ejemplo3
	public static CharSequence subSequence(String string, int inicio, int fin) {
		return string.subSequence(inicio, fin);
	}
	//ejemplo4
	public static String concat(String string, String string2) {
		return string.concat(string2);
	}
	//ejemplo5
	public static void intern() {	
	}
	//--------------------------------------
}

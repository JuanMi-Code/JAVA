package proyectoString;

public class InvestigacionString {

	public boolean terminaCon(String frase, String sufijo) {
		return frase.endsWith(sufijo);
	}
	
	public int coincidenciaCadena(String frase, char caracter, int indice) {
		return frase.indexOf(caracter, indice);
	}
	
	public boolean mismaCadena(String frase, String expresion) {
		return frase.matches(expresion);
	}
	
	public boolean mismasPartes(String frase, int comienzoPrimeraCadena, String segundaCadena, int comienzoSegundaCadena, int numeroCaracteres) {
		return frase.regionMatches(comienzoPrimeraCadena, segundaCadena, comienzoSegundaCadena, numeroCaracteres);
	}
	
	public String[] separarCadena(String frase, String expresion) {
		return frase.split(expresion);
	}
	
	public int compararCon(String frase, String expresion) {
		return frase.compareTo(expresion);
	}
	
	public int hash(String frase) {
		return frase.hashCode();
	}
	
	public String quitarEspacios(String frase) {
		return frase.trim();
	}
	
	public boolean compararConBuffer(StringBuffer cadenaBuffer, String cadena) {
		return cadena.contentEquals(cadenaBuffer);
	}
	
	public String reemplazar(String texto, char letraReemplazado, char letraReemplazable) {
		return texto.replace(letraReemplazado, letraReemplazable);
	}
	
	
	public boolean startsWith(String string, int valor) {	
		return string.startsWith("que tal", valor);	
	}
	public int lastIndexOf(String string) {
		return string.lastIndexOf("tal");
	}
	public CharSequence subSequence(String string, int inicio, int fin) {
		return string.subSequence(inicio, fin);
	}
	public String concat(String string, String string2) {
		return string.concat(string2);
	}
	
	
	
	
}
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejer_otro {
public static void main(String[] args) {
	
	String texto = "\"Hola esto es un texto de prueba para resolver varios ejercicios de expresiones\r\n"
			+ "regulares, en este ejercicio vamos a introducir un texto con al que añadiremos serie de elementos en el\r\n"
			+ "texto para que por medio de regex extraigas unas palabras de él, el texto esta sacado de la pagina de\r\n"
			+ "noticias de Xataca, donde se habla de los cambios en los trabajos como desarrolladores web comparando\r\n"
			+ "el teletrabajo en tiempos antes de la pandemia y después de la pandemia. (Hola mundo)\\r\\n\"\r\n"
			+ " + \"Este es el enlace a la página web de Xataka: https://www.xataka.com y este es el enlace al\r\n"
			+ "articulo de donde se ha extraído el texto: https://www.genbeta.com/actualidad/empresas-espanolas-finpermiten-a-desarrolladores-trabajar-remoto-como-ellos-querian-todo-gracias-a-pandemia (parece que)\\r\\n\"\r\n"
			+ " + \"Mas ejemplos de URL http://www.equipoGoTo.es, https://www.educa.jcyl.es,\r\n"
			+ "www.equipoGoTo.org (los paréntesis)\\r\\n\"\r\n"
			+ " + \"Joppy, una plataforma española que conecta a empresas con Desarrolladores, acaba de\r\n"
			+ "publicar un informe sobre el mercado laboral en el ecosistema tecnológico. Uno de los datos más\r\n"
			+ "importantes del estudio es cómo la pandemia ha facilitado la cultura del trabajo en remoto. (están\r\n"
			+ "funcionando)\\r\\n\"\r\n"
			+ " + \"“Mientras que en 2019 sólo se ofertaba un 2% de puestos en esta modalidad (en remoto)\r\n"
			+ "siendo la opción preferida por el 39% de los profesionales, la COVID ha obligado a las empresas a\r\n"
			+ "flexibilizar la presencia física, lo que ha provocado que en 2021 la oferta de trabajo en remoto haya\r\n"
			+ "crecido hasta el 48% de los puestos ofertados”. \\r\\n\"\r\n"
			+ " + \"Joppy cuenta con cerca de 40.000 programadores suscritos y más de 1000 empresas\r\n"
			+ "tecnológicas como clientes. Y los datos de este informe se basan en la oferta y demanda que se\r\n"
			+ "encuentra dentro de la plataforma.\\r\\n\"\r\n"
			+ " + \"Estos gustos de los desarrolladores de trabajar desde casa no es algo exclusivo de los\r\n"
			+ "profesionales españoles. En noviembre, un estudio de GitHub concluía que de los 12 mil Desarrolladores\r\n"
			+ "encuestados para el informe, solo el 10.7% esperaba volver a una oficina cuando “la pandemia termine”.\r\n"
			+ "Esto representó una caída del 30% versus años anteriores, cuando el 41% de los desarrolladores iban a\r\n"
			+ "trabajar a una oficina a tiempo completo o parcial. Esto es un numero para filtrarlo con regex, con\r\n"
			+ "espacios 123 456 789, y con guiones 987-654-321, ejemplos que no detecta en el ejercicio 3, 12345678,\r\n"
			+ "798/234/752.\\r\\n\"\r\n"
			+ " + \"Los perfiles más Demandados en España\\r\\n\"\r\n"
			+ " + \"El estudio también analiza los cambios del sector en cuanto a perfiles laborales más\r\n"
			+ "demandados. El especialista en Backend (de 3 a 5 años de experiencia) con conocimientos de Java o\r\n"
			+ "PHP, con un sueldo medio de 45.000 euros anuales brutos destaca como el perfil que más se pide entre\r\n"
			+ "las empresas de España.\\r\\n\"\r\n"
			+ "Programación Francisco Javier Pérez Arribas\r\n"
			+ "6\r\n"
			+ " + \"En Barcelona también ha subido la Demanda de desarrolladores expertos en backend con\r\n"
			+ "conocimientos en Javascript y en C#. Typescript y React también son muy demandados en Barcelona\r\n"
			+ "entre los expertos de Frontend.\\r\\n\"";


			//EXPLICACIÓN ejercicio 6
			/*
				(https://)*www\\. Para indicar que puede haber o no el https:// ; el www. siembre estará
				\\. - Para indicar que a continuación hay un punto
				[a-zA-Z]+ - Para indicar que pueden ser letras minúsculas o mayúsculas (una o mas letras)
				(\\.[a-zA-Z]+)* - Para indicar que pueden ser letras minúsculas o mayúsculas (una o mas letras) 
					y el (...)* para que se pueda complir 0 o más veces
				\\.(com|es|org) - Termina por com/es/org
			*/
	
	String regex ="(https://)*www\\." //INICIO
			+ "[a-zA-Z]+" //OBLIGATORIA
			+ "(\\.[a-zA-Z]+)*" //OPCIONAL
			+ "\\.(com|es|org)"; //FINAL

	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(texto);

	while(m.find()) {
	System.out.println(m.group());
	}
	
	
	
	
	
	
			// ((https://www)|www)\\.[a-zA-Z]+\\.*[a-zA-Z]*\\.(com|es|org)
			// (\\.[a-zA-Z])*
			// (\\.[a-zA-Z]+)*
			
	/*
			String regla3 ="((https://www)|www)\\.[a-zA-Z]+\\.(com|es|org)|"
			+ "((https://www)|www)\\.[a-zA-Z]+\\.[a-zA-Z]+\\.(com|es|org)";

			Pattern patron3 = Pattern.compile(regla3);
			Matcher mat3 = patron3.matcher(url);

			while(mat3.find()) {
			System.out.println(mat3.group());
			}
	*/
}
}

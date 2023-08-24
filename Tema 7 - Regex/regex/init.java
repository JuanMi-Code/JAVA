package regex;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class init {

	public static void main(String[] args) {
		
		//Ejercicio 1
		
		String frase = "Esto es una prueba";
        String regla1 ="^[a-zA-Z\\s]+$";
        
        Pattern patron1 = Pattern.compile(regla1);
        Matcher mat1 = patron1.matcher(frase);
        
        if(mat1.find()) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }


      //Ejercicio 2
        
        String texto = "Esto es una prueba";
        String buscar = "prueba";
        
        Pattern patron2 = Pattern.compile(buscar);
        Matcher mat2 = patron2.matcher(texto);
        
        if(mat2.find()) {
            System.out.println("Encontrado");
        }else {
            System.out.println("No encontrado");
        }

        
      //Ejercicio 3
        
        String url = "www.hola.es";
        String regla3 ="^www\\.[a-zA-Z]+\\.com|es$";
        
        Pattern patron3 = Pattern.compile(regla3);
        Matcher mat3 = patron3.matcher(url);
        
        if(mat3.find()) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
        
      //Ejercicio 4
        
        String passwd = "Prueba112";
        String regla4 ="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,12}$";

        Pattern patron4 = Pattern.compile(regla4);
        Matcher mat4 = patron4.matcher(passwd);

        if(mat4.find()) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }

        
      //Ejercicio 5
        
        String decimal = "12.12";
        String regla5 ="^\\d*\\.\\d+$";
        
        Pattern patron5 = Pattern.compile(regla5);
        Matcher mat5 = patron5.matcher(decimal);
        
        if(mat5.find()) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }

        
      //Ejercicio 6
        
        String numero = "12.12";
    	//String numero = "12";
            String regla6 ="^\\d*(\\.\\d+)?$";
            
            Pattern patron6 = Pattern.compile(regla6);
            Matcher mat6 = patron6.matcher(numero);
            
            if(mat6.find()) {
                System.out.println("Correcto");
            }else {
                System.out.println("Incorrecto");
            }

        
      //Ejercicio 7
        
            String dec = "12.0€";
            String regla7 ="^\\d+\\.\\d+\\€$";
            
            Pattern patron7 = Pattern.compile(regla7);
            Matcher mat7 = patron7.matcher(dec);
            
            if(mat7.find()) {
                System.out.println("Correcto");
            }else {
                System.out.println("Incorrecto");
            }

        
      //Ejercicio 8

            String fecha = "01-12-2012";
            String regla8 ="^([1-2][\\d]|3[0-1]|0[1-9])-([0][1-9]|1[0-2])-(\\d{4})$";

            Pattern patron8 = Pattern.compile(regla8);
            Matcher mat8 = patron8.matcher(fecha);

            if(mat8.find()) {
                System.out.println("Correcto");
            }else {
                System.out.println("Incorrecto");
            }
            
       /* Entregar 5 	Validar una dirección IP.
       
            Para que una dirección IP sea válida: 
            	• Debe estar formada por cuatro números de entre 1 y 3 cifras separados por punto, no mayores de 255.
            	• Estos números no pueden ser 0 ni tener un 0 a la izquierda (‘021’ no es válido)
       */
            
            String ip = "255.168.25.0";
            //String reglaEj5 = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
            String reglaEj5 = "^(\\d|[1-9][\\d]|1[\\d][\\d]|2[0-5][0-5])\\.(\\d|[1-9][\\d]|1[\\d][\\d]|2[0-5][0-5])\\.(\\d|[1-9][\\d]|1[\\d][\\d]|2[0-5][0-5])\\.(\\d|[1-9][\\d]|1[\\d][\\d]|2[0-5][0-5])$";
            
            Pattern patronEj5 = Pattern.compile(reglaEj5);
            Matcher matEj5 = patronEj5.matcher(ip);

            if(matEj5.find()) {
                System.out.println("Correcta");
            }else {
                System.out.println("Incorrecta");
            }
            
            
            //EJERCICIO2
            
            HashMap<Integer,String> paises = new HashMap<Integer,String>();
            
            paises.put(380,"GS1 Bulgaria");
            paises.put(383,"GS1 Slovenija");
            paises.put(385,"GS1 Croacia");
            paises.put(387,"GS1 BIH (Bosnia-Herzegovina)");
            paises.put(389,"GS1 Montenegro");
            paises.put(470,"GS1 Kirguistán");
            paises.put(471,"GS1 Taiwán");
            paises.put(474,"GS1 Estonia");
            paises.put(475,"GS1 Letonia");
            paises.put(476,"GS1 Azerbaiyán");
            paises.put(477,"GS1 Lituania");
            paises.put(478,"GS1 Uzbekistán");
            paises.put(479,"GS1 Sri Lanka");
            paises.put(480,"GS1 Filipinas");
            paises.put(481,"GS1 Bielorrusia");
            paises.put(482,"GS1 Ucrania");
            paises.put(483,"GS1 Turkmenistán");
            paises.put(484,"GS1 Moldavia");
            paises.put(485,"GS1 Armenia");
            paises.put(486,"GS1 Georgia");
            paises.put(487,"GS1 Kazajstán");
            paises.put(488,"GS1 Tayikistán");
            paises.put(489,"GS1 Hong Kong");
            paises.put(528,"GS1 Líbano");
            paises.put(529,"GS1 Chipre");
            paises.put(530,"GS1 Albania");
            paises.put(531,"GS1 Macedonia");
            paises.put(535,"GS1 Malta");
            paises.put(539,"GS1 Irlanda");
            paises.put(560,"GS1 Portugal");
            paises.put(569,"GS1 Islandia ");
            paises.put(590,"GS1 Polonia");
            paises.put(594,"GS1 Rumania");
            paises.put(599,"GS1 Hungría");
            paises.put(603,"GS1 Ghana");
            paises.put(604,"GS1 Senegal");
            paises.put(608,"GS1 Bahrein");
            paises.put(609,"GS1 Mauricio");
            paises.put(611,"GS1 Marruecos");
            paises.put(613,"GS1 Argelia");
            paises.put(615,"GS1 Nigeria");
            paises.put(616,"GS1 Kenia");
            paises.put(618,"GS1 Costa de Marfil");
            paises.put(619,"GS1 Túnez");
            paises.put(620,"GS1 Tanzania");
            paises.put(621,"GS1 Siria");
            paises.put(622,"GS1 Egipto");
            paises.put(623,"GS1 Brunei");
            paises.put(624,"GS1 Libia");
            paises.put(625,"GS1 Jordan");
            paises.put(626,"GS1 Irán");
            paises.put(627,"GS1 Kuwait");
            paises.put(628,"GS1 Arabia Saudita");
            paises.put(629,"GS1 Emiratos");
            paises.put(729,"GS1 Israel");
            paises.put(740,"GS1 Guatemala");
            paises.put(741,"GS1 El Salvador");
            paises.put(742,"GS1 Honduras");
            paises.put(743,"GS1 Nicaragua");
            paises.put(744,"GS1 Costa Rica");
            paises.put(745,"GS1 Panamá");
            paises.put(746,"GS1 Republica Dominicana");
            paises.put(750,"GS1 México");
            paises.put(759,"GS1 Venezuela");
            paises.put(773,"GS1 Uruguay");
            paises.put(775,"GS1 Perú");
            paises.put(777,"GS1 Bolivia");
            paises.put(780,"GS1 Chile");
            paises.put(784,"GS1 Paraguay");
            paises.put(786,"GS1 Ecuador");
            paises.put(850,"GS1 Cuba");
            paises.put(858,"GS1 Eslovaquia");
            paises.put(859,"GS1 Checa");
            paises.put(860,"GS1 Serbia");
            paises.put(865,"GS1 Mongolia");
            paises.put(867,"GS1 Corea del Norte");
            paises.put(880,"GS1 Corea del Sur");
            paises.put(884,"GS1 Camboya");
            
            String num = "884";
            
            Pattern p = Pattern.compile("^\\d\\d\\d$"); 
            Matcher m = p.matcher(num);
          /*  
            Long num1 = num.valueOf(num);
           */ 
            for (int i = 0; i < paises.size(); i++) {
				if(paises.get(num) == paises.get(i)) {
					System.out.println(paises.get(i));
					
				}
			}
            
            


            
	}

}

package repaso;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Repaso16 {

	public static void main(String[] args) {
		
		/*
		 * Declarar un String que sean emails separados por #, y guardar en un array de resultados si cada email 
		 * es correcto o incorrecto. Un email correcto tiene que seguir esta estructura: una palabra de entre 
		 * 4 y 15 caracteres que pueden ser letras, números y _, luego un @, luego hotmail, gmail o outlook, y 
		 * luego .com o .es.
		 */
		
		String emails = "jescoevas@hotmail.com#marta_diaz30@hotmail.com#luciadiaz.12@hotmail.com";
		//Para tener los emails en un array que podamos recorrer lo partimos con split, separados por #
		String[] emailsArray = emails.split("#");
		
		boolean[] resultados = new boolean[emailsArray.length];
		
		//Expresión regular que indica si el email es correcto o incorrecto
		String expresion = "^[a-zA-Z0-9_]{4,15}@(hotmail|gmail|outlook)(.com|.es)$";
		
		//Establecemos la expresión
		Pattern pattern = Pattern.compile(expresion);
		
		//Vamos viendo cada email
		for(int i = 0; i < emailsArray.length; i++) {
			//RECORDAR, QUE SIEMPRE SE TE OLVIDA
			//PARA ACCEDER A UN ELEMENTO DE UN ARRAY PONEMOS EL NOMBRE DEL ARRAY
			//Y ENTRE CORCHETES LA POSICIÓN QUE QUEREMOS
			String email = emailsArray[i];
			//Vemos si cumple
			Matcher matcher = pattern.matcher(email);
			boolean esCorrecto = matcher.matches();
			//Lo guardamos
			resultados[i] = esCorrecto;
		}
		
		System.out.println(Arrays.toString(resultados));
		
	}
}

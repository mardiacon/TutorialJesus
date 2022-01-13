package clases;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		
		//Las expresiones regulares son patrones que podemos definir para que los cumplan los Strings
		String expresion = "^[a-zA-Z0-9_]{4,}[@][a-z]{3,10}(.com|.es|.org)$";
		String emailCorrecto = "marta_diaz30@hotmail.com";
		String emailIncorrecto = "marta_diaz30@hotmail.uk";
		
		//El método matches de los Strings recibe por parámetro la expresión a cumplir, y devuelve si lo hace o no
		boolean cumple = emailCorrecto.matches(expresion);
		boolean noCumple = emailIncorrecto.matches(expresion);
		
		System.out.println("Email correcto :"+cumple);
		System.out.println("Email incorrecto: "+noCumple);
		
	}
	
}

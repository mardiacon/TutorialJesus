package repaso;

import java.util.Scanner;

public class Repaso12 {

	/*
	 * Un programa que te pida una contraseña y que tenga que comprobar que: contenga un @, 
	 * tenga al menos 5 caracteres, empiece por mayúscula y acabe con un número 
	 * (este ultimo no lo hemos dado, vas a tener que buscar el método que lo hace). 
	 * Si algo no se cumple pues te la vuelve a pedir, y si cumple todo te muestre por pantalla la contraseña.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca su contraseña: ");
		String contrasenya = teclado.nextLine();
		
		Boolean arroba = contrasenya.contains("@");
		Integer caracteres = contrasenya.length();
		Boolean tieneCincoCaracteres = caracteres >= 5;
		Character primerCaracter = contrasenya.charAt(0);
		Boolean empiezaPorMayuscula = Character.isUpperCase(primerCaracter);
		Character ultimoCaracter = contrasenya.charAt(contrasenya.length()-1);
		Boolean acabaPorNumero = Character.isDigit(ultimoCaracter);
		Boolean contrasenyaFinal = arroba && tieneCincoCaracteres && empiezaPorMayuscula && acabaPorNumero;
		
		while(!contrasenyaFinal){
			System.out.print("Su contraseña no cumple con los requisitos establecidos. Vuelva a introducirla: ");
			contrasenya = teclado.nextLine();	
			arroba = contrasenya.contains("@");
			caracteres = contrasenya.length();
			tieneCincoCaracteres = caracteres >= 5;
			primerCaracter = contrasenya.charAt(0);
			empiezaPorMayuscula = Character.isUpperCase(primerCaracter);
			ultimoCaracter = contrasenya.charAt(contrasenya.length()-1);
			acabaPorNumero = Character.isDigit(ultimoCaracter);
			contrasenyaFinal = arroba && tieneCincoCaracteres && empiezaPorMayuscula && acabaPorNumero;
		}
		System.out.println("Contraseña introducida: "+contrasenya);
		
		teclado.close();
	}
}

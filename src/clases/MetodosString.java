package clases;

import java.util.Scanner;

public class MetodosString {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce una contraseña: ");
		
		String password = teclado.nextLine();
		
		System.out.println("La contraseña introducida es: "+password);
		
		Integer longitud = password.length();
		
		System.out.println("La longitud de la contraseña es: "+longitud);
		
		
		
		Boolean contieneAsterisco = password.contains("*");
		
		Boolean passwordValida = longitud >=4 && longitud <=20 && contieneAsterisco;
		
		if (passwordValida) { 
			System.out.println("Contraseña válida");
		}else {
			System.out.println("Contraseña inválida");
		}
		
		
	}
}

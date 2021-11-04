package clases;

import java.util.Scanner;

public class MetodosString {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce una contrase�a: ");
		
		String password = teclado.nextLine();
		
		System.out.println("La contrase�a introducida es: "+password);
		
		Integer longitud = password.length();
		
		System.out.println("La longitud de la contrase�a es: "+longitud);
		
		
		
		Boolean contieneAsterisco = password.contains("*");
		
		Boolean passwordValida = longitud >=4 && longitud <=20 && contieneAsterisco;
		
		if (passwordValida) { 
			System.out.println("Contrase�a v�lida");
		}else {
			System.out.println("Contrase�a inv�lida");
		}
		
		
	}
}

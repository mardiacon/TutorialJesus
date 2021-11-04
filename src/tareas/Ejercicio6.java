package tareas;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
//		Escribe un programa en Java que lea de teclado un texto y lo analice averiguando lo siguiente:
//
//			si el texto contiene m�s de cinco caracteres,
//			si el texto comienza por una letra may�scula,
//			si el texto termina con una letra min�scula,
//			si el texto finaliza con unos puntos suspensivos ("...").
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un texto: ");
		String texto = teclado.nextLine();
		
		Integer longitud = texto.length();
		Boolean tieneMasDe5Caracteres = longitud > 5;
		System.out.println("El texto contiene m�s de 5 caracteres: "+tieneMasDe5Caracteres);
		
		Character primeraLetra = texto.charAt(0);
		Boolean esMayuscula = Character.isUpperCase(primeraLetra);
		System.out.println("El texto comienza con una letra may�scula: "+esMayuscula);
		
		Character ultimaLetra = texto.charAt(longitud - 1);
		Boolean esMinuscula = Character.isLowerCase(ultimaLetra);
		System.out.println("El texto termina con una letra min�scula: "+esMinuscula);
		
		Boolean finalizaConPuntosSuspensivos = texto.endsWith("...");
		System.out.println("El texto termina con unos puntos suspensivos (...): "+finalizaConPuntosSuspensivos);
		
		teclado.close();
		
	}
}

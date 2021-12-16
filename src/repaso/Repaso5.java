package repaso;

import java.util.Scanner;

public class Repaso5 {

	public static void main(String[] args) {
		
		/*
		 * Un programa que te pida dos textos diferentes, calcula el numero de caracteres de cada texto y te diga que texto es más largo. 
		 */
	
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.print("Introduce el primer texto: ");
		
		String primerTexto = teclado.nextLine();
		
		int caracteresPrimerTexto = primerTexto.length();
		
		
		System.out.print("Introduce el segundo texto: ");
		
		String segundoTexto = teclado.nextLine();
		
		int caracteresSegundoTexto = segundoTexto.length();
		
		if (caracteresPrimerTexto > caracteresSegundoTexto) {
			System.out.println("El primer texto es más largo que el segundo texto.");
		}else {
			System.out.println("El segundo texto es más largo que el primer texto. ");
		}
		
		teclado.close();
		
	}
	
}

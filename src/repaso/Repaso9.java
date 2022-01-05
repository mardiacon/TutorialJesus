package repaso;

import java.util.Scanner;

public class Repaso9 {

/*
 * Un programa que te pida una palabra, cuente cuantas vocales y consonantes tiene, y muestre por pantalla ambas cosas.
 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce  una palabra: ");
		String palabra = teclado.nextLine(); 
		
		int numeroVocales = 0;
		int numeroConsonantes = 0;
		
		for (int posicion = 0; posicion <palabra.length(); posicion++) {
			char letra = palabra.charAt(posicion);
			
			switch(letra) {
			case 'a': case 'e': case 'i': case 'o': case 'u': 
				numeroVocales += 1;
				break;
			default:
				numeroConsonantes += 1;	
			}
		}	
		System.out.println("El numero de vocales es: " + numeroVocales);
		System.out.println("El numero de consonantes es: " + numeroConsonantes);
		
		teclado.close();
	}
}

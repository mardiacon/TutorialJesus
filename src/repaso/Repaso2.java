package repaso;

import java.util.Scanner;

public class Repaso2 {

	public static void main(String[] args) {
		
		/*
		 * Programa que te pida 2 n�meros. Primero uno y luego el otro. Los reste,
		 * y te diga si el resultado de esta resta es un n�mero negativo o no.
		 */
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el primer n�mero: ");
		
		int primerNumero = teclado.nextInt();
		
		System.out.println("Introduce el segundo n�mero: ");
		
		int segundoNumero = teclado.nextInt();
		
		int resta = primerNumero - segundoNumero;
		
		if (resta <0) {
			System.out.println("El n�mero resultante es negativo. ");
		}else {
			System.out.println("El n�mero resultante es positivo. ");
		}
	
		teclado.close();
	}
	
}

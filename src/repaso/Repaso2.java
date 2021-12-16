package repaso;

import java.util.Scanner;

public class Repaso2 {

	public static void main(String[] args) {
		
		/*
		 * Programa que te pida 2 números. Primero uno y luego el otro. Los reste,
		 * y te diga si el resultado de esta resta es un número negativo o no.
		 */
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		
		int primerNumero = teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		
		int segundoNumero = teclado.nextInt();
		
		int resta = primerNumero - segundoNumero;
		
		if (resta <0) {
			System.out.println("El número resultante es negativo. ");
		}else {
			System.out.println("El número resultante es positivo. ");
		}
	
		teclado.close();
	}
	
}

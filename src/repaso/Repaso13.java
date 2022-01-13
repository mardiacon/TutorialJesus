package repaso;

import java.util.Random;
import java.util.Scanner;

public class Repaso13 {

	public static void main(String[] args) {
		
		/*
		 * Un programa que genere un número aleatorio del 0 al 10 y te pida que lo adivines. 
		 * Cuando lo consigas adivinar que te diga cuántos intentos has necesitado. 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(" Introduce un número entre el 0 y el 10:  ");
		int numeroIntroducido = teclado.nextInt();
		
		Random random = new Random();
		
		teclado.close();
		
	}
	
}

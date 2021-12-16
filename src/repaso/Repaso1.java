package repaso;

import java.util.Scanner;

public class Repaso1 {

	public static void main(String[] args) {
		
		/*
		 * Un programa que te pida un numero entero, mire si es par y te muestre por pantalla si es par o impar.
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce un número entero: ");
		
		int numero = teclado.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El número introducido es par.");
		}else {
			System.out.println("El número introducido es impar.");
		}
		
		teclado.close();
		
	}
}

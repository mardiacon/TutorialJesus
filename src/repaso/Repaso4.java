package repaso;

import java.util.Scanner;

public class Repaso4 {

	public static void main(String[] args) {
		
		/*
		 * Un programa que te pida tu temperatura y te muestre si tienes 35 o 36 te ponga que tienes temperatura normal, si tienes 37 te ponga tienes destemplanza,
		 * si tienes 38,39 0 40 tienes fiebre, y para cualquier otro número, estás muerto.
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce tu temperatura: ");
		
		int temperatura = teclado.nextInt();
		
		switch (temperatura){
		case 35: case 36:
			System.out.println("Tienes temperatura normal.");
			break;
		case 37:
			System.out.println("Tienes destemplanza.");
			break;
		case 38: case 39: case 40:
			System.out.println("Tienes fiebre.");
			break;
			default:
				System.out.println("Estás muerto/a.");
		}
	
		teclado.close();
		
	}
	
}

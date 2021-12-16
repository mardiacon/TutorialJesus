package repaso;

import java.util.Scanner;

public class Repaso3 {

	public static void main(String[] args) {
		
		/*
		 * Un programa que te pida un año y te diga si es anterior, igual o posterior al actual.
		 */
	
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce un año: ");
		
		int anyo = teclado.nextInt();
		
		if (anyo <2021) {
			System.out.println("El año introducido es anterior al actual. ");
		}else if (anyo == 2021){
			System.out.println("El año introducido es el actual. ");
		}else {
			System.out.println("El año introdicido es posterior al actual. ");
		}
		
		teclado.close();
		
	}
	
}

package repaso;

import java.util.Scanner;

public class Repaso3 {

	public static void main(String[] args) {
		
		/*
		 * Un programa que te pida un a�o y te diga si es anterior, igual o posterior al actual.
		 */
	
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce un a�o: ");
		
		int anyo = teclado.nextInt();
		
		if (anyo <2021) {
			System.out.println("El a�o introducido es anterior al actual. ");
		}else if (anyo == 2021){
			System.out.println("El a�o introducido es el actual. ");
		}else {
			System.out.println("El a�o introdicido es posterior al actual. ");
		}
		
		teclado.close();
		
	}
	
}

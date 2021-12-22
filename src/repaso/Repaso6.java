package repaso;

import java.util.Scanner;

public class Repaso6 {

	/*
	 * Un programa que te pida una hora y, dependiendo de la hora introducida, te diga si es por la mañana
	 * (de 6 incluida a 12 sin incluir), medio día (de 12 incluida a 4 sin incluir), tarde (de 4 incluida a 9 sin
	 * incluir), noche (de 9 incluida a 1 sin incluir) o madrugada (de 1 incluida a 6 sin incluir). En caso de 
	 * conseguir el ejercicio, ir un paso adelante y controlar que la hora se introduce bien, es decir, que si metes
	 * una letra o metes valores fuera del rango te lo vuelva a pedir.
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Introduce una hora: ");
		Scanner teclado = new Scanner(System.in);
		int hora = teclado.nextInt();
		
		switch(hora) {
		case 6: case 7: case 8: case 9: case 10: case 11: 
			System.out.println("Es por la mañana.");
			break;
		case 12: case 13: case 14: case 15:
			System.out.println("Es medio día.");
		case 16: case 17: case 18: case 19: case 20:
			System.out.println("Es por la tarde.");
		case 21: case 22: case 23: case 24:
			System.out.println("Es por la noche");
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("Es de madrugada.");
		}
	}
}

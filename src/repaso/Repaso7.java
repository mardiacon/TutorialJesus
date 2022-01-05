package repaso;

import java.util.Scanner;

public class Repaso7 {

/* 
 * Un programa que te pida introducir una contraseña, y luego te pida que la introduzcas otra vez (como en los 
 * formularios de registro de cualquier página web) y si no coinciden, te diga que no coincide y te la vuelvan a 
 * pedir. Si coinciden que te diga contraseña correcta.
 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String contrasenya1;
		String contrasenya2;
		
		System.out.print("Introduce su contraseña: ");
		contrasenya1 = teclado.nextLine();
		
		System.out.print("Vuelve a introducir su contraseña: ");
		contrasenya2 = teclado.nextLine();
		
		
		while(!contrasenya1.equals(contrasenya2)) {
			System.out.println("Las contraseñas introducidas no coinciden. Vuelva a introducir su contraseña: ");
			System.out.print("Introduce su contraseña: ");
			contrasenya1 = teclado.nextLine();
			System.out.print("Vuelve a introducir su contraseña: ");
			contrasenya2 = teclado.nextLine();
		}
			System.out.println("Contraseña correcta.");
			
			teclado.close();	}
}

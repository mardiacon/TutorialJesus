package repaso;

import java.util.Scanner;

public class Repaso7 {

/* 
 * Un programa que te pida introducir una contrase�a, y luego te pida que la introduzcas otra vez (como en los 
 * formularios de registro de cualquier p�gina web) y si no coinciden, te diga que no coincide y te la vuelvan a 
 * pedir. Si coinciden que te diga contrase�a correcta.
 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String contrasenya1;
		String contrasenya2;
		
		System.out.print("Introduce su contrase�a: ");
		contrasenya1 = teclado.nextLine();
		
		System.out.print("Vuelve a introducir su contrase�a: ");
		contrasenya2 = teclado.nextLine();
		
		
		while(!contrasenya1.equals(contrasenya2)) {
			System.out.println("Las contrase�as introducidas no coinciden. Vuelva a introducir su contrase�a: ");
			System.out.print("Introduce su contrase�a: ");
			contrasenya1 = teclado.nextLine();
			System.out.print("Vuelve a introducir su contrase�a: ");
			contrasenya2 = teclado.nextLine();
		}
			System.out.println("Contrase�a correcta.");
			
			teclado.close();	}
}

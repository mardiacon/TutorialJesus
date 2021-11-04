package tareas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número entero: ");
		
		int numeroEntero = sc.nextInt();
		
		boolean distintoDe0 = numeroEntero != 0;
		
		boolean negativo = numeroEntero < 0;
		
		boolean entre0Y10 = numeroEntero >= 0 && numeroEntero <= 10;
		
		boolean multiplo3Menor20Positivo = numeroEntero % 3 == 0 && numeroEntero > 0 && numeroEntero < 20;
		
		System.out.println("El número es distinto de cero: "+distintoDe0);
		System.out.println("El número es negativo: "+negativo);
		System.out.println("El número está entre cero y diez (ambos incluidos): "+entre0Y10);
		System.out.println("El número es múltiplo de tres, positivo y menor que veinte: "+multiplo3Menor20Positivo);
	
		sc.close();
	}
		
}

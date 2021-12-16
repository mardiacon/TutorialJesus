package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: " );

        try {
            int edad = teclado.nextInt();
            System.out.println("Tienes "+edad+" años.");
        }catch(InputMismatchException excepcion){
            System.out.println("Has metido un valor que no es.");
        }

        System.out.println("Hola");

        teclado.close();
	}
}

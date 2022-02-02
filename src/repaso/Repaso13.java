package repaso;

import java.util.Random;
import java.util.Scanner;

public class Repaso13 {

	public static void main(String[] args) {
		
		/*
		 * Un programa que genere un número aleatorio del 0 al 10 y te pida que lo adivines. 
		 * Cuando lo consigas adivinar que te diga cuántos intentos has necesitado. 
		 */
		
		//Esta es la clase que se utiliza para generar números aleatorios
		Random random = new Random(); 
		//Se utiliza el método de instancia random.nextInt y se guarda en una variable
		int numeroAleatorio = random.nextInt(10);
		//Clase scanner para introducir por teclado
		Scanner teclado = new Scanner(System.in);
		//Se muestra por pantalla la solicitud de introducir un número
		System.out.print("Adivina el número generado (0-10):  ");
		//Se declara e inicializa una variable a 1, ya que después en el bucle se irá incrementando
		int intentos = 1;
		//Se introduce un número
		int numeroIntroducido = teclado.nextInt();
		//Se utiliza el bucle while, entre paréntesis tenemos que poner lo que se debe cumplir para que se quede en el
		//bucle, en este caso que el numeroIntroducido sea distinto al numeroAleatorio
		while(numeroIntroducido != numeroAleatorio){
			//Si los números son distintos se les vuelve a pedir
			System.out.print("El número no es correcto. Vuelva a intentarlo: ");
			//Se introduce otro número
			numeroIntroducido = teclado.nextInt();
			//SE incrementa el valor de intentos
			intentos ++;
			}
		//Se muestra por pantalla un mensaje de que el número es correcto si no se cumple la condición del while
		System.out.println("El número introducido es correcto. ");
		//Se muestra por pantalla cuántos intentos se han necesitado para averiguarlo
		System.out.println("Has necesitado "+intentos+ " intentos. ");
		
		teclado.close();
		
	}
	
}

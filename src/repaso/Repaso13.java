package repaso;

import java.util.Random;
import java.util.Scanner;

public class Repaso13 {

	public static void main(String[] args) {
		
		/*
		 * Un programa que genere un n�mero aleatorio del 0 al 10 y te pida que lo adivines. 
		 * Cuando lo consigas adivinar que te diga cu�ntos intentos has necesitado. 
		 */
		
		//Esta es la clase que se utiliza para generar n�meros aleatorios
		Random random = new Random(); 
		//Se utiliza el m�todo de instancia random.nextInt y se guarda en una variable
		int numeroAleatorio = random.nextInt(10);
		//Clase scanner para introducir por teclado
		Scanner teclado = new Scanner(System.in);
		//Se muestra por pantalla la solicitud de introducir un n�mero
		System.out.print("Adivina el n�mero generado (0-10):  ");
		//Se declara e inicializa una variable a 1, ya que despu�s en el bucle se ir� incrementando
		int intentos = 1;
		//Se introduce un n�mero
		int numeroIntroducido = teclado.nextInt();
		//Se utiliza el bucle while, entre par�ntesis tenemos que poner lo que se debe cumplir para que se quede en el
		//bucle, en este caso que el numeroIntroducido sea distinto al numeroAleatorio
		while(numeroIntroducido != numeroAleatorio){
			//Si los n�meros son distintos se les vuelve a pedir
			System.out.print("El n�mero no es correcto. Vuelva a intentarlo: ");
			//Se introduce otro n�mero
			numeroIntroducido = teclado.nextInt();
			//SE incrementa el valor de intentos
			intentos ++;
			}
		//Se muestra por pantalla un mensaje de que el n�mero es correcto si no se cumple la condici�n del while
		System.out.println("El n�mero introducido es correcto. ");
		//Se muestra por pantalla cu�ntos intentos se han necesitado para averiguarlo
		System.out.println("Has necesitado "+intentos+ " intentos. ");
		
		teclado.close();
		
	}
	
}

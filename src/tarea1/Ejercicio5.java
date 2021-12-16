package tarea1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
//		Una m�quina expendedora de productos debe devolver el cambio usando la menor cantidad de monedas posible. 
//		Sabiendo que �nicamente dispone de monedas de veinte c�ntimos, diez c�ntimos, cinco c�ntimos, 
//		dos c�ntimos y un c�ntimo de euro, escribe un programa en Java que solicite por teclado:
//
//			el precio del producto (en c�ntimos de euro, n�mero entero),
//			el dinero introducido en la m�quina para adquirir el producto (en c�ntimos de euro, n�mero entero).
//			Y a continuaci�n calcule y muestre por pantalla el cambio (en c�ntimos) junto con la cantidad de monedas 
//			de cada tipo que se deben devolver y la cantidad total de monedas. Recuerda que hay que devolver 
//			la menor cantidad de monedas posible.
//
//			Recuerda que la informaci�n de entrada que se pide es en c�ntimos de euro (n�mero entero) y no en euros, 
//			que podr�a ser un n�mero real. Es decir si vas a introducir 80 c�ntimos tendr�s que teclear 80 y no 0,80. 
//			Y si vas a introducir 2 euros con 23 c�ntimos tendr�s que teclear 223 y no 2,23.

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Precio del producto (en c�ntimos): ");
		int precioProducto = teclado.nextInt();
		
		System.out.print("Dinero introducido (en c�ntimos): ");
		int dineroIntroducido = teclado.nextInt();
		
		
		int cambio = dineroIntroducido - precioProducto;
		int cambioInicial = cambio;
		
		int monedas20Centimos = cambio / 20;
		cambio = cambio%20;
		int monedas10Centimos = cambio / 10;
		cambio = cambio%10;
		int monedas5Centimos = cambio / 5;
		cambio = cambio%5;
		int monedas2Centimos = cambio / 2;
		cambio = cambio%2;
		int monedas1Centimo = cambio;
		int totalMonedas = monedas20Centimos + monedas10Centimos + monedas5Centimos + monedas2Centimos + monedas1Centimo;
		
		System.out.println("El cambio es: "+cambioInicial+" c�ntimos");
		System.out.println("Monedas de 20 c�ntimos: "+monedas20Centimos);
		System.out.println("Monedas de 10 c�ntimos: "+monedas10Centimos);
		System.out.println("Monedas de 5 c�ntimos: "+monedas5Centimos);
		System.out.println("Monedas de 2 c�ntimos: "+monedas2Centimos);
		System.out.println("Monedas de 1 c�ntimo: "+monedas1Centimo);
		System.out.println("Total de monedas: "+totalMonedas);
		
		teclado.close();
		
	}
}

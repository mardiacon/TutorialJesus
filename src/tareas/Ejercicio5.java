package tareas;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
//		Una máquina expendedora de productos debe devolver el cambio usando la menor cantidad de monedas posible. 
//		Sabiendo que únicamente dispone de monedas de veinte céntimos, diez céntimos, cinco céntimos, 
//		dos céntimos y un céntimo de euro, escribe un programa en Java que solicite por teclado:
//
//			el precio del producto (en céntimos de euro, número entero),
//			el dinero introducido en la máquina para adquirir el producto (en céntimos de euro, número entero).
//			Y a continuación calcule y muestre por pantalla el cambio (en céntimos) junto con la cantidad de monedas 
//			de cada tipo que se deben devolver y la cantidad total de monedas. Recuerda que hay que devolver 
//			la menor cantidad de monedas posible.
//
//			Recuerda que la información de entrada que se pide es en céntimos de euro (número entero) y no en euros, 
//			que podría ser un número real. Es decir si vas a introducir 80 céntimos tendrás que teclear 80 y no 0,80. 
//			Y si vas a introducir 2 euros con 23 céntimos tendrás que teclear 223 y no 2,23.

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Precio del producto (en céntimos): ");
		Integer precioProducto = teclado.nextInt();
		
		System.out.println("Dinero introducido (en céntimos): ");
		Integer dineroIntroducido = teclado.nextInt();
		
		Integer suma = 0;
		
		
		
	
	}
}

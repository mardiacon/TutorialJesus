package clases;

//import significa buscar herramientas en la caja de herramientas. Est� buscando la
//clase Scanner dentro del paquete java, que a su vez est� dentro del paquete �til.

import java.util.Scanner;

public class MeterDatos {

	public static void main(String[] args) {
		
		//As� declaramos un objeto de tipo Scanner (dogma).Sirve para que el usuario meta
		//datos por consola.
		
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Introduce tu ciudad: ");
		
		//El m�todo nextline de la clase Scanner sirve para meter datos de tipo texto. 
		
		String city = sc.nextLine(); 
		
		System.out.println("Mi ciudad es: "+city);
		
		
		System.out.println("Introduce tu edad: ");
		
		//nextInt sirve para meter n�meros enteros.
		
		int age = sc.nextInt();
		
		System.out.println("Tienes "+age +" a�os");
		
		//nextDouble sirve para meter n�meros decimales.
		
		System.out.println("Introduce tu altura: ");
		
		double height = sc.nextDouble();
		
		System.out.println("Tu altura es de "+height + " metros");
		
		//Sirve para cerrar el Scanner.
		
		sc.close();
		

	}
}

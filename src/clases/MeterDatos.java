package clases;

//import significa buscar herramientas en la caja de herramientas. Está buscando la
//clase Scanner dentro del paquete java, que a su vez está dentro del paquete útil.

import java.util.Scanner;

public class MeterDatos {

	public static void main(String[] args) {
		
		//Así declaramos un objeto de tipo Scanner (dogma).Sirve para que el usuario meta
		//datos por consola.
		
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Introduce tu ciudad: ");
		
		//El método nextline de la clase Scanner sirve para meter datos de tipo texto. 
		
		String city = sc.nextLine(); 
		
		System.out.println("Mi ciudad es: "+city);
		
		
		System.out.println("Introduce tu edad: ");
		
		//nextInt sirve para meter números enteros.
		
		int age = sc.nextInt();
		
		System.out.println("Tienes "+age +" años");
		
		//nextDouble sirve para meter números decimales.
		
		System.out.println("Introduce tu altura: ");
		
		double height = sc.nextDouble();
		
		System.out.println("Tu altura es de "+height + " metros");
		
		//Sirve para cerrar el Scanner.
		
		sc.close();
		

	}
}

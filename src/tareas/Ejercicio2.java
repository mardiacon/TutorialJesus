package tareas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		
		//Variable de entrada (introduzco un valor).
		double numero1 = sc.nextDouble();
		
		System.out.print("Introduce el segundo número: ");
		
		//Variable de entrada (introduzco un valor).
		double numero2 = sc.nextDouble();
		
		//Variable de salida (me las devuelve el programa).
		double triple = numero1 * 3;
		
		System.out.println("El triple del primer número es: "+triple);
		
		//Variable de salida (me las devuelve el programa).
		double decimaParte = numero2 / 10;
		
		System.out.println("La décima parte del segundo número es "+decimaParte);
		
		
		//Variables auxiliares (ni las introduzco ni las devuelvo).
		double producto = numero1 * numero2;
		double dobleProducto = producto * 2;
		//Variable de salida (me las devuelve el programa).
		double cuadrado = dobleProducto * dobleProducto;
		
		System.out.println("El cuadrado del doble del producto de ambos números es: "+cuadrado);
		
		//Variables auxiliares (ni las introduzco ni las devuelvo).
		double suma = numero1 + numero2;
		double cuadradoSuma = suma * suma;
		//Variable de salida (me las devuelve el programa).
		double mitadCuadrado = cuadradoSuma / 2;
		
		System.out.println("La mitad del cuadrado de la suma de ambos números es: "+mitadCuadrado);
		
		sc.close();
		
		
		
		
	}
}

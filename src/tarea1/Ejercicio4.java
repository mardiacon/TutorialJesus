package tarea1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
//		Un vehículo realiza un trayecto en dos etapas: en la primera etapa se consume la mitad del combustible 
//		contenido en el depósito del vehículo mientras que en la segunda consumirá el 25% de lo que quede en el depósito.
//		Escribe un programa en Java que pida la cantidad de litros iniciales con los que se rellena el depósito
//		del vehículo y calcule cuántos litros se consumen en cada uno de los trayectos, así como cuántos litros 
//		quedarán en el depósito una vez finalizados ambos trayectos.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad inicial de litros que se introducen en el depósito del vehículo: ");
		
		double deposito = teclado.nextDouble();
		
		double primeraEtapa = deposito / 2;
		
		double segundaEtapa = primeraEtapa * 0.25;
		
		double litrosFinales = deposito - primeraEtapa - segundaEtapa;
		
		System.out.println("Litros consumidos en el primer recorrido: "+primeraEtapa);
		System.out.println("Litros consumidos en el segundo recorrido: "+segundaEtapa);
		System.out.println("Litros sobrantes: "+litrosFinales);
			
		teclado.close();
		
		
	}
}

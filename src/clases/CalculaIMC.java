package clases;

import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		
		//Calcula el IMC. Dividir tu peso entre tu altura al cuadrado. El peso en Kg
		//y la altura en m. El programa te pide: introduce tu peso, introduce tu altura.
		//Calcula el IMC y que muestre por pantalla "Tu IMC es de ".
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu peso ");
		
		double weight = sc.nextDouble();
		
		System.out.println("Introduce tu altura ");
		
		double height = sc.nextDouble();
		
		double square = height * height;
		
		double IMC = weight / square;
		
		System.out.println("Tu IMC es de "+IMC);
		
		sc.close();
		
		
			
			
	
	}
	
}

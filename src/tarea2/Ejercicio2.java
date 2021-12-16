package tarea2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un año (entre 1801-2100): ");
		
		int anyo = teclado.nextInt();
		
		if (anyo <1801 || anyo >2100) {
			System.out.println("El año introducido no es válido.");
		}else {
			String siglo;
			if (anyo >=1801 && anyo <=1900) { 
				siglo = "XIX.";
			}else if (anyo >=1901 && anyo <=2000) {
				siglo = "XX.";
			}else {
				siglo = "XXI.";
			}
			System.out.println("El año pertenece al siglo "+siglo);
			int diferenciaAnyos;
			String mensajeDiferencia;
			if (anyo <2021) {
				diferenciaAnyos = 2021 - anyo;
				mensajeDiferencia = "El año introducido es anterior al actual. Han pasado "+diferenciaAnyos+" años.";
			}else if (anyo ==2021) {
				diferenciaAnyos = 0;
				mensajeDiferencia = "El año introducido coincide con el actual.";
			}else {
				diferenciaAnyos = anyo - 2021;
				mensajeDiferencia = "El año introducido es posterior al actual. Faltan "+diferenciaAnyos+" años.";
			}
			System.out.println(mensajeDiferencia);
		}
		
		
		
		
	}
}

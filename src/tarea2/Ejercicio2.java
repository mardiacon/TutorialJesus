package tarea2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un a�o (entre 1801-2100): ");
		
		int anyo = teclado.nextInt();
		
		if (anyo <1801 || anyo >2100) {
			System.out.println("El a�o introducido no es v�lido.");
		}else {
			String siglo;
			if (anyo >=1801 && anyo <=1900) { 
				siglo = "XIX.";
			}else if (anyo >=1901 && anyo <=2000) {
				siglo = "XX.";
			}else {
				siglo = "XXI.";
			}
			System.out.println("El a�o pertenece al siglo "+siglo);
			int diferenciaAnyos;
			String mensajeDiferencia;
			if (anyo <2021) {
				diferenciaAnyos = 2021 - anyo;
				mensajeDiferencia = "El a�o introducido es anterior al actual. Han pasado "+diferenciaAnyos+" a�os.";
			}else if (anyo ==2021) {
				diferenciaAnyos = 0;
				mensajeDiferencia = "El a�o introducido coincide con el actual.";
			}else {
				diferenciaAnyos = anyo - 2021;
				mensajeDiferencia = "El a�o introducido es posterior al actual. Faltan "+diferenciaAnyos+" a�os.";
			}
			System.out.println(mensajeDiferencia);
		}
		
		
		
		
	}
}

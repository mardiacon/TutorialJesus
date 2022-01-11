package repaso;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Repaso10 {

	/*
	 * Un programa que te pida la fecha en la que naciste. Si has puesto una fecha posterior a hoy pues que 
	 * te diga que eso no es posible y te vuelva a pedir que la introduzcas. 
	 * Cuando ya sea correcta que calcule cuántos días han pasado hasta hoy y te diga “has vivido x días”.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el año de su nacimiento: ");
		int anyo = teclado.nextInt();
		System.out.print("Introduzca el mes de su nacimiento: ");
		int mes = teclado.nextInt();
		System.out.print("Introduzca el día de su nacimiento: ");
		int dia = teclado.nextInt();
		
		
		LocalDate fechaNacimiento = LocalDate.of(anyo, mes, dia);
		LocalDate fechaActual = LocalDate.now(); 
	
		while(fechaNacimiento.isAfter(fechaActual)) {
			System.out.println("La fecha introducida es posterior a la fecha actual. ");
			System.out.print("Introduzca el año de su nacimiento: ");
			anyo = teclado.nextInt();
			System.out.print("Introduzca el mes de su nacimiento: ");
			mes = teclado.nextInt();
			System.out.print("Introduzca el día de su nacimiento: ");
			dia = teclado.nextInt();
			fechaNacimiento = LocalDate.of(anyo, mes, dia);
		}
		
		System.out.println("La fecha introducida es correcta. Has vivido "+ fechaNacimiento.until(fechaActual, ChronoUnit.DAYS)+ " días.");
		
		teclado.close();
	}
}

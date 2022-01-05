package repaso;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Repaso6 {

	/*
	 * Un programa que te pida una hora y, dependiendo de la hora introducida, te diga si es por la mañana
	 * (de 6 incluida a 12 sin incluir), medio día (de 12 incluida a 4 sin incluir), tarde (de 4 incluida a 9 sin
	 * incluir), noche (de 9 incluida a 1 sin incluir) o madrugada (de 1 incluida a 6 sin incluir). En caso de 
	 * conseguir el ejercicio, ir un paso adelante y controlar que la hora se introduce bien, es decir, que si metes
	 * una letra o metes valores fuera del rango te lo vuelva a pedir.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int hora;
		int minuto;
		
		do {
			try {
				System.out.print("Introduzca hora (00-23): ");
				hora = teclado.nextInt();
			} catch (InputMismatchException excepcion) {
				System.out.println("Error de lectura: no es un número entero válido.");
				teclado.next();
				hora = 24;
			}
		} while (hora < 00 || hora > 23);
		
		do {
			try {
				System.out.print("Introduce minuto (00-59): ");
				minuto = teclado.nextInt();
			} catch (InputMismatchException excepcion) {
				System.out.println("Error de lectura: no es un número entero válido.");
				teclado.next();
				minuto = 60;
			}
		} while (minuto < 0 || minuto > 59);
		
		LocalTime horaIntroducida = LocalTime.of(hora, minuto);
		LocalTime horaInicio =  LocalTime.of(6, 0);
		LocalTime manyana = horaInicio.plusHours(6);
		LocalTime medioDia = manyana.plusHours(4); 	
		LocalTime tarde = medioDia.plusHours(5);
		LocalTime noche = tarde.plusHours(3);
		LocalTime madrugada = noche.plusHours(6);
		
	
			if(horaIntroducida.equals(manyana) || horaIntroducida.isAfter(madrugada) && horaIntroducida.isBefore(manyana)) {
				System.out.println("Es por la mañana.");
			}else if(horaIntroducida.equals(medioDia) || horaIntroducida.isAfter(manyana) && horaIntroducida.isBefore(medioDia)) {
				System.out.println("Es medio día.");
			}else if(horaIntroducida.equals(tarde) || horaIntroducida.isAfter(medioDia) && horaIntroducida.isBefore(tarde)) {
				System.out.println("Es por la tarde.");
			}else if(horaIntroducida.equals(noche) || horaIntroducida.isAfter(tarde)){
				System.out.println("Es por la noche.");
			}else {
				System.out.println("Es de madrugada. ");
			
//				InputMismatchException
				
//				System.out.println("Has introducido un valor no válido. ");
//				System.out.print("Introduce la hora: ");
//				hora = teclado.nextInt();
//				System.out.print("Introduce los minutos: ");
//				minuto = teclado.nextInt();
//				horaIntroducida = LocalTime.of(hora, minuto);
//			
		}
		teclado.close(); 
	}
}

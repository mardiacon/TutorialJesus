package tarea3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		LocalTime horaInicio = LocalTime.of(8, 0);

		Scanner teclado = new Scanner(System.in);

		int hora;

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
		

		int minuto;

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
		
		System.out.println(horaIntroducida);

		Boolean esAntesClase = horaIntroducida.isBefore(horaInicio);
		
		Long minutosAntesComienzo = horaIntroducida.until(horaInicio, ChronoUnit.MINUTES);
		
		LocalTime horaSistemas = horaInicio.plusHours(2);
		
		Boolean esProgramacion = horaIntroducida.equals(horaInicio) || horaIntroducida.isAfter(horaInicio) && horaIntroducida.isBefore(horaSistemas);
		
		LocalTime horaEntornos = horaSistemas.plusHours(2);
		
		Boolean esSistemas = horaIntroducida.equals(horaSistemas) || horaIntroducida.isAfter(horaSistemas) && horaIntroducida.isBefore(horaEntornos);
		
		LocalTime horaDespuesClase = horaEntornos.plusHours(2);
		
		Boolean esEntornos = horaIntroducida.equals(horaEntornos) || horaIntroducida.isAfter(horaEntornos) && horaIntroducida.isBefore(horaDespuesClase);
		
		Long minutosDespuesFinalizacion = horaDespuesClase.until(horaIntroducida, ChronoUnit.MINUTES);
		
		
		if(esAntesClase){
			System.out.println("Clase correspondiente: Aún no ha comenzado la jornada. Falta " + minutosAntesComienzo + " minutos para comenzar.");
		}else if(esProgramacion) {
			System.out.println("Clase correspondiente: Programación.");
		}else if(esSistemas) { 
			System.out.println("Clase correspondiente: Sistemas Informáticos.");
		}else if(esEntornos) {
			System.out.println("Clase correspondiente: Entornos de Desarrollo.");
		}else {
			System.out.println("Clase correspondiente: La jornada ya ha finalizado. Han pasado " + minutosDespuesFinalizacion + " minutos desde el fin.");
		}
			
		teclado.close();
	}

}

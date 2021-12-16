package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Fechas {

	public static void main(String[] args) {
		
		LocalDate fecha = LocalDate.now();
		System.out.println(fecha);
		
		LocalDate miFecha = LocalDate.of(2021, 12, 16);
		System.out.println(miFecha);
		
		LocalDate miNacimiento = LocalDate.of(1997, 4, 30);
		System.out.println(miNacimiento);
		
		System.out.println(miNacimiento.getDayOfYear());
		System.out.println(miNacimiento.getMonthValue());
		
		System.out.println(miNacimiento.isBefore(fecha));
		System.out.println(miNacimiento.isAfter(miFecha));
		
		LocalTime hora = LocalTime.now();
		System.out.println(hora);
		
		LocalTime miHora = LocalTime.of(20, 20);
		System.out.println(miHora);
		
		System.out.println(hora.isBefore(miHora));
		miHora = miHora.plusMinutes(30);
		System.out.println(miHora);
		
	}
	
}

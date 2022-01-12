package repaso;

import java.time.LocalDate;
import java.util.Scanner;

public class Repaso11 {
	
	/*
	 * Un programa que te pida el día en el que diste positivo en COVID (el año no hace falta introducirlo, 
	 * vamos a establecer que sea el 2022), y que te diga cuándo acabas la cuarentena, teniendo en cuenta 
	 * que el tiempo de cuarentena son 10 días.
	 */

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el día en el que dió positivo en COVID-19: ");
		int dia = teclado.nextInt();
		System.out.print("Introduzca el mes en el que dió positivo en COVID-19: ");
		int mes = teclado.nextInt();
		int anyo = 2022;
		
		LocalDate positivoCovid = LocalDate.of(anyo, mes, dia);
		System.out.println("Diste positivo en esta fecha: "+positivoCovid);
		LocalDate finCuarentena = positivoCovid.plusDays(10);
		System.out.println("Acabas la cuarentena en esta fecha: "+finCuarentena);
			
		teclado.close();
	}
}

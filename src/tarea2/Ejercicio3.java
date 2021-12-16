package tarea2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca número (1-7, 10-12): ");

        int numeroCarta = teclado.nextInt();
        int puntuacion;

        switch(numeroCarta) {
        case 1:
            puntuacion = 11;
            break;
        case 2:case 4:case 5:case 6:case 7: 
            puntuacion = 0;
            break;
        case 3:
            puntuacion = 10;
            break;
        case 10:
            puntuacion = 2;
            break;
        case 11:
            puntuacion = 3;
            break;
        case 12:
            puntuacion = 4;
            break;
        default:
            puntuacion = -1;
        }

        System.out.println("El valor del naipe con este número es: "+puntuacion);

        teclado.close();
	}
}

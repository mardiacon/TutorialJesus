package tarea2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un texto de al menos 5 caracteres: ");

        String palabra = teclado.nextLine();

        while(palabra.length() < 5) {
            System.out.print("Introduzca un texto de al menos 5 caracteres: ");
            palabra = teclado.nextLine();
        }

        System.out.print("Introduzca el valor del multiplicador: ");

        int multiplicador = teclado.nextInt();

        while(multiplicador <1 || multiplicador >3) {
            System.out.print("Introduzca el valor del multiplicador: ");
            multiplicador = teclado.nextInt();
        }

        int puntuacion = 0;
        for(int posicion = 0; posicion < palabra.length(); posicion++) {
            char letra = palabra.charAt(posicion);

            switch(letra) {
            case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
                puntuacion += 1;
                break;
            case 'x': case 'y': case 'z':
                puntuacion += 2;
                break;
            case 'X':
                puntuacion +=5;
                break;
            default:
                puntuacion -=1;
            }

        }

        int puntuacionFinal = puntuacion * multiplicador;

        System.out.println("El valor del texto es: "+puntuacionFinal);

        teclado.close();
	}
}

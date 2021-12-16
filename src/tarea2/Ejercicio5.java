package tarea2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca n�mero de filas (2-10): ");
		
		int numeroFilas = teclado.nextInt();
		
		while (numeroFilas <2 || numeroFilas >10) {
			System.out.print("Introduzca n�mero de filas (2-10): ");
			numeroFilas = teclado.nextInt();
		}
		
		System.out.print("Introduzca n�mero de columnas (2-10): ");
		
		int numeroColumnas = teclado.nextInt();
		
		while (numeroColumnas <2 || numeroColumnas >10) {
			System.out.print("Introduzca n�mero de columnas (2-10): ");
			numeroColumnas = teclado.nextInt();
		}
		
		System.out.print("�Caja rellena? (0: vac�a, cualquier otro n�mero rellena): ");
		
		int rellena = teclado.nextInt();
		
		/*
         * 
         * +---+
         * |   |
         * |   |
         * |   |
         * +---+ 
         * 
         */
		
		String caja = "";
				
        //Aqui vamos a construir el techo ==> caja = "+---+" ==> Para indicar un salto de l�nea hay que escribir \n
		
        for(int columnaActual = 0; columnaActual < numeroColumnas; columnaActual++) {
            if(columnaActual == 0) {
                caja += "+";
            }else if (columnaActual == numeroColumnas-1) {
                caja += "+\n";
            }else {
                caja += "-";
            }
        }
        
        //Aqu� vamos a contruir el cuerpo 
        
        for(int filaActual = 1; filaActual < numeroFilas-1; filaActual++) {
            for(int columnaActual = 0; columnaActual < numeroColumnas; columnaActual++) {
            	if(columnaActual == 0) {
            		caja += "|";        	
            	}else if(columnaActual == numeroColumnas -1) {
            		caja += "|\n";
            	}else {
            		if(rellena == 0) {
            			caja += " ";
            		}else {
            			caja += filaActual;
            		}
            	}
            }
        }

        //Aqu� vamos a contruir el suelo ==> caja = "+---+" 
        
        for(int columnaActual = 0; columnaActual < numeroColumnas; columnaActual++) {
            caja += columnaActual == 0 || columnaActual == numeroColumnas -1 ? "+" : "-"; 
        }
		System.out.println(caja);
	}
}

package tarea4;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String[] palabras = {"Hola", "sol","AMOR","ARA","Casa","dos"};
		
		char[][] sopa = {{'H','J','S','O','L'},{'O','E','C','A','U'},{'L','Y','K','D','A'},{'A','A','M','O','R'},{'V','C','A','S','A'}};
		
		String [] resultados = new String[palabras.length];
		
		for(int i = 0; i < sopa.length; i++) {
			char[] fila = sopa[i];
			for(int j = 0; j < fila.length; j++) {
				char columna = fila[j];
				if(j != fila.length-1) {
					System.out.print(columna+" ");
				}else {
					System.out.print(columna+"\n");
				}
			}
		}
		
		System.out.println(Arrays.toString(palabras));
		
		for(int i = 0; i < palabras.length; i++) {
			String palabra = palabras[i];
			palabra = palabra.toUpperCase();
			for(int j = 0; j < sopa.length; j ++) {
				char[] fila = sopa[j];
				String filaString = Arrays.toString(fila).replace("[", "").replace("]","").replace(",", "").replace(" ", "");
				Boolean contenida = filaString.contains(palabra);
				if(contenida) {
					int columna = filaString.indexOf(palabra);
					String posicion = "fila "+j+" columna "+columna;
					resultados[i] = posicion;
					break;
				}
			}
			
			if(resultados[i] == null) {
				resultados[i] = "no";
			}
			
		}
		
		System.out.println(Arrays.toString(resultados));
		
	}
	
}

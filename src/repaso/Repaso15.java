package repaso;

import java.util.Arrays;

public class Repaso15 {

	/*
	 * Declarar un array de String con palabras con mayúsculas y minúsculas. Guardar en otro array de String el número de 
	 * mayúsculas y minúsculas por cada palabra. Cada elemento en el array resultado será algo así: 
	 * hOLa. 2 minúsculas 2 mayúsculas.
	 */
	
	public static void main(String[] args) {
		
		String[] nombresGatos = {"RoSalie", "wHisky", "Pussy", "beto", "Pelusa", "sUGAr"};
		
		String[] resultados = new String [nombresGatos.length];
	
		for(int i = 0; i < nombresGatos.length; i++) {
			//RECORDAR, QUE SIEMPRE SE TE OLVIDA
			//PARA ACCEDER A UN ELEMENTO DE UN ARRAY PONEMOS EL NOMBRE DEL ARRAY
			//Y ENTRE CORCHETES LA POSICIÓN QUE QUEREMOS
			String nombre = nombresGatos[i];
			//Ahora a contar las minúsculas y mayúsculas
			//Para ello tenemos que ir viendo letra por letra
			int nMinusculas = 0;
			int nMayusculas = 0;
			for(int j = 0; j < nombre.length(); j++) {
				char letra = nombre.charAt(j);
				boolean esMinuscula = Character.isLowerCase(letra);
				if(esMinuscula) {
					nMinusculas++;
				}else {
					nMayusculas++;
				}
			}
			String resultado = nombre+": "+nMinusculas+" minúsculas "+nMayusculas+" mayúsculas";
			//RECORDAR: PARA METER UN VALOR EN UN ARRAY ES NOMBRE DEL ARRAY, ENTRE CORCHETES LA POSICIÓN,
			//E IGUAL AL VALOR QUE QUERAMOS
			resultados[i] = resultado;
		}
		
		System.out.println(Arrays.toString(resultados));
	}
}

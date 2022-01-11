package tarea4;

import java.util.Arrays;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		String[] textos = {"Reconocer", "AMANECER", "Esto no es un palindromo", "Dabale arroz a la zorra el abad.", 
				"A man, a plan, a canal: Panama.", "A man a plan and a canal, Panama.", "No deseo ese don..."};
		
		boolean[] resultados = new boolean[textos.length];
		
		for(int i = 0; i < textos.length; i++) {
			System.out.println("Texto "+(i+1)+ " : "+textos[i]);
		}
		
		for(int i = 0; i < textos.length; i++) {
			String palabra = textos[i];
			palabra = palabra.toLowerCase().replace(" ","").replace(",","").replace("...","").replace(":", "").replace(".","");
			StringBuilder inversor = new StringBuilder(palabra);
			String palabraInvertida = inversor.reverse().toString();
			boolean palindromo = palabraInvertida.equals(palabra);
			resultados[i] = palindromo;
		}
		System.out.println("Palíndromos encontrados: " +Arrays.toString(resultados));
	}

}

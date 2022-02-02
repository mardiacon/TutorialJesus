package tarea4;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String[] textos = {"Reconocer", "AMANECER", "Esto no es un palindromo", "Dabale arroz a la zorra el abad.", 
				"A man, a plan, a canal: Panama.", "A man a plan and a canal, Panama.", "No deseo ese don..."};
		
		String[] resultados = new String[textos.length];
		
		for(int i = 0; i < textos.length; i++) {
			System.out.println("Texto "+(i+1)+ " : "+textos[i]);
		}
		
		for(int i = 0; i < textos.length; i++) {
			String palabra = textos[i];
			palabra = palabra.replace(",","").replace("...","").replace(":","").replace(".", "");
			String[] textoPartido = palabra.split(" ");
			String[] palabrasAlReves = new String[textoPartido.length];
			for(int j = 0; j < textoPartido.length; j++) {
				String trozo = textoPartido[j];
				StringBuilder inversor = new StringBuilder(trozo);
				String palabraInvertida = inversor.reverse().toString();
				palabrasAlReves[j] = palabraInvertida;
			}
			String textoAlReves = String.join(" ", palabrasAlReves);
			resultados[i] = textoAlReves;
		}
		System.out.println(Arrays.toString(textos));
		System.out.println(Arrays.toString(resultados));
		
	}
}

package tarea4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String[] anotaciones = {"a", "a-b", "X-A", "O-O-B", "X--X", "O-X-", "-X-X", "O-X-O-X-O", "o", "O-o", "X", 
				"o-x-o", "x", "x-x", "O-x-X", "X-X-X", "x-X-X-x"};
		
		System.out.println(Arrays.toString(anotaciones));
		
		StringBuilder sb = new StringBuilder();
		int validas = 0;
		int invalidas = 0;
		Pattern expresion = Pattern.compile("^([oOxX]-[oOxX]-[oOxX]-[oOxX]|[oOxX]-[oOxX]-[oOxX]|[oOxX]-[oOxX]|[oOxX])$");
		
		for(int i = 0; i < anotaciones.length; i++) {
			String anotacion = anotaciones[i];
			Matcher m = expresion.matcher(anotacion);
			String puntuacion;
			if(m.matches()) {
				validas++;
				String[] arrayAnotacion = anotacion.split("-");
				int puntos = 0;
				for(int j = 0; j < arrayAnotacion.length; j++) {
					String punto = arrayAnotacion[j];
					if(punto.equals("x") || punto.equals("X")) {
						puntos++;
					}
				}
				puntuacion = String.valueOf(puntos);
			}else {
				invalidas++;
				puntuacion = "-1";
			}
			sb.append(puntuacion);
			sb.append(",");
		}
		
		System.out.println("Puntuaciones: "+sb);
		System.out.println("Número de anotaciones válidas: "+validas);
		System.out.println("Número de anotaciones inválidas: "+invalidas);
		
	}
	
}

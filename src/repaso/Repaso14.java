package repaso;

import java.util.Arrays;

public class Repaso14 {

	/*
	 * Declarar un array de String con varias palabras (algunas que empiecen por
	 * mayúscula y otras no). Guardar en un array de resultados si cada palabra del
	 * otro array empieza por mayúscula o no.
	 */

	public static void main(String[] args) {

		/*
		 * Declaro el Array de String, como sé los elementos que van dentro utilizo esta
		 * primera forma. Los Strings van entre comillas dobles. Los char entre comillas
		 * simples.
		 */

		String[] nombresGatos = { "Rosalie", "whisky", "Pussy", "beto", "Pelusa", "sugar" };
		
		/*
		 * Declaro como array de resultados un array de boolean, porque hay que indicar si empieza
		 * por mayúscula o no(sí o no, true o false). Como hay que indicar eso por cada nombre
		 * pues el array de resultados debe tener el mismo número de elementos, así que usamos
		 * el length del array de gatos
		 */
		
		boolean[] resultados = new boolean[nombresGatos.length];
		
		for(int i = 0; i < nombresGatos.length; i++) {
			//RECORDAR, QUE SIEMPRE SE TE OLVIDA
			//PARA ACCEDER A UN ELEMENTO DE UN ARRAY PONEMOS EL NOMBRE DEL ARRAY
			//Y ENTRE CORCHETES LA POSICIÓN QUE QUEREMOS
			String nombre = nombresGatos[i];
			//Ahora que tenemos el nombre, vamos a ver su primera letra para ver si es mayúscula
			char primeraLetra = nombre.charAt(0);
			//Una vez la tengamos, miramos si es mayúscula, con el método estático isUpperCase() de la clase Character
			boolean esMayuscula = Character.isUpperCase(primeraLetra);
			//Ahora guardamos el resultado en el array resultados
			//PARA METER DATOS EN UN ARRAY PONEMOS EL NOMBRE DEL ARRAY, ENTRE CORCHETES LA POSICIÓN QUE QUEREMOS
			//E IGUAL AL VALOR QUE SEA
			resultados[i] = esMayuscula;
			
		}
		
		//Y lo mostramos
		System.out.println(Arrays.toString(resultados));


	}

}

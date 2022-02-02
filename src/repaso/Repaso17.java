package repaso;

public class Repaso17 {

	public static void main(String[] args) {
		
		/*
		 * Declarar un array bidimensional de caracteres con números y letras. Contar cuantas letras y números hay, 
		 * y mostrarlo por pantalla. Además, cada vez que encuentre una letra o número, hay que indicarlo también 
		 * con un mensaje tal que así: “El carácter {a} es una letra” (dentro del StringBuilder). 
		 * El resultado se debe mostrar en un 
		 * StringBuilder, y cada elemento debe ir en una línea diferente, no se deberá mostrar el resultado en una 
		 * sola línea.
		 */
		
		//Array bidimensional: filas y columnas
		char[][] matriz = {{'a','3','B'},{'0','2','p'},{'c','q','d'}};
		//Declaramos el StringBuilder para ir añadiendo las cosas
		StringBuilder resultado = new StringBuilder();
		//Como queremos contar algo, declaramos las variables enteras para ir sumando
		int nLetras = 0;
		int nNumeros = 0;
		
		//Empezamos a recorrer. Lo primero son las filas
		for(int i = 0; i < matriz.length; i++) {
			//RECORDAR, QUE SIEMPRE SE TE OLVIDA
			//PARA ACCEDER A UN ELEMENTO DE UN ARRAY PONEMOS EL NOMBRE DEL ARRAY
			//Y ENTRE CORCHETES LA POSICIÓN QUE QUEREMOS
			char[] fila = matriz[i];
			//Y ahora las columnas de cada fila
			for(int j = 0; j < fila.length; j++) {
				//RECORDAR, QUE SIEMPRE SE TE OLVIDA
				//PARA ACCEDER A UN ELEMENTO DE UN ARRAY PONEMOS EL NOMBRE DEL ARRAY
				//Y ENTRE CORCHETES LA POSICIÓN QUE QUEREMOS
				char columna = fila[j];
				//Para ver si es un número usamos el método estático isDigit() de la clase Character
				boolean esNumero = Character.isDigit(columna);
				if(esNumero) {
					//Si es número aumentamos el número de números y añadimos al StringBuilder
					//que lo hemos encontrado (importante el \n para el salto de línea)
					nNumeros++;
					resultado.append("El caracter {"+columna+"} es un número.\n");
				}else {
					//Para las letras igual
					nLetras++;
					resultado.append("El caracter {"+columna+"} es una letra.\n");
				}
			}
		}
		
		//Mostramos por pantalla
		System.out.println(resultado);
		System.out.println("Números: "+nNumeros);
		System.out.println("Letras: "+nLetras);
	}
}

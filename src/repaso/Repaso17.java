package repaso;

public class Repaso17 {

	public static void main(String[] args) {
		
		/*
		 * Declarar un array bidimensional de caracteres con n�meros y letras. Contar cuantas letras y n�meros hay, 
		 * y mostrarlo por pantalla. Adem�s, cada vez que encuentre una letra o n�mero, hay que indicarlo tambi�n 
		 * con un mensaje tal que as�: �El car�cter {a} es una letra� (dentro del StringBuilder). 
		 * El resultado se debe mostrar en un 
		 * StringBuilder, y cada elemento debe ir en una l�nea diferente, no se deber� mostrar el resultado en una 
		 * sola l�nea.
		 */
		
		//Array bidimensional: filas y columnas
		char[][] matriz = {{'a','3','B'},{'0','2','p'},{'c','q','d'}};
		//Declaramos el StringBuilder para ir a�adiendo las cosas
		StringBuilder resultado = new StringBuilder();
		//Como queremos contar algo, declaramos las variables enteras para ir sumando
		int nLetras = 0;
		int nNumeros = 0;
		
		//Empezamos a recorrer. Lo primero son las filas
		for(int i = 0; i < matriz.length; i++) {
			//RECORDAR, QUE SIEMPRE SE TE OLVIDA
			//PARA ACCEDER A UN ELEMENTO DE UN ARRAY PONEMOS EL NOMBRE DEL ARRAY
			//Y ENTRE CORCHETES LA POSICI�N QUE QUEREMOS
			char[] fila = matriz[i];
			//Y ahora las columnas de cada fila
			for(int j = 0; j < fila.length; j++) {
				//RECORDAR, QUE SIEMPRE SE TE OLVIDA
				//PARA ACCEDER A UN ELEMENTO DE UN ARRAY PONEMOS EL NOMBRE DEL ARRAY
				//Y ENTRE CORCHETES LA POSICI�N QUE QUEREMOS
				char columna = fila[j];
				//Para ver si es un n�mero usamos el m�todo est�tico isDigit() de la clase Character
				boolean esNumero = Character.isDigit(columna);
				if(esNumero) {
					//Si es n�mero aumentamos el n�mero de n�meros y a�adimos al StringBuilder
					//que lo hemos encontrado (importante el \n para el salto de l�nea)
					nNumeros++;
					resultado.append("El caracter {"+columna+"} es un n�mero.\n");
				}else {
					//Para las letras igual
					nLetras++;
					resultado.append("El caracter {"+columna+"} es una letra.\n");
				}
			}
		}
		
		//Mostramos por pantalla
		System.out.println(resultado);
		System.out.println("N�meros: "+nNumeros);
		System.out.println("Letras: "+nLetras);
	}
}

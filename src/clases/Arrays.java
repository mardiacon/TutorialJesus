package clases;

public class Arrays {

	public static void main(String[] args) {
		
		//Los arrays son conjuntos de datos
		//Si yo quiero declarar variables para las edades de nosotros tendría que hacer esto
		int edadMarta = 24;
		int edadReyes = 59;
		int edadPedro = 56;
		int edadLucia = 27;
		
		//Los arrays sirven para agrupar eso en una sola variable. Se representan con corchetes
		//Hay dos formas de inicializarlos
		
		//1. Si ya sabemos desde el principio qué elementos va a contener
		int[] edades = {24, 59, 56, 27};
		//Y puedo acceder a ellos de esta forma
		System.out.println("Primer elemento del array => "+edades[0]);
		System.out.println("Segundo elemento del array => "+edades[1]);
		//Podemos ver el número de elementos
		System.out.println("El array contiene "+edades.length+" elementos");
		//Si yo quiero mirar todos los elementos podemos hacer lo siguiente
		for(int contador = 0; contador < edades.length; contador++) {
			System.out.println("Elemento "+contador+": "+edades[contador]);
		}
		
		//2. Es posible que no sepamos desde el principio los elementos del array, pero sí el número de elementos
		//que va a contener. Vamos a hacerlo con un array de Strings
		String[] nombres = new String[4];
		nombres[0] = "Marta";
		nombres[1] = "Reyes";
		nombres[2] = "Pedro";
		nombres[3] = "Lucía";
		for(int contador = 0; contador < nombres.length; contador++) {
			System.out.println("Persona "+contador+": "+nombres[contador]);
		}
		
		//La longitud de los arrays es fija desde que lo creas. Si has creado un array de 4 elementos no
		//le puedes meter un quinto porque petaría.
		try {
			nombres[4] = "Jesus";
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No puedes añadir otro elemento más porque no cabe.");
		}
		
		//Existen arrays multidimensionales. Este por ejemplo es de 2x2
		//Al iniciarlo las llaves indican filas y los elementros de dentro las columnas
		char[][] sopaLetras = {{'c','b'}, {'a','o'}};
		System.out.println("La matriz tiene "+sopaLetras.length+" filas.");
		System.out.print("Primera fila: ");
		System.out.println(sopaLetras[0]);
		System.out.print("Segunda fila: ");
		System.out.println(sopaLetras[1]);
		System.out.println("Número de columnas: "+sopaLetras[0].length);
		//Aquí viene lo lioso. Recorrer un array de dos dimensiones
		//Primero hay que recorrer las filas
		for(int fila = 0; fila < sopaLetras.length; fila++) {
			//Y cuando tengamos cada fila, hay que mirar sus columnas con otro for
			for(int columna = 0; columna < sopaLetras[fila].length; columna++) {
				System.out.println("La letra en la fila "+fila+" y columna "+columna+ " es "+sopaLetras[fila][columna]);
			}
		}
		
		//StringBuilder
		//Vamos a aprender la clase StringBuilder porque está relacionada con los arrays.
		//Esta clase es una herramienta para hacer cosas con Strings.
		//Su constructor recibe por parámetro el String con el que queremos hacer cosas.
		
		StringBuilder persona = new StringBuilder("Marta");
		String palabraInvertida = persona.reverse().toString();
		System.out.println(palabraInvertida);
		
		//Método split
		//El método split pertenece a los Strings, y lo que hace es dividir el String según el caracter que se le pase
		//y devuelve los trozos dentro de un array
		String texto = "La martita está suave";
		String[] textoPartido = texto.split(" ");
		//Ahora vamos a hacer el paso inverso. Si tengo un array de Strings y los quiero unir por un caracter
		//Se usa el método estático join de la clase String
		String textoJunto = String.join(" ", textoPartido);
		
	}
	
}

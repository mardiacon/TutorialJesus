package clases;

public class Metodos {

	public static void main(String[] args) {
		
		String nombre = "Marta";
		
		System.out.println("Hola "+nombre+" �Qu� tal? ");
		
		String nombre2 = "Jes�s";
		
		System.out.println("Hola "+nombre2+" �Qu� tal?");
		
		String nombre3 = "Luc�a";
		
		System.out.println("Hola "+nombre3+" �Qu� tal?");
	
		/*
         * M�todos: trozos de c�digo reutilizables que realizan una funci�n. Pueden devolver datos o no devolverlos.
         * Un m�todo debe declararse, y luego llamarse.
         */
		
		// Aqu� estamos llamando al m�todo y pasando por par�metros nuestros nombres.
		
		saludar("Marta");
        saludar("Jesus");
        saludar("Lucia");
        
        sumar(45,76);
		sumar(7321,37389);
		
		operacion(40, 20, 10);
		
		//Hay m�todos que no hace falta que reciban par�metros
		llamaloComoTuQuieras();
		
		operacion(10, 5, 4);
		
		//En este caso llama al m�todo nuevaEdad, el cual recibe dos numeros, los suma y lo devuelve.
		//Al devolverlo, calculaEdad(15,2) valdr� 17, y como eso lo guardas en nuevaEdad pues
		//nuevaEdad valdr� 17. Y luego usas la variable en el if/else para imprimir una cosa u otra.
		int nuevaEdad = calculaEdad(15, 2);
		if(nuevaEdad >= 18) {
			System.out.println("Como dentro de 5 a�os tendr�s "+nuevaEdad+ " a�os, ser�s mayor de edad");
		}else {
			System.out.println("Como dentro de 5 a�os seguir�s teniendo "+nuevaEdad+ " a�os, seguir�s siendo menor de edad");
		}
		
	}
	
		// Aqu� estamos declarando el m�todo.Este m�todo recibe por par�metros un String, el cual vamos a llamar "nombre"
		// y lo muestra por pantalla en un mensaje de saludo.
	
	public static void saludar(String nombre) {

        System.out.println("Hola "+nombre+" �Qu� tal?");
	}

	public static void sumar(int numero1,int numero2) {
		
		int suma = numero1 + numero2;
		
		System.out.println(suma);
		
	}

	//Esto es un metod void, es decir, no devuelve ningun dato. Cuando salga del metodo no hara nada mas.
	//Si no devuelve nada no debe tener la palabra reservada "return".
	public static void operacion(int numero1,int numero2,int numero3) {
		
		int suma = numero1 + numero3;
		int resta = suma - numero2;
		
		System.out.println(resta);
		
	}
	
	public static void llamaloComoTuQuieras() {
		
		System.out.println("Hazme cosquillas o lo que tu quieras");
		
	}
	
	//Este es un metodo que s� devuelve un valor, es decir, el resultado podr� ser usado fuera del metodo.
	//Para eso se pone la palabra return, y en vez de void ponemos el tipo del resultado que se devuelve.
	public static int operacionDevolver(int numero1,int numero2,int numero3) {
		
		int suma = numero1 + numero3;
		int resta = suma - numero2;
		
		return resta;
		
	}
	
	public static int calculaEdad(int edad, int adicion) { 
		
		int suma = edad + adicion;
		
		return suma;
		
		
	}
}

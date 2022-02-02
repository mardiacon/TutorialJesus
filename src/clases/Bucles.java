package clases;

public class Bucles {

	public static void main(String[] args) {
		
		//Bucle: trozo de código que se va a ejecutar repetidamente hasta que digamos que pare.
		//Tres tipos: while, for y do while, pero el do while no se usa para nada.
		//Nomalmente un bucle necesita tres cosas: un contador, una condición y un incrementador.
		
		System.out.println("--------------Primer bucle while----------------------");
		//Bucle while
		//Contador
		int contador = 1;
		//Dentro de los paréntesis la condición
		while(contador <= 5) {
			System.out.println(contador);
			//Incrementador
			contador++; 
		}
		
		System.out.println("-------------------Segundo bucle while--------------------------");

		contador = 10;
		
		while(contador >=1) {
			System.out.println(contador);
			contador--;
		}
		
		System.out.println("---------------------Primer bucle for----------------------------");
		
		//Bucle for
		for(int contador2 = 1; contador2 <= 5; contador2++) {
			System.out.println(contador2);
		}
		
		System.out.println("---------------------Segundo bucle for----------------------------");
		for(int contador3 =10; contador3 >=1; contador3--) {
			System.out.println(contador3);
			
		}
		
		//Un bucle for sirve por ejemplo para recorrer Arrays
		String[] nombres = {"Marta", "Lucía", "Pedro", "Reyes"};
		for(int i = 0; i < nombres.length; i ++) {
			System.out.println(nombres[i]);
		}
		
		//Para recorrer arrays u otro tipo de colecciones (ya se verán más adelante) se suele usar
		// un for-in
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
		
	}
}

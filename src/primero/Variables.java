package primero;

public class Variables {

	public static void main(String[] args) {
		
		//Esto es una variable. Sirven para guardan valores y con estos valores se
		//operará. Ejemplo: en un formulario, el usuario ha guardado su edad, y la edad
		//la va a guardar en una variable de tipo int para posteriormente, por ejemplo,
		//comprobar si es mayor de edad. 
		
		//Declaración:
		//int => numeros sin decimales: 5, 100, -5, 80
		int age;
		
		//Inicialización:
		age = 24;
		
		
		//Se puede declarar e inicializar en una misma línea:
		int height = 171;
		
		//Para mostrar texto hay que escribir entre comillas. Para incluir también la 
		//variable se escribe fuera de las comillas y con un + para que sepa que lo tiene
		//que imprimir.
		System.out.println("Tu edad es: "+age);
		System.out.println("Tu altura es: "+height);
		
		//double => numeros con decimales: 50.8, 50.0, 2244,2
		double money = 500.75;
		System.out.println("Tu saldo es: " +money);
		
		//String => texto entre comillas siempre.
		String name = "Marta Díaz";
		System.out.println("Mi nombre es: "+name);
		
		//boolean => dos valores: true (1) o false (0).
		boolean accepted = true;
		System.out.println(accepted);
	
		
		
		
	}
	
}

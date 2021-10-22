package primero;

public class Operaciones {

	public static void main(String[] args) {
		
		//Existe dos tipos de operaciones: aritméticas y lógicas
		
		//Aritméticas: +, -, *, /, %
		
		int a = 10;
		
		int b = 5;
		
		int c = a + b;
		
		System.out.println(c);
		
		c = a - b;
		
		System.out.println(c);
		
		c = a * b; 
		
		System.out.println(c);
		
		c = a / b;
		
		System.out.println(c);
		
		//El módulo es el resto de la operación
		c = a % b;
		
		System.out.println(c);
		
		//-----------------------------------------------------------------
		
		//Lógicas: >, <, >=, <=, ==, !=. Devuelven resultados booleanos (true o false)
		
		boolean d = a > b;
		
		System.out.println(d);
		
		d = a < b;
		
		System.out.println(d);
		
		d = a >= b;
		
		System.out.println(d);
		
		d = a <= b; 
		
		System.out.println(d);
		
		d = a == b;
		
		System.out.println(d);
		
		d = a != b;
		
		System.out.println(d);
		
		//Lógicas entre booleans: && (y) , || (o)
		
		boolean esMayorDeEdad = true;
		
		boolean esHombre = false;
		
		boolean puedeAcceder = esMayorDeEdad && esHombre; 
		
		System.out.println(puedeAcceder);
		
		puedeAcceder = esMayorDeEdad || esHombre;
		
		System.out.println(puedeAcceder);
		
	
		
	}
	
}

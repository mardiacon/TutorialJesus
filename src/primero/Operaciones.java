package primero;

public class Operaciones {

	public static void main(String[] args) {
		
		//Existe dos tipos de operaciones: aritm�ticas y l�gicas
		
		//Aritm�ticas: +, -, *, /, %
		
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
		
		//El m�dulo es el resto de la operaci�n
		c = a % b;
		
		System.out.println(c);
		
		//-----------------------------------------------------------------
		
		//L�gicas: >, <, >=, <=, ==, !=. Devuelven resultados booleanos (true o false)
		
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
		
		//L�gicas entre booleans: && (y) , || (o)
		
		boolean esMayorDeEdad = true;
		
		boolean esHombre = false;
		
		boolean puedeAcceder = esMayorDeEdad && esHombre; 
		
		System.out.println(puedeAcceder);
		
		puedeAcceder = esMayorDeEdad || esHombre;
		
		System.out.println(puedeAcceder);
		
	
		
	}
	
}

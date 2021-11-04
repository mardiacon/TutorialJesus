package clases;

public class Repaso {

	public static void main(String[] args) {
		
		esMayorDeEdad(15);
		criticoTuAltura(1.75);
		criticoTuAltura(1.60);
		operacion(30, 6, 10);
			
	}
	
	public static void operacion(int numero1, int numero2, int numero3) { 
		
		int suma = numero1 + numero3;
		int resta = suma - numero2;
		
		System.out.println(resta);
		
	}
	
	
	public static void esMayorDeEdad(int edad) {
		
		boolean esMayorDeEdad = edad >=18;
		
		if(esMayorDeEdad) {
			
			System.out.println("Eres mayor de edad");
			
		}else {
			
			System.out.println("Eres menor de edad");
		}
	}
	
	public static void criticoTuAltura(double altura) {
		
		boolean eresAlto = altura >= 1.65;
		
		if(eresAlto) {
			
			System.out.println("Eres alto");
			
		}else {
			
			System.out.println("Eres bajito");
		}
		
	}
}

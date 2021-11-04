package clases;

public class Condiciones {

	public static void main(String[] args) {
		
		int age = 17;
		
		boolean esMayorDeEdad = age >= 18;
		
		System.out.println(esMayorDeEdad);
		
		//Vamos a evaluar la siguiente orden segun la variable esMayorDeEdad
		//con un if else
		
		//Para evaluar se escribe dentro de los paréntesis del if lo que queremos evaluar
		//Si se cumple se ejecuta lo que está dentro de las llaves del if.
		//Si no, lo que está dentro de las llaves del else
		
		if(esMayorDeEdad) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		
		System.out.println("Esto fuera del if/else");
		
		//---------------------------------------------------
		
		double height = 1.80;
		
		//En caso de querer evaluar más cosas, meteremos todos los else if
		//que necesitemos por cada condición adicional.
		if (height >= 1.70) {
			System.out.println("Eres alta");
		}else if(height >= 1.60 && height < 1.70){
			System.out.println("Eres de estatura normal");
		} else {
			System.out.println("Eres bajita");
		}
	
	}
}

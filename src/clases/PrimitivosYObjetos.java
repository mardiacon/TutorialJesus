package clases;

public class PrimitivosYObjetos {
	
	public static void main(String[] args) {
		
		//int, double, boolean, etc son tipos primitivos, almacenan un valor y ya est�
		int a = 4;
		
		//String es un objeto, guarda valor y tiene m�s posibilidades.
		String email = "jescoevas@hotmail.com";
		
		System.out.println(email.contains("@"));
		
		//Pues todo primitivo tiene su versi�n objeto con m�s posibilidades.
		//int => Integer
		Integer b = 4;
		
		System.out.println(b);
		
		//double => Double
		double c = 3.5;
		
		Double d = 3.5;
		
		
		//boolean => Boolean
		boolean esCierto = true;
		
		Boolean esFalso = false;
		
		//char => Character
		char e = '?';
		Character f = '?';
		
	}

}

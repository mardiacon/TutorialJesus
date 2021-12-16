package clases;

public class OperadorTerciario {

	public static void main(String[] args) {
		
		/* 
		 * El operador terciario se usa para if/elses que son de una sola linea cada uno, y se ahorra codigo.
         * En vez de asignar el valor a mensajeEdad con un if/else, usamos el operador ?.
         * Lo primero es poner la condicion que queremos evaluar (edad >= 18), y luego ponemos el ? como si lo estuviesemos preguntando.
         * Y luego ponemos :, y a la izquierda ponemos el valor que queremos meter en mensajeEdad en caso de que se cumpla la condicion (if),
         * y a la derecha en caso de que no (else)
         */
		
		int edad = 18;
        String mensajeEdad = edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad" ;

//        if(edad >= 18) {
//            mensajeEdad = "Eres mayor de edad";
//        }else {
//            mensajeEdad = "Eres menor de edad";
//        }
	}
}

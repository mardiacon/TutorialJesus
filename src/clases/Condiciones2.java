package clases;

import java.util.Scanner;

public class Condiciones2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");

        int nota = sc.nextInt();

        if(nota < 0 || nota > 10) {
            System.out.println("Esa nota no vale");
        }else {

            //Switch: funciona para lo mismo que if/else if/else. Le pones en los paréntesis el valor que quieres evaluar
            //y va viendo que case coincide con el valor, y el que coincida pos se mete dentro y ejecuta lo que haya.
            //Si hay dos cases que hacen lo mismo pos se agrupan y ya.
            switch(nota) {
                case 10:
                case 9:
                    System.out.println("Eso es un sobresaliente");
                    break;
                case 8:
                case 7:
                    System.out.println("Eso es un notable");
                    break;
                case 6:
                    System.out.println("Eso es un bien");
                    break;
                case 5:
                    System.out.println("Eso es un suficiente");
                    break;
                default:
                    System.out.println("Eso es un suspenso");
            }
     
        }
            
}

}

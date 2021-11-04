package clases;

public class Enumerados {

	/*
     * Un enumerado es una estructura para declarar datos fijos. Por ejemplo: si al registrarte en un sitio te piden el sexo
     * pues hay dos opciones: Varon o Mujer. Pues declaramos un enumerado que tenga esos dos valores. Se declaran
     * con la palabra reservada enum, luego el nombre del enumerado y entre llaves los valores en mayusculas (convencion)
     * y separados por comas. Los enumerados, al igual que otras cosas que ya veremos, no se pueden declarar dentro del
     * método main
     */
    enum Sexos { VARON, MUJER, HERMAFRODITA }


    public static void main(String[] args) {

        //Para acceder a los valores de un enumerado usamos el punto, y elegimos la opción que queramos
        System.out.println(Sexos.HERMAFRODITA);

    }
}

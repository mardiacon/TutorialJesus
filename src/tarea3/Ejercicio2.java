package tarea3;

import java.util.Random;

import libtarea3.Dado;

public class Ejercicio2 {

	public static void main(String[] args) {

		System.out.println("LANZANDO LOS DADOS");
		System.out.println("------------------");
		System.out.println();

		System.out.println("1.-CONSULTA INICIAL DE VALORES GLOBALES");
		System.out.println("---------------------------------------");
		System.out.println();

		System.out.println("Número total de dados creados hasta el momento: " + Dado.getNumeroDadosCreados());
		System.out.println("Número total de lanzamientos llevados a cabo hasta el momento: " + Dado.getNumeroLanzamientosGlobal());
		System.out.println("Número de veces que se ha obtenido 1: " + Dado.getNumeroVecesCaraGlobal(1));
		System.out.println("Número de veces que se ha obtenido 2: " + Dado.getNumeroVecesCaraGlobal(2));
		System.out.println("Número de veces que se ha obtenido 3: " + Dado.getNumeroVecesCaraGlobal(3));
		System.out.println("Número de veces que se ha obtenido 4: " + Dado.getNumeroVecesCaraGlobal(4));

		System.out.println();
		System.out.println("2.-CREACIÓN Y LANZAMIENTO DE DADOS");
		System.out.println("----------------------------------");
		System.out.println();

		Random random = new Random();

		for (int contador = 1; contador <= 10; contador++) {
			int numeroCaras = random.nextInt(9);
			System.out.print("Intento " + contador + " : " + "Intentando crear dado aleatorio de " + numeroCaras + " caras. ");
			try {
				Dado dado = new Dado(numeroCaras);
				System.out.println("Correcto. Creado dado de " + numeroCaras + " caras.");
				for(int lanzamiento = 1; lanzamiento <= numeroCaras; lanzamiento++) {
					dado.lanzar();
				}
				System.out.println("Lo lanzamos " + numeroCaras + " veces: " + dado.getSerieHistoricaLanzamientos());
				System.out.println("Suma total de los lanzamientos del dado: " + dado.getSumaPuntuacionHistorica());
			}catch(IllegalArgumentException excepcion) {
				System.out.println("Error. Número de caras no válido: " + numeroCaras);
			}
		}
		
		System.out.println();
		System.out.println("3.-ANÁLISIS DE RESULTADOS FINALES");
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Número total de dados creados hasta el momento: " + Dado.getNumeroDadosCreados());
		System.out.println("Número total de lanzamientos llevados a cabo hasta el momento: " + Dado.getNumeroLanzamientosGlobal());
		System.out.println("Número de veces que se ha obtenido 1 entre todos los lanzamientos de todos los dados: " + Dado.getNumeroVecesCaraGlobal(1));
		System.out.println("Número de veces que se ha obtenido 2 entre todos los lanzamientos de todos los dados: " + Dado.getNumeroVecesCaraGlobal(2));
		System.out.println("Número de veces que se ha obtenido 3 entre todos los lanzamientos de todos los dados: " + Dado.getNumeroVecesCaraGlobal(3));
		System.out.println("Número de veces que se ha obtenido 4 entre todos los lanzamientos de todos los dados: " + Dado.getNumeroVecesCaraGlobal(4));

	}
}
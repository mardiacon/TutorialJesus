package tarea4;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Integer[] bolas = {1,2,5,10,11,12,14,15,22,55,56,57,59,60,61,66,78,89,90};
		
		Integer[][] carton = {{1,2,5,9},{11,15},{22,29},{34},{47,49},{55,59,60},{61},{71,15},{88,90}};
		
		String[] resultados = new String[carton.length];
		
		System.out.println(Arrays.deepToString(carton));
		
		System.out.println(Arrays.toString(bolas));
		
		int numeroLineas = 0;
		for(int i = 0; i < carton.length; i ++) {
			Integer[] fila = carton[i];
			Boolean esLinea = true;
			for(int j = 0; j < fila.length; j++) {
				Integer columna = fila[j];
				Boolean haSalido = Arrays.asList(bolas).contains(columna);
				if(!haSalido) {
					esLinea = false;
				}
			}
			if(esLinea) {
				resultados[i] = "línea";
				numeroLineas++;
			}else {
				resultados[i] = "no";
			}
		}
		
		System.out.println(Arrays.toString(resultados));
		System.out.println("Han salido "+numeroLineas+" líneas.");
	}
}

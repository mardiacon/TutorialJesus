package prueba;

public class Prueba1 {
	public static void main(String[] args) {
        // TODO code application logic here
        int array1[][] = {{1, 2, 3}, {4, 5, 6}, {7}, {8, 9}, {10, 11, 12, 13}};
        int array3[][] = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Los asientos libres de la sala 1 son:");
        mostrarArrayPorCol(array1);
        System.out.println("\nLos asientos libres de la sala 3 son:");
        mostrarArrayPorCol(array3);
    }

    private static void mostrarArrayPorCol(int[][] array) {
        final int COL[] = new int[array.length];
        for (int row = 0; row < array.length; row++) {
            COL[row] = array[row].length;
        }

        for (int col = 0; col < COL.length; col++) {

            for (int row = 0; row < array.length; row++) {
                try {
                    System.out.printf("%d ", array[row][col]);
                } catch (ArrayIndexOutOfBoundsException excepcion) {
                }
            }
            System.out.println();
        }
    }
}



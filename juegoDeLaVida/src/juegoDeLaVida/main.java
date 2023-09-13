package juegoDeLaVida;

public class main {

	public static void main(String[] args) {
		int[][] matriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int fila = 1; // Fila de la coordenada
	        int columna = 1; // Columna de la coordenada

	        int rango = 1; // Rango para buscar alrededor (por ejemplo, rango 1 busca valores inmediatamente adyacentes)

	        System.out.println("Coordenadas seleccionadas: Fila " + fila + ", Columna " + columna);
	        System.out.println("Valores alrededor:");

	        for (int i = fila - rango; i <= fila + rango; i++) {
	            for (int j = columna - rango; j <= columna + rango; j++) {
	                // Excluir la coordenada introducida
	                if (i != fila || j != columna) {
	                    // Verificar si la coordenada está dentro de los límites de la matriz
	                    if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length) {
	                        int valor = matriz[i][j];
	                        System.out.println("Valor en la fila " + i + ", columna " + j + ": " + valor);
	                    }
	                }
	            }
	        }

	}

}

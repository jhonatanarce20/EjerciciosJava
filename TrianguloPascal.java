package ChatGPT;

/*
Ejercicio 1: Triángulo de Pascal. Escribe un programa que solicite al usuario un número entero positivo
y genere el triángulo de Pascal correspondiente. El triángulo de Pascal es un triángulo numérico en el que
cada número es la suma de los dos números directamente encima de él. El programa debe imprimir el triángulo
de Pascal hasta el número de filas especificado por el usuario. Por ejemplo, si el usuario ingresa 5, el
programa debe imprimir lo siguiente:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

*/

import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas del triángulo de Pascal: ");
        int numRows = scanner.nextInt();

        //Creando matriz para almacenar el triángulo de pascal
        int[][] triangle = new int[numRows][numRows];

        // Calcular los valores del triángulo de Pascal
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                // El primer y último elemento de cada fila es siempre 1
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    // Aquí se suman los valores de la fila superior
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
            }
        }

        //Se imprime el triángulo
        System.out.println("Triángulo de Pascal:");
        for (int i = 0; i < numRows; i++) {
            // Agregar espacios en blanco para alinear los elementos
            for (int k = 0; k < numRows - i - 1; k++) {
                System.out.print(" ");
            }
            // Imprimir los elementos de la fila actual
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

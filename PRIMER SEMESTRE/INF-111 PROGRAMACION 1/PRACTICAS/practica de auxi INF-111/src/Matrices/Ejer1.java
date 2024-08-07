package Matrices;
import java.util.Scanner;
public class Ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();
        int[][] matriz = Matriz(n);
        Mostrar(matriz);
    }

    public static int[][] Matriz(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 1;
                }
            }
        }

        return matriz;
    }

    public static void Mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

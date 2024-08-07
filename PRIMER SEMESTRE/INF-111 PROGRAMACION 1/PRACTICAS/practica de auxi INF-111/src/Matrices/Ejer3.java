package Matrices;	
import java.util.Scanner;
public class Ejer3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("intro palabra: ");
        String input = sc.next();
        createMatrix(input);
    }
    public static void createMatrix(String input) {
        int length = input.length();
        char[][] matrix = new char[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = '-';
            }
        }
        for (int i = 0; i < length; i++) {
            matrix[i][i] = input.charAt(i);
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

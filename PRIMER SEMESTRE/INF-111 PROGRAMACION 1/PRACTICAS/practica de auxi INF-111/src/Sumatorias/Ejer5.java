package Sumatorias;
import java.util.Scanner;
public class Ejer5 {

	public static void main(String[] args) {
        int[] secuencia = new int[10];
        secuencia[0] = 0;
        secuencia[1] = 1;
        secuencia[2] = 1;
        
        for (int i = 3; i < 10; i++) {
            secuencia[i] = secuencia[i-1] + secuencia[i-2] + secuencia[i-3];
        }
        
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += secuencia[i];
        }
        
        System.out.println("La suma de la secuencia es: " + suma);
    }
}




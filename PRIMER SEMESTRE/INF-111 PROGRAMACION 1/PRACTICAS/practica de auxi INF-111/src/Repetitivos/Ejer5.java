package Repetitivos;
import java.util.Scanner;
/*Entrada:n
//Salida:
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
*/public class Ejer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un numero: ");
		int num = sc.nextInt();
		int cont = 1;
		for(int i=0; i< num; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(cont+" ");
				cont++;
			}
			System.out.println();
		}
			
	}

}

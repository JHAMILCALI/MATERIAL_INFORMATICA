package Repetitivos;
import java.util.Scanner;//Entrada:6
public class Ejer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero = sc.nextInt();
		for (int i=1;i<=numero;i++) 
		{
			System.out.print(i);
		}
		System.out.println();
		for (int i=2;i<=numero;i++)
		{
			for(int j=i;j<=numero;j++)
			{
			System.out.print(j);
			}
		System.out.println();
		}
		for (int i=numero-1;i>=1;i--)
		{
			for(int j=numero;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}



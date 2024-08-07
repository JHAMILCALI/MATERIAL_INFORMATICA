package Condicionales;

import java.util.Scanner;
/*paractica #5
Escribe un programa que pida al usuario un número entero y determine si es
múltiplo de 3 y/o de 5. Imprime "Es múltiplo de 3", "Es múltiplo de 5" o "No
es múltiplo de 3 ni de 5" según corresponda.
*/public class Ejer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		int numero = sc.nextInt();
		double mult3 = numero%3;
		double mult5 = numero%5;
		if (mult3==0)
		{
			System.out.println("el numero es mutiplo de 3");
		}
		else if(mult5==0)
		{
			System.out.println("el numero es multiplo de 5");
		}
		else
		{
			System.out.println("El numero no es multiplo de 3 y 5");
		}
	}

}

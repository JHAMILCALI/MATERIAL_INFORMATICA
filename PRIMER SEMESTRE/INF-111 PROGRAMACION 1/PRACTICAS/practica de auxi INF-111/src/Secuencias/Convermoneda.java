package Secuencias;

import java.util.Scanner;

public class Convermoneda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de dolares: ");
		double dolares = sc.nextDouble();
		double euros = dolares*0.83;
		System.out.println(dolares+" dolares son "+euros+" euros");
	}

}

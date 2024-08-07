package Secuencias;
import java.util.Scanner;
//ejercicio #7
//Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
public class Conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor en Fahrenheit: ");
		double fah = sc.nextDouble();
		double cel = (fah-32)*5/9;
		System.out.printf("la conversion de le los grados "+fah
				+" a grados celcius %.2f",cel);	
	}

}

package Condicionales;
import java.util.Scanner;
//ejecio#7
//Escribe un programa que solicite al usuario ingresar su edad. Si el usuario tiene
//entre 18 y 25 años (ambos inclusive), el programa deberá imprimir en pantalla
//el mensaje "¡Felicidades! Eres elegible para nuestra oferta especial para
//jóvenes". Si el usuario tiene más de 25 años, el programa deberá imprimir en
//pantalla el mensaje "¡Gracias por tu interés en nuestra oferta especial para
//jóvenes, pero esta oferta es solo para personas entre 18 y 25 años!".
public class Ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		if (edad>=18 && edad<=25)
		{
			System.out.println("¡Felicidades! Eres elegible para nuestra oferta especial parajovenes");
		}
		else if(edad>25)
		{
			System.out.println("¡Gracias por tu interés en nuestra oferta especial para jovenes, "
					+ "pero esta oferta es solo para personas entre 18 y 25 años!");
		}

	}

}

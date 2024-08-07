package Condicionales;
//paractica #3
//Escribe un programa que pida al usuario su peso en kilogramos y su altura en
//metros, y calcule su Índice de Masa Corporal (IMC) utilizando la siguiente
//fórmula: IMC = peso / altura^2
import java.util.Scanner;
public class Ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu peso en kilogramos: ");
		float peso = sc.nextFloat();
		System.out.print("Introduce su altura en metros: ");
		float altura = sc.nextFloat();
		float imc = peso/(altura*altura);
		System.out.printf("El IMC es: %.1f ",imc);
		
		if(imc<18.5)
		{
			System.out.println("Tienes bajo pes");
		}
		else if(imc<24.9)
		{
			System.out.println("Tienes un peso normal");
		}
		else if (imc==29.9)
		{
			System.out.println("Tienes sobrespeso");
		}
		else if (imc>30)
		{
			System.out.println("Tienes Obecidad");
		}
	}

}

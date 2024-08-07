package Secuencias;
import java.util.Scanner;
public class Tiempo_de_viaje {
//ejercicio 2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el radio: ");
		double radio = sc.nextDouble();
		double area = 3.14*Math.pow(radio, 2);
		double circun = 2*3.14*radio;
		System.out.println("el area es:"+area);
		System.out.printf("La circunferencia del circulo es: %.2f ",circun);
		

	}

}

package Secuencias;
import java.util.Scanner;
public class Tiempoarchivo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el etamaño edel archivo en MB: ");
		double arMB = sc.nextDouble();
		System.out.println("Ingrese la velocida de descarga en MB: ");
		double velMB = sc.nextDouble();
		double timseg = arMB / velMB;
		double minutos = timseg /60;
		System.out.printf("El tiempo de descarga en minutos es: %.2f "
				+ "\nEl tamaño del archivo es: %.2f",minutos,timseg);
	}

}

package Repetitivos;
import java.util.Scanner;
public class Ejer3 {
	public static void main(String[] args) {
		int num, i=1, fac=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		num=sc.nextInt();
		while (num<=0) {
			System.out.print("Ingrese un numero:");
			num=sc.nextInt();
		}
		while (i<num+1) {
			fac=fac*i;
			i++;
		}
		System.out.println(fac);
	}
}

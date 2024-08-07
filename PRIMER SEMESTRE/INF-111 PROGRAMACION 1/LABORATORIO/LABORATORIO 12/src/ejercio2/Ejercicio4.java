package ejercio2;
//llenar una matriz a(n, m) com se muestra
import java.util.Scanner;
public class Ejercicio4 {
	static public int amqjc[][]=new int [10][10];
	static void llenar1(int nmqjc, int mmqjc)
	{	int imqjc,jmqjc,cmqjc=1;
		for (imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for (jmqjc=1;jmqjc<=mmqjc;jmqjc++)
			{	amqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;			
			}
		}
	}
	static void mostrarm(int nmqjc, int mmqjc)
	{	int imqjc,jmqjc;
		System.out.println("\n");
		for(imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for (jmqjc=1;jmqjc<=mmqjc;jmqjc++)
			{	System.out.print("\t"+amqjc[imqjc][jmqjc]);			
			}
			System.out.println("\n");
		}
	}
	public static void main (String[] args) {
		int nmqjc,mmqjc;
		Scanner sc = new Scanner(System.in);
		System.out.println("intro n y m ");
		nmqjc=sc.nextInt();
		mmqjc=sc.nextInt();
		llenar1(nmqjc,mmqjc);
		mostrarm(nmqjc,mmqjc);		
	}
}

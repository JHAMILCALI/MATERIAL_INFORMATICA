package ejercio2;
//vaciar ek mayor de cada fila de in amatriz 
//a(n, m) en un vector b(n)
//se imprime en forma lineal
import java.util.Scanner;
public class Ejercicio3 {
	static public int amqjc[][]= new int[10][10];
	static public int bmqjc[]  = new int[10];
	static void llenarm(int nmqjc, int mmqjc)
	{	int imqjc,jmqjc;
	 	Scanner sc = new Scanner(System.in);
	 	for (imqjc=1;imqjc<=nmqjc;imqjc++)
	 	{	for (jmqjc=1;jmqjc<=mmqjc;jmqjc++)
	 		{	System.out.println("a["+imqjc+"]["+jmqjc+"]=");
	 			amqjc[imqjc][jmqjc]=sc.nextInt();
	 		}
	 	}
	}
	static void mostrarm(int nmqjc, int mmqjc)
	{	int imqjc,jmqjc;
		System.out.println("\n");
		for (imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for (jmqjc=1;jmqjc<=mmqjc;jmqjc++)
			{	System.out.print("\t"+amqjc[imqjc][jmqjc]);
			
			}
			System.out.println("\n");
		}
	}
	static void mostrarv(int tmqjc)
	{	int imqjc;
		System.out.println("\n");
		for (imqjc=1;imqjc<=tmqjc;imqjc++)
		{	System.out.print("\t"+bmqjc[imqjc]);	
		}
	}
	static void vaciar(int nmqjc, int mmqjc)
	{	int maymqjc=0, imqjc, jmqjc;
		for (imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for (jmqjc=1;jmqjc<=mmqjc;jmqjc++)
			{	if (amqjc[imqjc][jmqjc]>maymqjc) maymqjc = amqjc[imqjc][jmqjc];
			}
			bmqjc[imqjc]=maymqjc;	maymqjc=0; 
		}
	}
	public static void main(String[] args) {
		int nmqjc,mmqjc;
		Scanner sc = new Scanner(System.in);
		System.out.println("intro n y m");
		nmqjc=sc.nextInt();
		mmqjc=sc.nextInt();
		llenarm(nmqjc,mmqjc);
		vaciar(nmqjc,mmqjc);
		mostrarm(nmqjc,mmqjc);
		mostrarv(nmqjc);
		
	}
}
		

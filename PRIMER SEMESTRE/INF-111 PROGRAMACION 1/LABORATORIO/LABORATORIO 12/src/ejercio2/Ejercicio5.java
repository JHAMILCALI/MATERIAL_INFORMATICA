package ejercio2;
//dada una matriz cuadrada a(n, n)
//intercambiar la trinagular superior por la inferior
//sobre la diagonal secundaria
//se imprime en forma vertical los numeros
import java.util.Scanner;
public class Ejercicio5 {
	static public int amqjc[][]=new int [10][10];
	static void llenarm(int nmqjc)
	{	int imqjc,jmqjc;
		Scanner sc=new Scanner (System.in);
		for (imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for (jmqjc=1;jmqjc<=nmqjc;jmqjc++)
			{	System.out.println("a["+imqjc+"]["+jmqjc+"]=");
				amqjc[imqjc][jmqjc]=sc.nextInt();
			}
		}
	}
	static void mostrarm(int nmqjc)
	{	int imqjc,jmqjc;
		System.out.println("\n");
		for (imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for (jmqjc=1;jmqjc<=nmqjc;jmqjc++)
			{	System.out.print("\t"+amqjc[imqjc][jmqjc]);	
			}
			System.out.println("\n");
		}
	}
	static void intertds(int nmqjc)
	{ 	int n1mqjc,i1mqjc,j1mqjc,xmqjc,imqjc,jmqjc;
		n1mqjc=nmqjc; i1mqjc=nmqjc; j1mqjc=nmqjc;
		for (imqjc=1;imqjc<=nmqjc-1;imqjc++)
		{	for (jmqjc=1;jmqjc<=n1mqjc-1;jmqjc++)
			{	xmqjc=amqjc[imqjc][jmqjc];	amqjc[imqjc][jmqjc]=amqjc[i1mqjc][j1mqjc];
				amqjc[i1mqjc][j1mqjc]=xmqjc;	i1mqjc=i1mqjc-1;
			}
			n1mqjc=n1mqjc-1; i1mqjc=nmqjc; j1mqjc=j1mqjc-1;
		}
	}
	public static void main (String[] args){
		int nmqjc;
		Scanner sc = new Scanner (System.in);
		System.out.println("intro n ");
		nmqjc=sc.nextInt();
		llenarm(nmqjc);
		mostrarm(nmqjc);
		intertds(nmqjc);
		mostrarm(nmqjc);	
	}

}

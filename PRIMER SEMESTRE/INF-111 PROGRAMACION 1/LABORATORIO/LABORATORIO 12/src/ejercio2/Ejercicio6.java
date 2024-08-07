package ejercio2;
//intro 5
import java.util.Scanner;
public class Ejercicio6 {
	static public int amqjc[][]=new int[10][10];
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
	static void eles(int nmqjc)
	{ 	int imqjc,jmqjc,kmqjc,cmqjc,k1mqjc;
		cmqjc=1; k1mqjc=1;
		for (kmqjc=nmqjc;kmqjc>=1;kmqjc--)
		{	jmqjc=kmqjc;
			for (imqjc=1;imqjc<=k1mqjc;imqjc++)
			{	amqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;
			
			}
			imqjc=k1mqjc;
			for (jmqjc=kmqjc+1;jmqjc<=nmqjc;jmqjc++)
			{	amqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;
			
			}
			k1mqjc=k1mqjc+1;
		}
	}
	public static void main(String[]args) {
		int nmqjc;
		Scanner sc = new Scanner (System.in);
		System.out.println("intro n");
		nmqjc=sc.nextInt();
		eles(nmqjc);
		mostrarm(nmqjc);
	}

}

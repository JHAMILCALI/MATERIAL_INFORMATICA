package ejercio2;
//llenar un amatriz a(n, m) busacar el menor
//se imprime en forma lineal
import java.util.Scanner;
public class Ejercicio2 {
	static public int amqjc[][]=new int[10][10];
	static public int pimqjc,pjmqjc;
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
		for(imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for(jmqjc=1;jmqjc<=mmqjc;jmqjc++)
			{	System.out.print("\t"+amqjc[imqjc][jmqjc]);
			
			}
			System.out.println("\n");
		}
	}
	static void menor(int nmqjc,int mmqjc)
	{	int imqjc,jmqjc,menmqjc=9999;
		for (imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for (jmqjc=1;jmqjc<=mmqjc;jmqjc++)
			{	if(amqjc[imqjc][jmqjc]<menmqjc)
				{	menmqjc=amqjc[imqjc][jmqjc]; pimqjc=imqjc; pjmqjc=jmqjc;
				
				}
			}
		}
	}
	public static void main(String[]args) {
		int nmqjc,mmqjc;
		Scanner sc =new Scanner(System.in);
		System.out.println("intro n y m");
		nmqjc=sc.nextInt();
		mmqjc=sc.nextInt();
		llenarm(nmqjc,mmqjc);
		mostrarm(nmqjc,mmqjc);
		menor(nmqjc,mmqjc);
		System.out.println("menor="+amqjc[pimqjc][pjmqjc]);
		
	}
}

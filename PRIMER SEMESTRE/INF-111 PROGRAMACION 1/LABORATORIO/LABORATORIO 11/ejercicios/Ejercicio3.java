package ejercicios;
//Dado un vector a(n), llenar con los elemento enteros, 
//rotar los elementos fibo a la izquiereda, usando el mismo vector
import java.util.Scanner;
public class Ejercicio3 {
	static public int amqjc[]= new int[20];
	static public void llenarv(int tmqjc)
	{	int imqjc;
		Scanner sc = new Scanner(System.in);
		for (imqjc=1;imqjc<=tmqjc;imqjc++)
		{
			System.out.println(" a["+imqjc+"]=");
			amqjc[imqjc]=sc.nextInt();
		}
	}
	static public void mostrarv(int tmqjc)
	{	int imqjc;
		System.out.println("");
		for (imqjc=1;imqjc<=tmqjc;imqjc++)
		{
			System.out.print(" "+ amqjc[imqjc]);
		}
	}
	static public int esfibo(int wmqjc)
	{	int amqjc=-1,bmqjc=1,kmqjc=0, dmqjc=0;
		while (dmqjc<wmqjc)
		{	dmqjc=amqjc+bmqjc;
			amqjc=bmqjc; bmqjc=dmqjc;
		}
		if (dmqjc==wmqjc) kmqjc=1;
		return kmqjc;
	}
	public static void main (String[] args)
	{	int nmqjc,kmqjc,imqjc,xmqjc,ymqjc,pmqjc;
		kmqjc=0; xmqjc=0; pmqjc=0;
		Scanner sc = new Scanner (System.in);
		do
		{	System.out.println("intro n");
			nmqjc=sc.nextInt();
		}while(nmqjc>20);
		llenarv(nmqjc);
		mostrarv(nmqjc);
		for (imqjc=nmqjc;imqjc>=1;imqjc--)
		{	if (esfibo(amqjc[imqjc])==1)
			{	if (kmqjc==0)
				{	xmqjc=amqjc[imqjc]; pmqjc=imqjc; kmqjc=1; }
				else
				{	ymqjc=amqjc[imqjc]; amqjc[imqjc]=xmqjc; xmqjc=ymqjc;}
			}
		}
		if(kmqjc==1) {	amqjc[pmqjc]=xmqjc;	}
		mostrarv(nmqjc);
	}

}
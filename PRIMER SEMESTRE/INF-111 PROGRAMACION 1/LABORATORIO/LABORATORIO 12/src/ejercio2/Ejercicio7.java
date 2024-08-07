package ejercio2;
//intro 5
import java.util.Scanner;
public class Ejercicio7 {
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
static void us (int nmqjc) 
{	int imqjc,jmqjc, kmqjc, lsmqjc,cmqjc=1;
	lsmqjc=nmqjc;
	for (kmqjc=1;kmqjc<=(nmqjc/2); kmqjc++)
	{	imqjc=kmqjc;
		for (jmqjc=1;jmqjc<=lsmqjc;jmqjc++)
		{	amqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;
		
		}
		jmqjc=lsmqjc;
		for (imqjc=kmqjc+1;imqjc<=lsmqjc;imqjc++)
		{	amqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;
		
		}
		imqjc=lsmqjc;
		for (jmqjc=lsmqjc-1;jmqjc>=1;jmqjc--)
		{	amqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;
		
		}
		lsmqjc=lsmqjc-1;
	}
	if (nmqjc%2==1)
	{	 imqjc=(nmqjc/2)+1;
		for (jmqjc=1;jmqjc<=(nmqjc/2)+1;jmqjc++)
		{	amqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;	}
	}
	
}
public static void main(String[] args) {
	int nmqjc;
	Scanner sc = new Scanner (System.in);
	System.out.println("intro n");
	nmqjc=sc.nextInt();
	us(nmqjc);
	mostrarm(nmqjc);
}
	
}



package ejercio2;
//1-Llenar una matriz a(n, m) con valores. numéricos, 
//encontrar el mayor elemento de la matriz, 
//mostrar en que fila y columna se encuentra este valor, 
//sumar las filas en un vector b(n)
//esta secuencia se imprime en forma lineal
import java.util.Scanner;
public class Ejercicio1 {
	static public int amqjc[][]=new int [10][10];
	static public int bmqjc[]  =new int [10];
	static public int pimqjc,pjmqjc;
	static void llenarm(int nmqjc, int mmqjc)
	{	int imqjc,jmqjc;
		Scanner sc = new Scanner(System.in);
		for(imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for(jmqjc=1;jmqjc<=mmqjc;jmqjc++)
		    {	System.out.println("a["+imqjc+"]["+jmqjc+"]=");
		    	amqjc[imqjc][jmqjc]=sc.nextInt();
		    }
		}
	}
	static void mostrarm(int nmqjc, int mmqjc)
	{	int imqjc,jmqjc;
		System.out.println("\n");
		for (imqjc=1;imqjc<=nmqjc;imqjc++)
		{	for(jmqjc=1;jmqjc<=mmqjc;jmqjc++)
			{	System.out.print("\t"+amqjc[imqjc][jmqjc]);
			}
			System.out.println("\n");
		}

	 }
	 static void mostrarv(int tmqjc)
	 { int imqjc;
	 	System.out.println("\n");
	 	for(imqjc=1;imqjc<=tmqjc;imqjc++)
	 	{	System.out.print("\t"+bmqjc[imqjc]);
	 	}
	 }
	 static void maysumar(int nmqjc, int mmqjc)
	 {	int maymqjc=0, smqjc=0, imqjc, jmqjc;
	 	for(imqjc=1;imqjc<=nmqjc;imqjc++)
	 	{	for(jmqjc=1;jmqjc<=mmqjc;jmqjc++)
	 	    {if (amqjc[imqjc][jmqjc]>maymqjc)
	 	    	{ maymqjc = amqjc[imqjc][jmqjc];
	 	    	  pimqjc=imqjc; pjmqjc=jmqjc;
	 	    	}
	 	       smqjc=smqjc+amqjc[imqjc][jmqjc];
	 	    }
	 	    bmqjc[imqjc]=smqjc; smqjc=0;
	 	}
	 }
	 	public static void main (String[]args) {
	 		int nmqjc,mmqjc;
	 		Scanner sc = new  Scanner(System.in);
	 		System.out.println("intro n y m ");
	 		nmqjc=sc.nextInt();
	 		mmqjc=sc.nextInt();
	 		llenarm(nmqjc,mmqjc);
	 		maysumar(nmqjc,mmqjc);
	 		mostrarm(nmqjc,mmqjc);
	 		System.out.println(" "+amqjc[pimqjc][pjmqjc]);
	 		mostrarv(nmqjc);	
	 }
}


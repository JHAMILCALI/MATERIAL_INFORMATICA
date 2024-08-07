package ejercicios;
//Dado un caector buscar un valor en el vector
//usando la buqueda binaria
import java.util.Scanner;
public class Ejercicio7 
{   static public int amqjc[]=new int [20];
    static public void llenarv(int tmqjc)
    { int imqjc;
     Scanner sc  = new Scanner (System.in);
     for (imqjc=1;imqjc<=tmqjc;imqjc++)
     { System.out.println(" a["+imqjc+"]=");
       amqjc[imqjc]=sc.nextInt();
     }
    }
    static void burbuja(int tmqjc)
    { int imqjc, jmqjc, xmqjc=0;
      for(imqjc=1;imqjc<tmqjc-1;imqjc++)
      {	for(jmqjc=imqjc+1;jmqjc<=tmqjc;jmqjc++)
        {	if (amqjc[imqjc]>amqjc[jmqjc])
           {	xmqjc=amqjc[jmqjc]; amqjc[jmqjc]=amqjc[imqjc]; amqjc[imqjc]=xmqjc;  
           }
        }
      }
    }
    static int busbin(int tmqjc, int xmqjc)
    { int lcmqjc,kmqjc=1,limqjc=1, lsmqjc=tmqjc;
      lcmqjc=(limqjc+lsmqjc)/2;
    while (xmqjc!=amqjc[lcmqjc] && limqjc<=lsmqjc)
    {	if (xmqjc>amqjc[lcmqjc]) {limqjc=lcmqjc+1;}
    	else {lsmqjc=lcmqjc-1; }
  		lcmqjc=(limqjc+lsmqjc)/2;
    }
    if(xmqjc==amqjc[lcmqjc]) {kmqjc=lcmqjc; }
    else {kmqjc=-1; }
    return kmqjc;
   }
   static public void mostrarv(int tmqjc)
   { int imqjc;
   	System.out.println("");
   	for(imqjc=1;imqjc<=tmqjc;imqjc++)
   	{
   		System.out.print(" "+ amqjc[imqjc]);
   	}
   }
   public static void main(String[] args)
   {int nmqjc,zmqjc;
   Scanner sc = new Scanner(System.in);
   do
   {	System.out.println("intro n");
   		nmqjc=sc.nextInt();
   }while (nmqjc>20);
   llenarv(nmqjc);
   mostrarv(nmqjc);
   System.out.println("\nintro elem a buscar " );
   zmqjc=sc.nextInt();
   if (busbin(nmqjc,zmqjc)!=-1)
   {System.out.println("\n"+zmqjc+" esta en posi "+busbin(nmqjc,zmqjc));}
   else
   { System.out.println(" \nno existe ");}
   }
}

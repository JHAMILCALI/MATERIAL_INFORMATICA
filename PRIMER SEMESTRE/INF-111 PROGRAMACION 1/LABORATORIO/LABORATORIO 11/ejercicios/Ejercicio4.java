package ejercicios;
//Ordenar un vector por metodo borbuja
import java.util.Scanner;
public class Ejercicio4 
{  static public int amqjc[] =new int[20];
   static public void llenarv(int tmqjc)
   {  int imqjc;
      Scanner sc = new Scanner(System.in);
      for(imqjc=1;imqjc<=tmqjc;imqjc++)
      { System.out.println("a["+imqjc+"]=");
        amqjc[imqjc]=sc.nextInt();
      }  	  
   }
   static public void mostrarv(int tmqjc)
   {  int imqjc;
      System.out.println("");
      for(imqjc=1;imqjc<=tmqjc;imqjc++)
      {
    	  System.out.print(" "+ amqjc[imqjc]);
      }
   }
   static void burbuja(int tmqjc)
   { int imqjc, jmqjc, xmqjc=0;
     for(imqjc=1;imqjc<=tmqjc-1;imqjc++)
     {   for(jmqjc=imqjc+1;jmqjc<=tmqjc;jmqjc++)
         {  if(amqjc[imqjc]>amqjc[jmqjc])
            {  xmqjc=amqjc[jmqjc]; amqjc[jmqjc]=amqjc[imqjc]; amqjc[imqjc]=xmqjc;
            }
         }
     }
   }
   public static void main(String[]args)
   {
	   int nmqjc;
	   Scanner sc = new Scanner(System.in);
	   do
	   {  System.out.println("intro n");
	      nmqjc=sc.nextInt();
	   }while(nmqjc>20);
	   llenarv(nmqjc);
	   mostrarv(nmqjc);
	   burbuja(nmqjc);
	   mostrarv(nmqjc);
   }

}

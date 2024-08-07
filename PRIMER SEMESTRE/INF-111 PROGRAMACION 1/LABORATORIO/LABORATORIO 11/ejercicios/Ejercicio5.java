package ejercicios;
//Ordenar un vector por metodo de la sacudida
import java.util.Scanner;
public class Ejercicio5 
{   static public int amqjc[]=new int[20];
    static public void llenarv(int tmqjc)
    {  int imqjc;
      Scanner sc = new Scanner(System.in);
      for(imqjc=1;imqjc<=tmqjc;imqjc++)
      {System.out.println("a["+imqjc+"]=");
       amqjc[imqjc]=sc.nextInt();
      }
    }
    static public void mostrarv(int tmqjc)
    { int imqjc;
     System.out.println("");
     for(imqjc=1;imqjc<=tmqjc;imqjc++)
     {
    	 System.out.print(" "+ amqjc[imqjc]);
     }
    }
    static void sacudida(int tmqjc)
    { int imqjc, xmqjc=0,swmqjc=1,limqjc=1,lsmqjc=tmqjc,kmqjc=0;
      while(swmqjc!=0)
      { swmqjc=0;
        if(kmqjc==0)
        {for(imqjc=limqjc;imqjc<=lsmqjc-1;imqjc++)
          { if(amqjc[imqjc]>amqjc[imqjc+1])
            { xmqjc=amqjc[imqjc]; amqjc[imqjc]=amqjc[imqjc+1];amqjc[imqjc+1]=xmqjc; swmqjc=1;
            }
          }
          lsmqjc=lsmqjc-1;kmqjc=1;
        }
        else
        { for(imqjc=lsmqjc;imqjc>=limqjc+1;imqjc--)
          { if(amqjc[imqjc]<amqjc[imqjc-1])
            { xmqjc=amqjc[imqjc]; amqjc[imqjc]=amqjc[imqjc-1];amqjc[imqjc-1]=xmqjc; swmqjc=1;
            
            }
          }
          limqjc=limqjc+1;kmqjc=0;
        }
      }
    }
    public static void main(String[]args)
    {
    	int nmqjc;
    	Scanner sc = new Scanner(System.in);
    	do
    	{    System.out.println("intro n");
    	     nmqjc=sc.nextInt();
    	}while(nmqjc>20);
    	llenarv(nmqjc);
    	mostrarv(nmqjc);
    	sacudida(nmqjc);
    	mostrarv(nmqjc);
    	
    }
     

}

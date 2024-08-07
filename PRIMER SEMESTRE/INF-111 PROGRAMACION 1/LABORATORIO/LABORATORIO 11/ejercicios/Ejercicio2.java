package ejercicios;
import java.util.Scanner;
//Dado un vector a(n), rotar los valore impare a l aizquierda
public class Ejercicio2 {
     static public int amqjc[]= new int[20];
     static public void llenar(int tmqjc)
     {  int imqjc;
         Scanner sc = new Scanner(System.in);
         for(imqjc=1;imqjc<=tmqjc;imqjc++)
         {
        	 System.out.println("a["+imqjc+"]=");
        	 amqjc[imqjc]=sc.nextInt();
         }
	}
    static public void mostrarv(int tmqjc)
    {  int imqjc;
        System.out.println("");
        for(imqjc=1;imqjc<=tmqjc;imqjc++)
        {
        	System.out.print(" "+amqjc[imqjc]);
        }
    }
    static public void impar(int tmqjc)
    { int imqjc,xmqjc=0,pmqjc=0,kmqjc=0;
        for(imqjc=1;imqjc<=tmqjc;imqjc++)
        {   if(amqjc[imqjc]%2==1)
            {    if(kmqjc==0)
                 {  xmqjc=amqjc[imqjc]; pmqjc=imqjc; kmqjc=1;}
                 else
                 { amqjc[pmqjc]=amqjc[imqjc]; pmqjc=imqjc; }
            }
        }
        if(kmqjc==1) {amqjc[pmqjc]=xmqjc;}
    }
    public static void main(String[]arg)
    {    int nmqjc,kmqjc,imqjc,xmqjc,ymqjc,posmqjc;
         Scanner sc = new Scanner(System.in);
         do
         {   System.out.println("intro tam de vec");
             nmqjc=sc.nextInt();
         }while(nmqjc>20);
         llenar(nmqjc);
         mostrarv(nmqjc);
         impar(nmqjc);
         mostrarv(nmqjc);
    }
    
}

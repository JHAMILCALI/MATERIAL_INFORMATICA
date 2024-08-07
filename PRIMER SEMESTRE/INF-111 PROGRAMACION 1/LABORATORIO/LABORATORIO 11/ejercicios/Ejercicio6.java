package ejercicios;
//Dado un vector buscar un valor en el vector
//usando la busqueda secuencial
import java.util.Scanner;
public class Ejercicio6 
{   static public int amqjc[]= new int[20];
    static public void llenarv(int tmqjc)
    {  int imqjc;
      Scanner sc = new Scanner(System.in);
      for(imqjc=1;imqjc<=tmqjc;imqjc++)
      {  System.out.println("a{"+imqjc+"]=");
         amqjc[imqjc]=sc.nextInt();
      }
    }
    static int bussec(int tmqjc, int xmqjc)
    { int kmqjc=1;
      while (xmqjc!=amqjc[kmqjc] && kmqjc<=tmqjc)
      {  kmqjc=kmqjc+1;
      }
      if(xmqjc!=amqjc[kmqjc]) {kmqjc=-1; }
      return kmqjc;
    }
    static public void mostrarv(int tmqjc)
    { int imqjc;
      System.out.println(" ");
      for(imqjc=1;imqjc<=tmqjc;imqjc++)
      {
    	  System.out.println(" "+amqjc[imqjc]);
      }
    }
    public static void main(String[]args)
    {int nmqjc,zmqjc;
    Scanner sc = new Scanner(System.in);
    do
    {    System.out.println("intro n");
    	 nmqjc=sc.nextInt();
    }while(nmqjc>20);
    llenarv(nmqjc);
    mostrarv(nmqjc);
    System.out.println("\nintro elem a buscar ");
    zmqjc=sc.nextInt();
    if (bussec(nmqjc,zmqjc)!= -1)
    {System.out.println("\n "+zmqjc+" esta en posi "+bussec(nmqjc,zmqjc));}
    else
    {System.out.println("\nno existe ");}
    }

}

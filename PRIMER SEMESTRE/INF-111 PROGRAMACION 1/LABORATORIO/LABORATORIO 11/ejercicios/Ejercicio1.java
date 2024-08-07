package ejercicios;
//Rotar los valores pares a la derecha en un vector a(n)
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) 
	{ int nmqjc,kmqjc,imqjc,xmqjc,ymqjc,pmqjc;
	  kmqjc=0; xmqjc=0; pmqjc=0;
	  int amqjc[]=new int [20];
	  Scanner sc = new Scanner(System.in);
	  do
	  {  System.out.println("intro tam del vec");
	     nmqjc=sc.nextInt();
	  }while(nmqjc>20);
	  for(imqjc=1;imqjc<=nmqjc;imqjc++)
	  {  System.out.println("x["+imqjc+"]=");
	     amqjc[imqjc]=sc.nextInt();
	  }
      for(imqjc=1;imqjc<=nmqjc;imqjc++)
      {   if(amqjc[imqjc]%2==0)
          {    if(kmqjc==0)
               {  xmqjc=amqjc[imqjc]; pmqjc=imqjc; kmqjc=1;}
               else
               {  ymqjc=amqjc[imqjc];amqjc[imqjc]=xmqjc; xmqjc=ymqjc; }
          }     
      }
      if(kmqjc==1) {amqjc[pmqjc]=xmqjc;}
      System.out.println("");
      for(imqjc=1;imqjc<=nmqjc;imqjc++)
      {   System.out.print(" "+amqjc[imqjc]);
	  }
	}
}
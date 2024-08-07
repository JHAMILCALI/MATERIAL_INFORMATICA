package ejercicios;
//Dada una cadena almacenar palabra por
//palabra, invertir  las palabras del vector
import java.util.Scanner;
public class Ejercicio8 {
	static public String amqjc[]= new String[20];
	static public void mostrarv(int tmqjc)
	{	int imqjc;
		System.out.println("");
		for(imqjc=1;imqjc<=tmqjc;imqjc++)
		{
			System.out.print(" "+ amqjc[imqjc]);
		}
	}
	static int contarpal(String wmqjc)
	{	int cpmqjc=0,lonmqjc,imqjc;		String ymqjc;		wmqjc=wmqjc+" ";
		lonmqjc=wmqjc.length();
		for(imqjc=1;imqjc<=lonmqjc;imqjc++)
		{	ymqjc = wmqjc.substring(imqjc-1,imqjc);
			if(ymqjc.compareTo(" ")==0)	{ cpmqjc=cpmqjc+1; }
		}
		return cpmqjc;
	}
	static String sacarpal(String wmqjc,int kmqjc)
	{	int cpmqjc=0,lonmqjc,imqjc;		String ymqjc,vmqjc="",zmqjc="";  wmqjc=wmqjc+" ";
		lonmqjc=wmqjc.length();
		for(imqjc=1;imqjc<=lonmqjc;imqjc++)
		{	ymqjc = wmqjc.substring(imqjc-1,imqjc);
			if(ymqjc.compareTo(" ")==0)
			{	cpmqjc=cpmqjc+1;
				if(cpmqjc==kmqjc) {  zmqjc=vmqjc;}
				vmqjc="";
			}
			else
			{	vmqjc=vmqjc+ymqjc;}
		}
		return zmqjc;
    }
	static String invertir(String wmqjc)
	{ int imqjc,elemqjc;
	  String vmqjc,ymqjc; vmqjc="";
	  elemqjc=wmqjc.length();
	  for(imqjc=1;imqjc<=elemqjc;imqjc++)
	  { ymqjc = wmqjc.substring(imqjc-1,imqjc);
	  	vmqjc = ymqjc + vmqjc;  }
	  return vmqjc;
	}
	public static void main(String[]args) {
		int cpmqjc,imqjc;
		String bmqjc;
		Scanner sc=new Scanner(System.in);
		System.out.println("intro una cadena");
		bmqjc = sc.nextLine();
		cpmqjc= contarpal(bmqjc);
		for(imqjc=1;imqjc<=cpmqjc;imqjc++)
		{	amqjc[imqjc]=sacarpal(bmqjc,imqjc);		
		}
		mostrarv(cpmqjc);
		for (imqjc=1;imqjc<=cpmqjc;imqjc++)
		{	amqjc[imqjc]=invertir(amqjc[imqjc]);
		}
		mostrarv(cpmqjc);
	}
}

package laboratorioPOO2;

import java.util.Scanner;
//compara el año de dos objetos Auto. Usar
//diferentes contructores. Intancia 4 objetos de distinta forma.
public class Auto {
private
	String placamqjc;	
	String marcamqjc;
	int añomqjc;
	String tipomqjc;
public 
	Auto() //contructor por defecto
	{	placamqjc = "USB-123";
		marcamqjc = "Toyota";
		añomqjc = 2015;
		tipomqjc = "Vagoneta";
	}
	Auto(String amqjc, String bmqjc, int cmqjc, String dmqjc)
	// constructor con argumentos
	{	placamqjc = amqjc;
		marcamqjc = bmqjc;
		añomqjc = cmqjc;
		tipomqjc =dmqjc;
	}
	Auto(int amqjc, String bmqjc, String cmqjc, String dmqjc)
	{	placamqjc = bmqjc;
		marcamqjc = cmqjc;
		añomqjc = amqjc;
		tipomqjc =dmqjc;
	}
	Auto(String amqjc, int bmqjc, String cmqjc, String dmqjc)
	{	placamqjc = amqjc;
		marcamqjc = cmqjc;
		añomqjc = bmqjc;
		tipomqjc = dmqjc;
	}
	Auto(String amqjc, String bmqjc, int cmqjc)
	{	placamqjc = amqjc;
		marcamqjc = bmqjc;
		añomqjc = 2021;
		tipomqjc ="Automovil";
	}
	Auto(String amqjc, String bmqjc)
	{	placamqjc = amqjc;
		marcamqjc = bmqjc;
		añomqjc = 2021;
		tipomqjc = "Camioneta";
	}
	Auto(String amqjc)
	{	placamqjc = amqjc;
		marcamqjc = "VW";
		añomqjc = 2021;
		tipomqjc ="Camioneta";
	}
	Auto(int amqjc)
	{	placamqjc = "ABC-321";
		marcamqjc = "Suszuki";
		añomqjc = amqjc;
		tipomqjc ="Jeep";
	}
	Auto(String amqjc, int bmqjc)
	{	placamqjc = amqjc;
		marcamqjc = "Nissan";
		añomqjc = bmqjc;
		tipomqjc ="Camioneta";
	}
	void mismoaño(Auto Amqjc)
	{if(añomqjc==Amqjc.obta()) {
		System.out.println("Tiene el mismo año");
		}
	else {
		System.out.println("Tiene distinto año");
		}
	}
	String obtp()
	{	return(placamqjc);}
	String obtm()
	{	return(marcamqjc);}
	int obta()
	{	return(añomqjc);}
	String obtt()
	{	return(tipomqjc);}
	void ponm(String a)
	{	this.marcamqjc=a;}
	void leer()
	{	Scanner sc = new Scanner(System.in);
		System.out.println("intro placa");
		placamqjc=sc.next();
		System.out.println("intro marca");
		marcamqjc=sc.next();
		System.out.println("intro año");
		añomqjc=sc.nextInt();
		System.out.println("intro tipo");
		tipomqjc=sc.next();		
	}
	void mostrar()
	{System.out.println(" "+placamqjc+" "+marcamqjc+" "+añomqjc+" "+tipomqjc);}
}

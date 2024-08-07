package laboratorioPOO2;

import java.util.Scanner;

public class Auto {
private
	String placa;	
	String marca;
	int año;
	String tipo;
public 
	Auto() //contructor por defecto
	{	placa = "USB-123";
		marca = "Toyota";
		año = 2015;
		tipo = "Vagoneta";
	}
	Auto(String a, String b, int c, String d)
	// constructor con argumentos
	{	placa = a;
		marca = b;
		año = c;
		tipo =d;
	}
	Auto(int a, String b, String c, String d)
	{	placa = b;
		marca = c;
		año = a;
		tipo =d;
	}
	Auto(String a, int b, String c, String d)
	{	placa = a;
		marca = c;
		año = b;
		tipo = d;
	}
	Auto(String a, String b, int c)
	{	placa = a;
		marca = b;
		año = 2021;
		tipo ="Automovil";
	}
	Auto(String a, String b)
	{	placa = a;
		marca = b;
		año = 2021;
		tipo = "Camioneta";
	}
	Auto(String a)
	{	placa = a;
		marca = "VW";
		año = 2021;
		tipo ="Camioneta";
	}
	Auto(int a)
	{	placa = "ABC-321";
		marca = "Suszuki";
		año = a;
		tipo ="Jeep";
	}
	Auto(String a, int b)
	{	placa = a;
		marca = "Nissan";
		año = b;
		tipo ="Camioneta";
	}
	void mismoaño(Auto A)
	{if(año==A.obta()) {
		System.out.println("Tiene el mismo año");
		}
	else {
		System.out.println("Tiene distinto año");
		}
	}
	String obtp()
	{	return(placa);}
	String obtm()
	{	return(marca);}
	int obta()
	{	return(año);}
	String obtt()
	{	return(tipo);}
	void ponm(String a)
	{	this.marca=a;}
	void leer()
	{	Scanner sc = new Scanner(System.in);
		System.out.println("intro placa");
		placa=sc.next();
		System.out.println("intro marca");
		marca=sc.next();
		System.out.println("intro año");
		año=sc.nextInt();
		System.out.println("intro tipo");
		tipo=sc.next();		
	}
	void mostrar()
	{System.out.println(" "+placa+" "+marca+" "+año+" "+tipo);}
}

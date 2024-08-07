package POO;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Trabajador {
	private
	String nombre;
	String paterno;
	String materno;
	double sueldo;
	String area;
	public
	Trabajador()
	{
		nombre="Ronal";
		paterno="Quispe";
		materno="Mamani";
		sueldo=2500;
		area="Contador Publico";
	}
	Trabajador(String a, String b, String c, double d, String e)
	{
		nombre=a;
		paterno=b;
		materno=c;
		sueldo=d;
		area=e;
	}
	String obtnn()
	{
		return nombre;
	}
	String obtnp()
	{
		return paterno;
	}
	String obtnm()
	{
		return materno;
	}
	double obtns()
	{
		return sueldo;
	}
	String obtnar()
	{
		return area;
	}
	void ponn(String a)
	{
		nombre=a;
	}
	void ponp(String a)
	{
		paterno=a;
	}
	void ponm(String a)
	{
		materno=a;
	}
	void pons(double a)
	{
		sueldo=a;
	}
	void pona(String a)
	{
		area=a;
	}
	void leer()
	{Scanner sc = new Scanner(System.in);
		System.out.println("introduce nombre: ");
		nombre=sc.next();
		System.out.println("introduce apellido paterno: ");
		paterno=sc.next();
		System.out.println("introduce apellido materno: ");
		materno=sc.next();
		System.out.println("intro sueldo: ");
		sueldo=sc.nextInt();
		System.out.println("intro area de trabajo: ");
		area=sc.next();
	}
	void mostrar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("patero: "+paterno);
		System.out.println("Materno: "+materno);
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Area de trabajo: "+area);
		System.out.println();
	}
	void sueldo()
	{
		
	}

}

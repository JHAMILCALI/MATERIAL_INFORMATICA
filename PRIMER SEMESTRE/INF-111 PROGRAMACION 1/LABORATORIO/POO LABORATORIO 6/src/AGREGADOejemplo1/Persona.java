package AGREGADOejemplo1;

import java.util.Scanner;

public class Persona {
	private
	int ci;
	String nom;
	int fecha;
	public
	Persona()
	{
		ci=654542;
		nom="Gabriel";
		fecha=1999;
	}
	Persona(int a, String b, int c)
	{
		ci=a;
		nom=b;
		fecha=c;
	}
	int obtnc()
	{
		return ci;
	}
	String obtnn()
	{
		return nom;
	}
	int obtnf()
	{
		return fecha;
	}
	void ponc(int a)
	{
		ci=a;
	}
	void ponn(String a)
	{
		nom=a;
	}
	void ponf(int a)
	{
		fecha=a;
	}
	void leer()
	{Scanner sc = new Scanner(System.in);
		System.out.println("ci");
		ci=sc.nextInt();
		System.out.println("nom:");
		nom=sc.next();
		System.out.println("fecha");
		fecha=sc.nextInt();
	}
	void mostrar()
	{
		System.out.println("nombre: "+nom);
		System.out.println("ci: "+ci);
		System.out.println("fecha: "+fecha);
		System.out.println();
	}
	void edad()
	{
		int edad=2023-fecha;
		System.out.println("la edad que tiene "+nom+" es de "+edad);
	}
	

}

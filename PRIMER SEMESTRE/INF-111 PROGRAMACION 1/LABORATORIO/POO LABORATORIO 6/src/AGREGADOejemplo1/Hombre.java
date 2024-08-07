package AGREGADOejemplo1;

import java.util.Scanner;

public class Hombre extends Persona{
	private
	String deportef;
	String especial;
	public
	Hombre()
	{
		deportef="futbol";
		especial="Mecanico";
	}
	Hombre(String a, String b)
	{
		deportef=a;
		especial=b;
	}
	/*Hombre(int a, String b,int c, String d, String e )
	{
		super.obtnn(a);
		super.obtnc(b);
		super.obtnf(c);
	}*/
	String obtnd()
	{
		return deportef;
	}
	String obtne()
	{
		return especial;
	}
	void pond(String a)
	{
		deportef=a;
	}
	void pone(String a)
	{
		especial=a;
	}
	void leer()
	{Scanner sc = new Scanner(System.in);
		System.out.println("deporte faborito: ");
		deportef=sc.next();
		System.out.println("Especialidad");
		especial=sc.next();
	}
	void mostrar()
	{
		System.out.println(super.obtnn()+" su deporte faborito es "+deportef+" su especialida es "+especial);
	}
	void edad()
	{Scanner sc = new Scanner(System.in);
		int edad;
		System.out.println("edad: ");
		edad=sc.nextInt();
		int actual=2023-edad;
		System.out.println("su edad es"+actual);
	}

}

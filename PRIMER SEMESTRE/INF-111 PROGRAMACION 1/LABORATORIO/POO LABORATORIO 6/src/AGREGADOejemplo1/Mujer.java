package AGREGADOejemplo1;

import java.util.Scanner;

public class Mujer extends Persona{
	private
	String ropa;
	String perfume;
	public
	Mujer()
	{
		ropa="Nike";
		perfume="Axes";
	}
	Mujer(String a, String b)
	{
		ropa=a;
		perfume=b;
	}
	String obtr()
	{
		return ropa;
	}
	String obtnp()
	{
		return perfume;
	}
	void ponr(String a)
	{
		ropa=a;
	}
	void ponp(String a)
	{
		perfume=a;
	}
	void leer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ropa: ");
		ropa=sc.next();
		System.out.println("perfueme: ");
		perfume=sc.next();
	}
	void mostrar()
	{
		System.out.println(super.obtnn()+" la ropa que utiliza es "+ropa+" y el perfume que utilliza "+" es "+perfume);
	}
	

}

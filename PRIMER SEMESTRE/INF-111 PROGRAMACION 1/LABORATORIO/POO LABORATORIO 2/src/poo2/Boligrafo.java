package poo2;
import java.util.Scanner;
//para la clase Boligrafo , intancia dos objetos de distinta forma,
//y comparar la marca de ambos.
public class Boligrafo {
	private
		int codb;
		String marca;
		String color;
	public
		Boligrafo()
		{codb=123;
		marca = "pilot";
		color = "azul";
		}
		Boligrafo(int a, String b, String c)
		{	codb = a;
			marca = b;
			color = c;
		}
		Boligrafo(int a, String b)
		{	codb = a;
			marca = b;
			color = "rojo";
		}
		Boligrafo(int a)
		{	codb = a;
			marca = "sabonis";
			color = "negro";
		}
		void leer()
		{Scanner sc=new Scanner(System.in);
			System.out.println("intro cod: ");
			codb =  sc.nextInt();
			System.out.println("intro maraca: ");
			marca = sc.next();
			System.out.println("intro color: ");
			color = sc.next();
		}
		void mostar()
		{System.out.println(" "+codb+" "+marca+" "+color);
		}
		String obtc()
		{return color;}
		String obtm()
		{return marca;}
		void compararamarca(Boligrafo X)
		{if 
			(marca.compareTo(X.obtm())==0)
			{System.out.println("marcas iguales");
			}
		else
			{System.out.println("marcas distintas");
			}
		}
}

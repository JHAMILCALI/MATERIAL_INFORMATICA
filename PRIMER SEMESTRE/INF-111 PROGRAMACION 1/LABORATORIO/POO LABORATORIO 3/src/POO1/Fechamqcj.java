package POO1;
import java.util.Scanner;

import POO2.Leer;
public class Fechamqcj {
	private
		int diamqcj;
		int mesmqcj;
		int añomqcj;
	public
	Fechamqcj()
	{
		diamqcj=10;
		mesmqcj=4;
		añomqcj=2023;
	}
	Fechamqcj(int amqcj, int bmqcj, int cmqcj)
	{
		diamqcj=amqcj;
		mesmqcj=bmqcj;
		añomqcj=cmqcj;
	}
	Fechamqcj(int amqcj)
	{
		diamqcj=amqcj;
		mesmqcj=9;
		añomqcj=2023;
	}
	Fechamqcj(int amqcj, int bmqcj)
	{
		diamqcj=amqcj;
		mesmqcj=bmqcj;
		añomqcj=2023;
	}
	int obtdmqcj()
	{
		return diamqcj;
	}
	void pontd(int amqcj)
	{
		diamqcj=amqcj;
	}
	int obtmmqcj()
	{
		return mesmqcj;
	}
	void pontmmqcj(int amqcj)
	{
		mesmqcj=amqcj;
	}
	int obtamqcj()
	{
		return añomqcj;
	}
	void obtamqcj(int amqcj)
	{
		añomqcj=amqcj;
	}
	void leermqcj()
	{
		System.out.println("intro dia");
		diamqcj=Leer.datolnt();
		System.out.println("intro mes");
		mesmqcj=Leer.datolnt();
		System.out.println("intro año");
		añomqcj=Leer.datolnt();
	}
	void mostrarmqcj()
	{
		System.out.println(" "+diamqcj+":"+mesmqcj+":"+añomqcj);
	}
	void comparamqcj(Fechamqcj F)
	{
		if (diamqcj==F.obtdmqcj()&&mesmqcj==F.obtmmqcj()&&añomqcj==F.obtamqcj()) 
		{System.out.println("misma fecha");}
		else
		{
			System.out.println("fechas distintas");
		}
		}
	void comparamqcj(int dmqcj)
	{
		if (diamqcj==dmqcj) 
		{
			System.out.println("mismo dia");
		}
		else
		{
			System.out.println("distintos dias");
		}
	}
	void comparamqcj(int amqcj, int bmqcj)
	{
		if (diamqcj==amqcj&&mesmqcj==bmqcj) 
		{
			System.out.println("mismo dia mismo mes");
		}
		else
		{
			System.out.println("distintos dia/mes");
		}
		}
		void comparamqcj(int amqcj, int bmqcj, int cmqcj)
		{
			if (diamqcj==amqcj&&mesmqcj==bmqcj&&añomqcj==cmqcj) 
			{
				System.out.println("misma dia mismo mes mismo año");
			}
			else
			{
				System.out.println("distintos dia/mes/año");
			}
		}
}

package POO1;
import java.util.Scanner;
public class Docente extends Persona 
{
	private
		int itemmqcj;
		String especiemqcj;
	public
	Docente()
	{
		itemmqcj=123;
		especiemqcj="Sistemas";
	}
	Docente(int amqcj, String bmqcj,int cmqcj, int dmqcj, String emqcj)
	{
		super(amqcj,bmqcj,cmqcj);
		itemmqcj=dmqcj;
		especiemqcj=emqcj;
	}
	int obtcimqcj()
	{
		return super.obtcmqcj();
	}
	String obtnmqcj()
	{
		return super.obtnmqcj();
	}
	int obtfemqcj()
	{
		return super.obtfmqcj();
	}
	int obtitmqcj()
	{
		return itemmqcj;
	}
	String obtesmqcj()
	{
		return especiemqcj;
	}
	void poncimqcj(int amqcj)
	{
		super.poncmqcj(amqcj);
	}
	void ponnomqcj(String amqcj)
	{
		super.ponnmqcj(amqcj);
	}
	void ponfmqcj(int amqcj)
	{
		super.ponfmqcj(amqcj);
	}
	void ponitmqcj(String amqcj)
	{
		especiemqcj=amqcj;
	}
	int edadmqcj()
	{
		return super.edadmqcj();
	}
	void leermqcj()
	{
		super.leermqcj();
		System.out.println("intro ietm");
		itemmqcj=Leer.datolnt();
		System.out.println("intro especialidad");
		especiemqcj=Leer.dato();
	}
	void mostrartmqcj()
	{
		super.mostrarmqcj();
		System.out.println("\titem\tespecie");
	}
	void mostrarmqcj()
	{
		super.mostrarmqcj();
		System.out.println("\t"+itemmqcj+"\t"+especiemqcj);
	}
	void mismaedadmqcj(Alumno Amqcj)
	{
		System.out.println("\n\n Comparar Edades \n");
		if(this.edadmqcj()==Amqcj.edadmqcj())
		{
			System.out.println("tiene la misma edad "+this.edadmqcj());
		}
		else
		{
			System.out.println("tienen distinta edad "+this.edadmqcj());
		}
	}
}

package POO1;
import java.util.Scanner;
public class Alumno extends Persona
{
	private
		int matrimqcj;
		int regunimqcj;
	public
	Alumno()
	{
		matrimqcj=246;
		regunimqcj=489765;
	}
	Alumno(int amqcj, String bmqcj, int cmqcj, int dmqcj, int emqcj)
	{
		super(amqcj,bmqcj,cmqcj);
		matrimqcj=dmqcj;
		regunimqcj=emqcj;
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
	int obtmamqcj()
	{
		return matrimqcj;
	}
	int obtremqcj()
	{
		return regunimqcj;
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
	void ponmamqcj(int amqcj)
	{
		matrimqcj=amqcj;
	}
	void ponremqcj(int amqcj)
	{
		regunimqcj=amqcj;
	}
	int edadmqcj()
	{
		return super.edadmqcj();
	}
	void leermqcj()
	{
		super.leermqcj();
		System.out.println("intro matricula: ");
		matrimqcj=Leer.datolnt();
		System.out.println("intro registro univ: ");
		regunimqcj=Leer.datolnt();
	}
	void mostrarmqcj()
	{
		super.mostrarmqcj();
		System.out.println("\t"+matrimqcj+"\t"+regunimqcj);
	}
}

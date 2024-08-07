package POO1;

public class Alumno extends Persona_CA 
{
	private
	int matriculamqjc;
	public
	Alumno()
	{
		matriculamqjc=123;
	}
	Alumno(int amqjc)
	{
		matriculamqjc=amqjc;
	}
	Alumno(int amqjc,  String bmqjc, int cmqjc, int dmqjc)
	{
		super.poncimqjc(amqjc);
		super.ponnommqjc(bmqjc);
		super.ponfecmqjc(cmqjc);
		matriculamqjc=dmqjc;
	}
	public int edadmqjc()
	{
		return 2020-super.obtfecmqjc();
	}
	void ponci(int amqjc)
	{
		super.poncimqjc(amqjc);
	}
	void ponnom(String amqjc)
	{
		super.ponnommqjc(amqjc);
	}
	void ponfec(int amqjc)
	{
		super.ponfecmqjc(amqjc);
	}
	void mostrar()
	{
		System.out.println(" "+super.obtcimqjc()+" "+super.obtnommqjc()+" "+super.obtfecmqjc()+" "+matriculamqjc);
	}
}

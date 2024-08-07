package POO1;

class Docente extends Persona_CA 
{
	private
		int itemmqjc;
		String especialidadmqjc;
	public
	Docente()
	{
		itemmqjc=2468;
		especialidadmqjc="Sistemas";
	}
	Docente(int amqjc, String bmqjc)
	{
		itemmqjc=amqjc;
		especialidadmqjc=bmqjc;
	}
	Docente(int amqjc, String bmqjc,int cmqjc, int dmqjc, String emqjc)
	{
		super.poncimqjc(amqjc);
		super.ponnommqjc(bmqjc);
		super.ponfecmqjc(cmqjc);
		itemmqjc =dmqjc;
		especialidadmqjc=emqjc;
	}
	public int edadmqjc()
	{
		return 2020-super.obtfecmqjc();
	}
	void poncimqjc(int amqjc)
	{
		super.poncimqjc(amqjc);
	}
	void ponnommqjc(String amqjc)
	{
		super.ponnommqjc(amqjc);
	}
	void ponfecmqjc(int amqjc)
	{
		super.ponfecmqjc(amqjc);
	}
	void mostrarmqjc()
	{
		System.out.println(" "+super.obtcimqjc()+" "+super.obtnommqjc()+" "+super.obtfecmqjc()+" "+ itemmqjc+" "+especialidadmqjc);
	}
}

package POO1;
interface Actor_1{
}
interface Transporte_1{
}
public abstract class Persona_CA implements Actor_1 
{
	protected
		int cimqjc;
		String nommqjc;
		int fechamqjc;
	public
	Persona_CA()
	{
		cimqjc=9914119;
		nommqjc="calixto";
		fechamqjc=1997;
	}
	abstract int edadmqjc();
		void poncimqjc(int amqjc)
		{
			cimqjc=amqjc;
		}
		void ponnommqjc(String amqjc)
		{
			nommqjc=amqjc;
		}
		void ponfecmqjc(int amqjc)
		{
			fechamqjc=amqjc;
		}
		int obtcimqjc()
		{
			return cimqjc;
		}
		String obtnommqjc()
		{
			return nommqjc;
		}
		int obtfecmqjc()
		{
			return fechamqjc;
		}
		void mostrarmqjc()
		{
			System.out.println(" "+cimqjc+" "+nommqjc+" "+fechamqjc);
		}
}

package POO1;

public class Vehiculo implements Actor_1, Transporte_1
{
	private
		String placamqjc;
		String marcamqjc;
		int modelomqjc;
	public
	Vehiculo()
	{
		placamqjc="ABC-123";
		marcamqjc="Toyota";
		modelomqjc=2000;
	}
	Vehiculo(String amqjc, String bmqjc, int cmqjc)
	{
		placamqjc=amqjc;
		marcamqjc=bmqjc;
		modelomqjc=cmqjc;
	}
	int antiguedadmqjc()
	{
		return 2020-modelomqjc;
	}
	void  mostrarmqjc()
	{
		System.out.println(" "+placamqjc+" "+marcamqjc+" "+modelomqjc);
	}
	
}

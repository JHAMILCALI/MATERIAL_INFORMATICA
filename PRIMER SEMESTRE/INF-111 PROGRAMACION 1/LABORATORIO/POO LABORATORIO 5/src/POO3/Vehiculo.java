package POO3;

public class Vehiculo implements Actor, Transporte
{
	private
		String placajcmq;
		String marcajcmq;
		int modelojcmq;
	public
	Vehiculo()
	{
		placajcmq="ABC-123";
		marcajcmq="Toyota";
		modelojcmq=2000;
	}
	Vehiculo(String ajcmq, String bjcmq, int cjcmq)
	{
		placajcmq=ajcmq;
		marcajcmq=bjcmq;
		modelojcmq=cjcmq;
	}
	int antiguedad()
	{
		return 2020-modelojcmq;
	}
	void  mostrar()
	{
		System.out.println(" "+placajcmq+" "+marcajcmq+" "+modelojcmq);
	}
	
}

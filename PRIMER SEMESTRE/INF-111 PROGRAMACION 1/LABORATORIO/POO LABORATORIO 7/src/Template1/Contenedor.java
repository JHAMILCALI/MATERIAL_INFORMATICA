package Template1;

public class Contenedor <T> 
{
	private
	T contenidojcmq;
	public
	Contenedor()
	{
		
	}
	Contenedor(T xjcmq)
	{
		contenidojcmq=xjcmq;
	}
	T obtncjcmq()
	{
		return contenidojcmq;
	}
	void poncjcmq(T xjcmq)
	{
		contenidojcmq=xjcmq;
	}
	void mostrarjcmq()
	{
		System.out.println(" "+contenidojcmq);
	}
	void comparajcmq(Contenedor cjcmq)
	{
		if(contenidojcmq==cjcmq.obtncjcmq()) {
			System.out.println("son iguales");
		}
		else
		{
			System.out.println("no son iguales");
		}
	}
}

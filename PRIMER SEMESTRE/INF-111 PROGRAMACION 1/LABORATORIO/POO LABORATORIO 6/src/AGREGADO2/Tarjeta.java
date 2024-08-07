package AGREGADO2;

public class Tarjeta {
	private
	int numjcmq;
	String tipojcmq;
	String monedajcmq;
	public
	Tarjeta()
	{
		numjcmq=12345678;
		tipojcmq="Credito";
		monedajcmq="Bolivianos";
	}
	Tarjeta(int ajcmq, String bjcmq, String cjcmq)
	{
		numjcmq=ajcmq;
		tipojcmq=bjcmq;
		monedajcmq=cjcmq;
	}
	int obtnnjcmq()
	{
		return numjcmq;
	}
	String obtntjcmq()
	{
		return tipojcmq;
	}
	String obtnmjcmq()
	{
		return monedajcmq;
	}
	void ponnjcmq(int ajcmq)
	{
		numjcmq=ajcmq;
	}
	void pontjcmq(String ajcmq)
	{
		tipojcmq=ajcmq;
	}
	void ponmjcmq(String ajcmq)
	{
		monedajcmq=ajcmq;
	}
	void leerjcmq()
	{
		System.out.println("intro num");
		numjcmq=Leer.datolnt();
		System.out.println("intro tipo");
		tipojcmq=Leer.dato();
		System.out.println("intro moneda");
		monedajcmq=Leer.dato();
	}
	void mostrarjcmq()
	{
		System.out.println("\n*****Tarjeta*****");
		System.out.println("\t"+numjcmq+"\t"+tipojcmq+"\t"+monedajcmq);
	}
}
	

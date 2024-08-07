package AGREGADO1;

public class Cliente {
	private
	int cijcmq;
	String nomjcmq;
	int fonojcmq;
	public
	Cliente()
	{
		cijcmq=474747;
		nomjcmq="Carlos Torrez";
		fonojcmq=72517;
	}
	Cliente(int ajcmq, String bjcmq, int cjcmq)
	{
		cijcmq=ajcmq;
		nomjcmq=bjcmq;
		fonojcmq=cjcmq;
	}
	int obtncjcmq()
	{
		return cijcmq;
	}
	String obtnnjcmq()
	{
		return nomjcmq;
	}
	int obtnfjcmq()
	{
		return fonojcmq;
	}
	void poncjcmq(int ajcmq)
	{
		cijcmq=ajcmq;
	}
	void ponnjcmq(String ajcmq)
	{
		nomjcmq=ajcmq;
	}
	void ponfjcmq(int ajcmq)
	{
		fonojcmq=ajcmq;
	}
	void leerjcmq()
	{
		System.out.println("intro ci");
		cijcmq=Leer.datolnt();
		System.out.println("intro  nombre ");
		nomjcmq=Leer.dato();
		System.out.println("intro telefono ");
		fonojcmq=Leer.datolnt();
	}
	void mostrarjcmq()
	{
		System.out.println("\n*****cliente*****");
		System.out.println("\t"+cijcmq+"\t"+nomjcmq+"\t"+fonojcmq);
	}
}
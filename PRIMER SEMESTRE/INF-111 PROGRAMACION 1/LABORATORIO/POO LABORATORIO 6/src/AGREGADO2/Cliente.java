package AGREGADO2;

public class Cliente {
	private
	String nombrejcmq;
	String apellidojcmq;
	Tarjeta tarjcmq = new Tarjeta();
	public
	Cliente()
	{
		nombrejcmq="Pedro";
		apellidojcmq="Quispe";
		tarjcmq=new Tarjeta();
	}
	Cliente(String ajcmq, String bjcmq)
	{
		nombrejcmq=ajcmq;
		apellidojcmq=bjcmq;
		tarjcmq= new Tarjeta();
	}
	String obtnnjcmq()
	{
		return nombrejcmq;
	}
	String obtnajcmq()
	{
		return apellidojcmq;
	}
	Tarjeta obtntjcmq()
	{
		return tarjcmq;
	}
	void ponn(String ajcmq)
	{
		nombrejcmq=ajcmq;
	}
	void ponajcmq(String ajcmq)
	{
		apellidojcmq=ajcmq;
	}
	void pontjcmq(Tarjeta T)
	{
		T.ponnjcmq(T.obtnnjcmq());
		T.pontjcmq(T.obtntjcmq());
		T.ponmjcmq(T.obtnmjcmq());
		
	}
	void leerjcmq()
	{
		System.out.println("intro nombre");
		nombrejcmq=Leer.dato();
		System.out.println("intro apellido");
		apellidojcmq=Leer.dato();
		tarjcmq.leerjcmq();
	}
	void mostrarjcmq()
	{
		System.out.println("\n*****Cliente*****");
		System.out.println("\t"+nombrejcmq+"\t"+apellidojcmq);
		tarjcmq.mostrarjcmq();
	}

}

package AGREGADO1;

import java.util.Iterator;

public class Empresa {
	private
	String nomEjcmq;
	String ubijcmq;
	Cliente clijcmq[]=new Cliente[20];
	int nclijcmq;
	public
	Empresa()
	{
		nomEjcmq="Inst.Bancario";
		ubijcmq="Monje 378";
		clijcmq[1]=new Cliente();
		clijcmq[1].poncjcmq(3434);
		clijcmq[1].ponnjcmq("Maria Aro");
		clijcmq[1].ponfjcmq(70685);
		nclijcmq=1;
	}
	Empresa(String ajcmq, String bjcmq, Cliente cjcmq)
	{
		nomEjcmq=ajcmq;
		ubijcmq=bjcmq;
		clijcmq[1]=new Cliente();
		clijcmq[1].poncjcmq(cjcmq.obtncjcmq());
		clijcmq[1].ponnjcmq(cjcmq.obtnnjcmq());
		clijcmq[1].ponfjcmq(cjcmq.obtnfjcmq());
		nclijcmq=1;
	}
	String obtnEjcmq()
	{
		return nomEjcmq;
	}
	String obtnujcmq()
	{
		return ubijcmq;
	}
	Cliente obtncjcmq(int ajcmq)
	{
		return clijcmq[ajcmq];
	}
	void ponnEjcmq(String ajcmq)
	{
		nomEjcmq=ajcmq;
	}
	void ponujcmq(String ajcmq)
	{
		ubijcmq=ajcmq;
	}
	void poncjcmq(Cliente cjcmq)
	{
		clijcmq[1]= new Cliente();
		clijcmq[1].poncjcmq(cjcmq.obtncjcmq());
		clijcmq[1].ponnjcmq(cjcmq.obtnnjcmq());
		clijcmq[1].ponfjcmq(cjcmq.obtnfjcmq());
		nclijcmq=1;
	}
	void leerjcmq()
	{
		System.out.println("\nintro nopmbre Emp. ");
		nomEjcmq=Leer.dato();
		System.out.println("intro ubicacion ");
		ubijcmq=Leer.dato();
		System.out.println("intro num cliente ");
		nclijcmq=Leer.datolnt();
		for (int i = 1; i <=nclijcmq; i++) {
			clijcmq[i]=new Cliente();
			clijcmq[i].leerjcmq();
		}
		
	}
	void mostrarjcmq()
	{
		System.out.println("****Empresa*****");
		System.out.println("\t"+nomEjcmq+"\t"+ubijcmq);
		for (int i = 1; i <=nclijcmq ; i++) {
			clijcmq[i].mostrarjcmq();
		}
	}
}

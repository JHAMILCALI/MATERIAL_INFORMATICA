package PERSISTENCIA1;
import java.util.Scanner;
public class Alumno {
	private
	int ciajcmq;
	String patjcmq="";
	String matjcmq="";
	String nomjcmq="";
	int sexojcmq;
	int anjcmq;
	public
	Alumno()
	{
		ciajcmq=4242;
		patjcmq="Torrez";
		nomjcmq="Aro";
		sexojcmq=0;
		anjcmq=2000;
	}
	Alumno(int ajcmq,String bjcmq, String cjcmq, String djcmq,int ejcmq,int fjcmq)
	{
		ciajcmq=ajcmq;
		patjcmq=bjcmq;
		matjcmq=cjcmq;
		nomjcmq=djcmq;
		sexojcmq=ejcmq;
		anjcmq=fjcmq;
	}
	void leer()
	{
		System.out.println(" Intro el carnet: ");
		ciajcmq=Leer.datolnt();
		System.out.println(" Intro Paterno: ");
		patjcmq=Leer.dato();
		System.out.println(" Intro Materno: ");
		matjcmq=Leer.dato();
		System.out.println(" Intro Nombre: ");
		nomjcmq=Leer.dato();
		System.out.println(" Intro Sexo (1: Varon 0: Mujer)");
		sexojcmq=Leer.datolnt();
		System.err.println(" Intro año nacimiento: ");
		anjcmq=Leer.datolnt();
	}
	void mostrarjcmq()
	{
		System.out.print(""+ciajcmq);
		System.out.print("\t"+patjcmq);
		System.out.print("\t"+matjcmq);
		System.out.print("\t"+nomjcmq);
		System.out.print("\t"+sexojcmq);
		System.out.print("\t"+anjcmq+"\n");
	}
	int obtcjcmq()
	{	return(ciajcmq);}
	String obtpjcmq()
	{
		return (patjcmq);
	}
	String obtmjcmq()
	{
		return(matjcmq);
	}
	String obtnjcmq()
	{
		return (nomjcmq);
	}
	int obtsjcmq()
	{
		return (sexojcmq);
	}
	int obtajcmq()
	{
		return (anjcmq);
	}
	void poncjcmq(int ajcmq)
	{
		ciajcmq=ajcmq;
	}
	void ponpjcmq(String ajcmq)
	{
		patjcmq=ajcmq;
	}
	void ponmjcmq(String ajcmq)
	{
		matjcmq=ajcmq;
	}
	void ponnjcmq(String ajcmq)
	{
		nomjcmq=ajcmq;
	}
	void ponsjcmq(int ajcmq)
	{
		sexojcmq=ajcmq;
	}
	void ponajcmq(int ajcmq)
	{
		anjcmq=ajcmq;
	}
	void pontodojcmq(int ajcmq, String bjcmq, String cjcmq, String djcmq, int ejcmq, int fjcmq)
	{
		ciajcmq=ajcmq;
		patjcmq=bjcmq;
		matjcmq=cjcmq;
		nomjcmq=djcmq;
		sexojcmq=ejcmq;
		anjcmq=fjcmq;
	}
	
}

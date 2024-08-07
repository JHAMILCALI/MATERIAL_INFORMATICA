package laboratorioPOO;
import java.util.Scanner;
//para la clase numero, realizar los metodos de sumar digitos, mostar
//el digito mayor, el digito menor, eliminar el o los digitos centrales.
public class ejercicio1 {
	private
		int nummqjc;
	public
	void leer()
	{	Scanner sc = new Scanner(System.in);
		System.out.println("num: ");
		nummqjc=sc.nextInt();
	}
	void mostrar()
	{	System.out.println(" "+nummqjc);
	
	}
	void sumardig() 
	{	int dmqjc, smqjc=0, nmqjc=nummqjc;
			while(nmqjc!=0)
			{	dmqjc = nmqjc%10;
			 	nmqjc = nmqjc/10;
			 	smqjc = smqjc+dmqjc;
			}
			System.out.println(" suma dig="+smqjc);
	}
	int MayDig()
	{int dmqjc, maymqjc=0, nmqjc=nummqjc;
		while(nmqjc!=0)
		{ dmqjc = nmqjc%10;
		  nmqjc = nmqjc/10;
		if(dmqjc>maymqjc) {maymqjc=dmqjc;}
		}
		return maymqjc;
	}
	int MenDig()
	{int dmqjc, menmqjc=9, nmqjc=nummqjc;
		while(nmqjc!=0)
		{	dmqjc=nmqjc%10;
			nmqjc=nmqjc/10;
			if(dmqjc<menmqjc) {menmqjc=dmqjc;}
		}
		return menmqjc;
	}
	void EliDigCent()
	{	int amqjc,bmqjc,cmqjc,nmqjc,cdmqjc,dmqjc,kmqjc=0,pmqjc=0;
		nmqjc=nummqjc;
		cdmqjc=(int)Math.log10(nmqjc)+1;
		if(cdmqjc%2==0) { pmqjc=(cdmqjc/2)-1; kmqjc=2;}
		else {pmqjc=(cdmqjc/2);kmqjc=1;}
		bmqjc = nmqjc%(int)Math.pow(10,pmqjc);
		nmqjc = nmqjc/ (int)Math.pow(10,pmqjc);
		amqjc = nmqjc/ (int)Math.pow(10,kmqjc);
		cmqjc = amqjc*(int)Math.pow(10,pmqjc)+bmqjc;
		System.out.println("sin centro= "+cmqjc);
	}

}

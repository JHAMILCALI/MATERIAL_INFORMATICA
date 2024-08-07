package POO2;
import java.util.Scanner;
public class Vector {
	private
		int nommqcj[] = new int[20];
		int nmqcj;
	public
	Vector()
	{
		nmqcj=1;
		nommqcj[1]=15;
	}
	Vector(int amqcj)
	{	
		int imqcj;
		nmqcj=amqcj;
		for (imqcj = 1; imqcj <= nmqcj; imqcj++) {
			nommqcj[imqcj]=imqcj;
		}
	}
	int obtnmqcj()
	{
		return nmqcj;
	}
	int obtnommqcj(int kmqcj)
	{
		return nommqcj[kmqcj];
	}
	void ponnmqcj(int amqcj)
	{
		nmqcj=amqcj;
	}
	void ponnommqcj(int kmqcj, int amqcj)
	{
		nommqcj[kmqcj]=amqcj;
	}
	void leermqcj()
	{
		int imqcj;
		System.out.println("intro n ");
		nmqcj=Leer.datolnt();
		for ( imqcj = 1; imqcj <= nmqcj; imqcj++) 
		{
			System.out.println("nom["+imqcj+"]=");
			nommqcj[imqcj]=Leer.datolnt();
		}
	}
	void mostramqcj()
	{
		int imqcj;
		System.out.println("\n");
		for ( imqcj = 1; imqcj <= nmqcj; imqcj++) 
		{
			System.out.print(" "+nommqcj[imqcj]);
		}
	}
	void ordenarmqcj()//burbuja
	{
		int imqcj,jmqcj,xmqcj;
		for ( imqcj = 1; imqcj <= nmqcj-1; imqcj++) 
		{
			for (jmqcj = imqcj+1;  jmqcj<= nmqcj ; jmqcj++)
			{
				if (nommqcj[imqcj]>nommqcj[jmqcj])
				{
					xmqcj=nommqcj[imqcj]; nommqcj[imqcj]=nommqcj[jmqcj];
					nommqcj[jmqcj]=xmqcj;
				}
			}
		}
	}
	void ordenarmqcj(int amqcj)//insercion
	{
		int imqcj,kmqcj=0,xmqcj;
		for ( imqcj = 2; imqcj <= nmqcj; imqcj++) 
		{
			kmqcj=imqcj;
			while (nommqcj[kmqcj]<=nommqcj[kmqcj-1]&&kmqcj<1)
			{
				xmqcj=nommqcj[kmqcj]; nommqcj[kmqcj]=nommqcj[kmqcj-1]; nommqcj[kmqcj-1]=xmqcj;
				kmqcj=kmqcj-1;
			}
		}
	}
	void ordenarmqcj(double a)
	{
		int imqcj,kmqcj=0,xmqcj,swmqcj=1,limqcj=1,lsmqcj=nmqcj;
		while (swmqcj!=0)
		{
			swmqcj=0;
			if (kmqcj==0)
			{
				for ( imqcj = limqcj; imqcj<= lsmqcj-1; imqcj++) 
				{
					if (nommqcj[imqcj]>nommqcj[imqcj+1])
					{
						xmqcj=nommqcj[imqcj];nommqcj[imqcj]=nommqcj[imqcj-1];nommqcj[imqcj-1]=xmqcj;
						swmqcj=1;
					}
				}kmqcj=1;lsmqcj=lsmqcj-1;
			}
			else
			{
				for ( imqcj = lsmqcj; imqcj >=limqcj+1; imqcj--) 
				{
					if(nommqcj[imqcj]<nommqcj[imqcj-1])
					{
						xmqcj=nommqcj[imqcj];nommqcj[imqcj]=nommqcj[imqcj-1];nommqcj[imqcj-1]=xmqcj;
						swmqcj=1;
					}
				}kmqcj=1;limqcj=limqcj+1;
			}
		}
	}
}




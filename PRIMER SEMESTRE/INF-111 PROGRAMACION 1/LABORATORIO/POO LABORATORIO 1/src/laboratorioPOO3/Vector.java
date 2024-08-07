package laboratorioPOO3;

import java.util.Scanner;
//Realizar los metodod de ordenaminto de , burbuja, sacudida, insercion, leer
// y mostar. Usar constructosres.

public class Vector {
	private
		int nommqjc[]= new int[10];
		int nmqjc;
	public
		Vector()
		{	nmqjc=1;
			nommqjc[1]=15;
		}
		Vector(int amqjc)
		{	int imqjc;
			nmqjc=amqjc;
			for(imqjc=1;imqjc<=nmqjc;imqjc++)
			{	nommqjc[imqjc]=imqjc;
			}
		}
		int obtn()
		{	return nmqjc; }
		int obtnom(int kmqjc)
		{	return nommqjc [kmqjc]; }
		void ponn(int amqjc)
		{	nmqjc=amqjc;}
		void ponnom(int kmqjc, int amqjc)
		{	nommqjc[kmqjc]=amqjc;}
		void leer()
		{	int imqjc;
			Scanner sc =new Scanner(System.in);
			System.out.println("intro n ");
			nmqjc = sc.nextInt();
			for(imqjc=1;imqjc<=nmqjc;imqjc++)
			{	System.out.println(" nom["+imqjc+"]=");
				nommqjc[imqjc]=sc.nextInt();
			}
			
		}
		void mostrar()
		{	int imqjc;
			Scanner sc = new Scanner (System.in);
			System.out.println("\n");
			for(imqjc=1;imqjc<=nmqjc;imqjc++)
			{	System.out.print(" "+nommqjc[imqjc]);
			}
		}
		void burbuja()
		{	int imqjc,jmqjc,xmqjc;
			for(imqjc=1;imqjc<=nmqjc-1;imqjc++)
			{	for(jmqjc=imqjc+1;jmqjc<=nmqjc;jmqjc++)
				{	if(nommqjc[imqjc]>nommqjc[jmqjc]) {xmqjc=nommqjc[imqjc];nommqjc[imqjc]=nommqjc[jmqjc];
					nommqjc[jmqjc]=xmqjc;}
				}
			}
		}
		void insercion()
		{	int imqjc,kmqjc=0,xmqjc;
			for(imqjc=2;imqjc<=nmqjc;imqjc++)
			{	kmqjc=imqjc;
				while(nommqjc[kmqjc]<=nommqjc[kmqjc-1] && kmqjc>1 )
				{	xmqjc=nommqjc[kmqjc]; nommqjc[kmqjc]=nommqjc[kmqjc-1]; nommqjc[kmqjc-1]=xmqjc;
					kmqjc=kmqjc-1;
				}
			}
		}
		void sacudida()
		{	int imqjc, kmqjc=0,xmqjc,swmqjc=1, limqjc=1, lsmqjc=nmqjc;
			while(swmqjc!=0)
			{	swmqjc=0;
				if (kmqjc==0)
				{	for(imqjc=limqjc;imqjc<=lsmqjc-1;imqjc++)
					{	if(nommqjc[imqjc]>nommqjc[imqjc+1])
						{	xmqjc=nommqjc[imqjc]; nommqjc[imqjc]=nommqjc[imqjc+1];nommqjc[imqjc+1]=xmqjc;
							swmqjc=1;
						}
					}kmqjc=1; lsmqjc=lsmqjc-1;
				}
				else
				{	for(imqjc=lsmqjc;imqjc>=limqjc+1;imqjc--)
					{	if(nommqjc[imqjc]<nommqjc[imqjc-1])
						{	xmqjc=nommqjc[imqjc]; nommqjc[imqjc]=nommqjc[imqjc-1]; nommqjc[imqjc-1]=xmqjc;
							swmqjc=1;
						}
					}kmqjc=1; limqjc=limqjc+1;
				}
			
			}
		}
}


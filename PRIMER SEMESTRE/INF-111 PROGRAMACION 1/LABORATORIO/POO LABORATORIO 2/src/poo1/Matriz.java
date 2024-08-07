package poo1;
import java.util.Scanner;
//clase de Matriz, con los siguentes metodos, generar
//la matriz caracol,la matriz rombo y zig zag
public class Matriz {
	private
		int elemqjc[][]= new int[10][10];
		int nmqjc;
	public
		Matriz()
		{	nmqjc=1;
			elemqjc[nmqjc][nmqjc]=15;
		}
		Matriz(int amqjc)
		{	int imqjc, jmqjc;
			nmqjc=amqjc;
			for (imqjc=1;imqjc<=nmqjc;imqjc++)
			{	for (jmqjc=1;jmqjc<=nmqjc;jmqjc++)
				{	elemqjc[imqjc][jmqjc]=imqjc+jmqjc;
				}
			}
		}
		void mostrarm(int nmqjc)
		{	int imqjc,jmqjc;
			System.out.println("\n");
			for (imqjc=1;imqjc<=nmqjc;imqjc++)
			{	for (jmqjc=1;jmqjc<=nmqjc;jmqjc++)
				{
				System.out.print("\t"+elemqjc[imqjc][jmqjc]);
				}
				System.out.println("\n");
			}
		}
		void caracolcentro (int nmqjc)
		{	int imqjc, jmqjc,pmqjc,kmqjc,cmqjc=1,limqjc,lsmqjc;
			pmqjc=(nmqjc/2)+1; limqjc=pmqjc; lsmqjc=pmqjc;
			elemqjc[pmqjc][pmqjc]=cmqjc;cmqjc++;
			for (kmqjc=1;kmqjc<=pmqjc-1;kmqjc++)
			{	jmqjc=lsmqjc+1;
				for(imqjc=limqjc;imqjc<=lsmqjc+1;imqjc++)
				{ elemqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;}
					imqjc=lsmqjc+1;
				for(jmqjc=lsmqjc;jmqjc>=limqjc-1;jmqjc--)
				{ elemqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;}
					jmqjc=limqjc-1;
				for(imqjc=lsmqjc;imqjc>=limqjc-1;imqjc--)
				{ elemqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;}
					imqjc=limqjc-1;
				for(jmqjc=limqjc;jmqjc<=lsmqjc+1;jmqjc++)
				{ elemqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;}	
					limqjc=limqjc-1; lsmqjc=lsmqjc+1;
						
			}
			
		}
		void rombo(int nmqjc)
		{int imqjc, jmqjc, cmqjc=1,limqjc, lsmqjc;
			limqjc=(nmqjc/2)+1; lsmqjc=limqjc;
			for(imqjc=1;imqjc<=nmqjc;imqjc++)
			{	for (jmqjc=limqjc;jmqjc<=lsmqjc;jmqjc++)
				{	
					elemqjc[imqjc][jmqjc]=cmqjc; cmqjc=cmqjc+1;
				}
				if(imqjc>=(nmqjc/2)+1)
				{	limqjc=limqjc+1; lsmqjc=lsmqjc-1;}
				else
				{	limqjc=limqjc-1; lsmqjc=lsmqjc+1;}
			}
		}
		void zic(int nmqjc)
		{	int cmqjc=1, kmqjc,imqjc,jmqjc;
		 	for (kmqjc=1;kmqjc<=nmqjc;kmqjc++)
		 	{if(kmqjc%2==1)
		 		{jmqjc=kmqjc;
		 		for(imqjc=1;imqjc<=kmqjc;imqjc++)
			  		{ elemqjc [imqjc][jmqjc]=cmqjc; cmqjc++; jmqjc--;}
			}
		 	else
		 	{imqjc=kmqjc;
		 	 	for(jmqjc=1;jmqjc<=kmqjc;jmqjc++)
		 	 		{elemqjc[imqjc][jmqjc]=cmqjc; cmqjc++;imqjc--;}
		 	 }
		 }
		 	for(kmqjc=2;kmqjc<=nmqjc;kmqjc++)
		 	{	if(kmqjc%2==1)
		 		{jmqjc=nmqjc;
		 		for(imqjc=kmqjc;imqjc<=nmqjc;imqjc++)
		 			{elemqjc[imqjc][jmqjc]=cmqjc; cmqjc++; jmqjc--;}
		 		}
		 	else
		 	{imqjc=nmqjc;
		 		for(jmqjc=kmqjc;jmqjc<=nmqjc;jmqjc++)
		 		{elemqjc [imqjc][jmqjc]=cmqjc;cmqjc++;imqjc--;}
		 	}
		 }

	}
}

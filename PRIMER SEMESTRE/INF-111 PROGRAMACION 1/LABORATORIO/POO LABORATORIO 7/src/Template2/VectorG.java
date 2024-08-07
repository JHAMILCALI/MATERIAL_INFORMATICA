package Template2;

public class VectorG <T>
{
	private
	Object datjcmq[]= new Object[20];
	int njcmq;
	public
	VectorG()
	{
		njcmq=1;
	}
	VectorG(T xjcmq, int tjcmq)
	{
		int i; njcmq=tjcmq;
		for (i = 1; i <= njcmq; i++) {
			datjcmq[i]=xjcmq;
		}
	}
	VectorG(T a,T b, T c, T d, T e)
	{
		njcmq=5;
		datjcmq[1]=a;	datjcmq[2]=b;	datjcmq[3]=c;
		datjcmq[4]=d;	datjcmq[5]=e;
	}
	void intervenirjcmq()
	{
		int ijcmq, kjcmq; kjcmq=njcmq;
		T xjcmq;
		for (ijcmq = 1;  ijcmq<= njcmq/2; ijcmq++) {
			xjcmq=(T)datjcmq[ijcmq]; datjcmq[ijcmq]=datjcmq[kjcmq];
			datjcmq[kjcmq]=xjcmq;	kjcmq=kjcmq-1;
		}
	}
	void mostrarjcmq()
	{
		int ijcmq;
		System.out.println("\n");
		for (ijcmq = 1;  ijcmq<= njcmq; ijcmq++) {
			System.out.print(" "+datjcmq[ijcmq]);
		}
	}
	void ordenarjcmq()
	{
		int ijcmq,jjcmq;
		T xjcmq;
		for ( ijcmq = 1;  ijcmq<=njcmq-1; ijcmq++) {
			for (jjcmq = ijcmq+1; jjcmq <=njcmq; jjcmq++) {
				if (datjcmq[ijcmq].toString().compareTo(datjcmq[jjcmq].toString())>0) 
				{
					xjcmq=(T)datjcmq[ijcmq]; datjcmq[ijcmq]=datjcmq[jjcmq]; datjcmq[jjcmq]=xjcmq;
				}
			}
		}
	}
}

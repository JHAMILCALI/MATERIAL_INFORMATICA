package lotes;
import java.util.Scanner;
public class Ejer3 
{
    public static void main(String[]args)
    {
        int n,i,p=0,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        n=sc.nextInt();
        while(n>0)
        {
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    p=p+1;
                }
            }
            if(p==2)
            {
                s=s+n;
                p=0;
            }
            else
            {
                p=0;
            }
            System.out.print("Ingrese un numero:");
            n=sc.nextInt();
        }
        System.out.println("Resultado:"+s);
    }
}
package Descomposision;
import java.util.Scanner;
public class Ejer7
{
    public static void main(String[]args)
    {
        int n,p=0,k=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        n=sc.nextInt();
        while(n!=0)
        {
            k=n%10;
            for(i=1;i<=k;i++)
            {
                if(k%i==0)
                {
                    p=p+1;
                }
            }
            if(p==2)
            {
                System.out.print(k+" ");
                p=0;
            }
            else
            {
                p=0;
            }
            n=n/10;
        }
        System.out.println("FIN");
    }
}

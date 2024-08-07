package lotes;
import java.util.Scanner;
public class Ejer4
{
    public  static void main(String[]args)
    {
        int x,s=0,a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero x:");
        x=sc.nextInt();
        while(x>0)
        {
            if(x>9)
            {
                while(x!=0)
                {
                    a=x%10;
                    x=x/10;
                    s=s+a;
                }
            }
            else
            {
                s=s+x;
            }
            System.out.print("Ingrese un numero x:");
            x=sc.nextInt();
        }
        System.out.println("Resultado:"+s);
    }
}

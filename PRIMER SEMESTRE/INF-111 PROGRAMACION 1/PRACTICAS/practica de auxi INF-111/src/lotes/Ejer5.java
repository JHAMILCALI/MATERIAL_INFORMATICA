package lotes;
import java.util.Scanner;
public class Ejer5
{
    public static void main(String []args)
    {
        int x,k=0,a,s=0;
        Scanner sc=new Scanner(System.in);
        while(k==0)
        {
            System.out.print("Ingrese un numero x:");
            x=sc.nextInt();
            while(x<0 || x>9)
            {
                System.out.print("Ingrese un numero otra vez del 0 al 9 x:");
                x=sc.nextInt();
            }
            s=s*10+x;
            if(s>9 && s%5==0)
            {
                k=1;
            }
        }
        System.out.println("La composicion "+s+" es multiplo de 5");
    }
}

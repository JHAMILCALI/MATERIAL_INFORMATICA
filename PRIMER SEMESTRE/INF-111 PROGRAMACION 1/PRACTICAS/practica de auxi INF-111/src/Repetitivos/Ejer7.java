package Repetitivos;
import java.util.Scanner;
/*Entrada:
4
Salida:
0 0 0 0
0 0 0 1
0 0 0 0
0 0 2 1
0 0 0 0
0 3 2 1
0 0 0 0
4 3 2 1
*/
public class Ejer7 
{
    public static void main(String[]args)
    {
        int num,i,j,m=0,x,n=0,l,h,g=1;
        Boolean sw = false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        num=sc.nextInt();
        while(num<=0)
        {
            System.out.print("Ingrese un numero:");
            num=sc.nextInt();
        }
        l=num-1;
        x=m;
        h=l;
        for(i=1;i<=num*2;i++)
        {
            if(sw)
            {
                for(j=1;j<=num;j++)
                {
                    if(j>=num-n)
                    {
                        m=num-l;
                        System.out.print(m);
                        l=l+1;
                    }
                    else
                    {
                        m=x;
                        System.out.print(m);
                    }
                    
                }
                l=h;
                l=l-g;
                g=g+1;
                System.out.println("");
                n=n+1;
                sw=false;
            }
            else
            {
                for(j=1;j<=num;j++)
                {
                    m=x;
                    System.out.print(m);
                }
                System.out.println("");
                sw=true;
            }
        }
    }
}
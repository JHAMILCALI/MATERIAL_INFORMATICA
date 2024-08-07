package Modularidad;
import java.util.Scanner;
public class Ejer9 
{
    public static int rep(int a,int b)
    {
        int c=0,n=a,m=b,x;
        while(n!=0)
        {
            x=n%10;
            if(x==m)
            {
                c=c+1;
            }
            n=n/10;
        }
        return c;
    }
    public static void main(String[]args)
    {
        int n,x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero n:");
        n=sc.nextInt();
        System.out.print("Que numero desea saber cuanto se repite:");
        x=sc.nextInt();
        System.out.println("El numero "+x+" se repite "+rep(n,x)+" veces");
    }
}

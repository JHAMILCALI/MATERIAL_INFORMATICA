package Modularidad;
import java.util.Scanner;
public class Ejer5 
{
    public static int fibo(int a)
    {
        int m,i,fib1=-1,fib2=1,s=0;
        m=a;
        for(i=1;i<=m;i++)
        {
            s=fib1+fib2;
            fib1=fib2;
            fib2=s;
        }
        return s;
    }
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Que numero fibo quiere obtener:");
        n=sc.nextInt();
        System.out.println("El fibo es:"+fibo(n));
    }
}

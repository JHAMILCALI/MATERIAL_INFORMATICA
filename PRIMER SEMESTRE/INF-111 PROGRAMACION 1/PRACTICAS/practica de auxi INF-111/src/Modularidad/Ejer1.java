package Modularidad;
import java.util.Scanner;
public class Ejer1 
{
    public static int primo(int a)
    {
        int i,m,p=0,k;
        m=a;
        for(i=1;i<=m;i++)
        {
            if(m%i==0)
            {
                p=p+1;
            }
        }
        if(p==2)
        {
            k=1;
        }
        else
        {
            k=0;
        }
        return k;
    }
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        n=sc.nextInt();
        if(primo(n)==1)
        {
            System.out.println("El numero es primo");
        }
        else
        {
            System.out.println("El numero no es primo");
        }   
    }
}

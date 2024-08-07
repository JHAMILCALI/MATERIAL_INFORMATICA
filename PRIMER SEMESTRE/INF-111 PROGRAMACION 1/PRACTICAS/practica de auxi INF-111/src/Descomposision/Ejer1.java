package Descomposision;
import java.util.Scanner;
public class Ejer1 
{
    public static void main(String[] args)
    {
        int n,y=0,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        n=sc.nextInt();
        while(n<10)
        {
            System.out.println("Ingrese un numero:");
            n=sc.nextInt();
        }
        while(n!=0)
        {
            p=n%10;
            y=y*10+p;
            n=n/10;
        }
        System.out.println("inversa:"+y);
    }
}
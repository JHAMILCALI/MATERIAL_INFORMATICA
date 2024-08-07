package Modularidad;
import java.util.Scanner;
public class Ejer3{
    public static int capicuo(int a){
        int n1,n2,y=0,p,k;
        n1=a;
        n2=a;
        while(n2!=0)
        {
            p=n2%10;
            y=y*10+p;
            n2=n2/10;
        }
        if(y==n1)
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
        System.out.println("¿El numero sera capicuo?");
        if(capicuo(n)==1)
        {
            System.out.println("SI");
        }
        else
        {
            System.out.println("NO");
        }
        System.out.println("");
    }
}


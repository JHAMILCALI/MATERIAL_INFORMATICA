package Modularidad;
import java.util.Scanner;
public class Ejer7
{
    public static String binario(int a)
    {
        int n,mod;
        String bin="";
        n=a;
        while(n!=0)
        {
            mod=n%2;
            bin=mod+bin;
            n=n/2;          
        }
        return bin;
    }
    public static void main(String[]args)
    {
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        m=sc.nextInt();
        System.out.println("Su binario es:"+binario(m));
    }
}

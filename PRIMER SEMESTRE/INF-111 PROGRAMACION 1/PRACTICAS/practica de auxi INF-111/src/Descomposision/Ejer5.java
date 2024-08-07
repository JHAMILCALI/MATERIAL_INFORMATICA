package Descomposision;
import java.util.Scanner;
public class Ejer5 
{
   public static void main(String[]args)
   {
       int n,p;
       Scanner sc=new Scanner(System.in);
       System.out.print("Ingrese un numero:");
       n=sc.nextInt();
       while(n<=0)
       {
           System.out.print("Ingrese un numero:");
            n=sc.nextInt();
       }
       while(n!=0)
       {
            p=n%10;
            if(p%2==0)
            {
                System.out.print(p+" ");
            }
            n=n/10;
       }      
       System.out.println("");
   }
}

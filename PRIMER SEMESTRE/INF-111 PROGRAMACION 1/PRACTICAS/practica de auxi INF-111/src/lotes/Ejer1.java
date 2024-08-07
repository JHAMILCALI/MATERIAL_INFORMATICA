package lotes;
import java.util.Scanner;
public class Ejer1{
    public static void main(String[]arga){
        int n,i,j,may=0,men=999999999,x,div=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("Ingrese un numero n:");
       n=sc.nextInt();
       for(i=1;i<=n;i++){           
           System.out.print("Ingrese un numero x::");
           x=sc.nextInt();
           if(x<=men){men=x;}
           else{if(x>=may){may=x;}}
       }
       System.out.println("El mayor es:"+may+" y El menor es:"+men);
       for(j=1;j<=men;j++){
            if((may%j==0)&&(men%j==0))
            {
                div=j;
            }
       }
       if(div==0){
           System.out.println("El Maximo comun divisor es 1");
       }
       else{
           System.out.println("El Maximo comun divisor es:"+div);
       }
    }
}

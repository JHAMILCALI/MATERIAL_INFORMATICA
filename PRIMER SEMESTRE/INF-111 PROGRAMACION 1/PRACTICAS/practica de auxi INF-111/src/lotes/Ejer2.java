package lotes;
import java.util.Scanner;
public class Ejer2 {
    public static void main(String[]args){
        int n,i,x,men=100,may=0,d1=0,d=0,r1=0,d2=0,r2=0,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        n=sc.nextInt();
        while(n<=0 || n>1000){
            System.out.print("Ingrese un numero n:");
            n=sc.nextInt();
        }
        for(i=1;i<=n;i++){
            System.out.print("Ingrese un numero x:");
            x=sc.nextInt();
            while(x<0 || x>100){System.out.print("Ingrese un numero:");x=sc.nextInt();}
            if(i==1){d1=x;r1=r1+1;}
            if(x==d1){
                r1=r1+1;
            }
            else{
                if(r2==0){
                    d2=x;
                }
                if(x==d2){
                    r2=r2+1;
                }
                if(x<d1 && x<d2){
                    if(d1<d2){
                        d2=x;
                        r2=0;
                    }
                    else{
                        d1=x;
                        r1=0;
                    }
                }
            }            
        }
        if(r1>r2){
            k=d1;
        }
        else{
            k=d2;
        }
        System.out.println("el que mas se repite es :"+k);
    }
}

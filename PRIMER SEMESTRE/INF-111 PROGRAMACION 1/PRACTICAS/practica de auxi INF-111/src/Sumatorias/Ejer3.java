package Sumatorias;
import  java.util.Scanner;
public class Ejer3{
    public static void main(String[]args){
        int n,i,s=0,fib1=-1,fib2=1,fib3=0,fib4=0,fib5=0,s2=0;
        Boolean sw=true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Intro numero:");
        n=sc.nextInt();
        while(n<=0){
            System.out.print("Intro numero:");
            n=sc.nextInt();
        }
        for(i=1;i<=n;i++){
            if(sw){
            s=fib1+fib2;
            fib1=fib2;
            fib2=s;
            if(i==2){fib3=fib1;}
            if(i==3){fib4=fib1;}
            if(i==4){sw=false;}
            s2=s2+s;
            System.out.print(s+"+");}
            else{
                s=fib3+fib4+fib5+fib1+fib2;
                if(i==5){fib5=fib1;}
                if(i>5){
                    fib3=fib4;
                    fib4=fib5;
                    fib5=fib1;
                }
                fib1=fib2;
                fib2=s;
                s2=s2+s;
                System.out.print(s+"+");
            }
        }
        System.out.print("="+s2);
        System.out.println("");
    }
}
package Sumatorias;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejer1 {
    public static void main(String[]args){
        double n,i,p=0,i1=1,i2=3,i3=0,i4=2,s=0;
        DecimalFormat df=new DecimalFormat("#.00");
        DecimalFormat df2=new DecimalFormat("#");
        Scanner sc=new Scanner(System.in);
        System.out.print("Intro un numero:");
        n=sc.nextInt();
        while(n<=0){
            System.out.print("Intro un numero:");
            n=sc.nextInt();}
        for(i=1;i<=n;i++){
            if(i%2==0){
                s=s+(p/p);
                System.out.print(df2.format(p)+"/"+df2.format(p)+"+");
                if(i==4){i3=2;}
                i1=i1+i3;
                i2=i2+i4;
            }
            else{
                s=s+(i1/i2);
                System.out.print(df2.format(i1)+"/"+df2.format(i2)+"+");
                p=p+2;
            }
        }
        System.out.println("");
        System.out.println(df.format(s));
        
    }
}


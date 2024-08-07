package Sumatorias;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejer7{
    public static void main(String[]args){
        double n,i,p=4,im=5,s=0,k,k1,k2,im2;
        Boolean sw=true;
        DecimalFormat df=new DecimalFormat("0.00");
        DecimalFormat df2=new DecimalFormat("#");
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        n=sc.nextInt();
        while(n<=0){
            System.out.print("Ingrese un numero:");
            n=sc.nextInt();
        }
        for(i=1;i<=n;i++){
            if(i==1 || i==2){
                System.out.print(df2.format(s)+"+");
            }
            if(sw && i>2){
                s=s+(p/im);
                System.out.print("("+df2.format(p)+"/"+df2.format(im)+")+");
                p=p+2;
                im=im+2;
                if(i>=4){sw=false;}
                
            }
            else{
                if(i>2 && sw==false)
                {
                    k=p;
                    k1=p+1;
                    k2=p+2;
                    im2=im+2;
                    s=s+((k+k1+k2)/im2);
                    System.out.print("(("+df2.format(k)+"+"+df2.format(k1)+"+"+df2.format(k2)+")/"+df2.format(im2)+")+");
                    p=p+4;
                    im=im+4;
                    sw=true;
                }
            }
        }
        System.out.print("="+df.format(s));
        System.out.println("");
    }
}


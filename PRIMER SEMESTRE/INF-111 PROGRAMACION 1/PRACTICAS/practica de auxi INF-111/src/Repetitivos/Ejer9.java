package Repetitivos;
import java.util.Scanner;
public class Ejer9 {
    public static void main(String[]args){
        int num,i,j,x=1,sig=1,l1=0,l2=0,p=1;
        Boolean sw = true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Intro un numero:");
        num=sc.nextInt();
        while(num<=0)
        {
            System.out.print("Intro un numero:");
            num=sc.nextInt();
        }
        for(i=1;i<=num;i++)
        {
            if(sw)
            {
                for(j=1;j<=(num*2)-1;j++)
                {
                    System.out.print(x);
                    x=x+sig;
                    if(x==num)
                    {
                        sig=sig*(-1);
                    }
                    
                }
                System.out.println("");
                sw=false;
                x=1;
                sig=1;
            }
            else
            {
                for(j=1;j<=(num*2)-1;j++)
                {
                    if(j==5 || (j>=l1 && j<=l2))                     
                    {
                        System.out.print(" ");
                        x=x+sig;
                        if(x==num)
                        {
                            sig=sig*(-1);
                        }
                    }
                    else
                    {
                        System.out.print(x);
                        x=x+sig;
                        if(x==num)
                        {
                            sig=sig*(-1);
                        }
                    }
                }
                System.out.println("");
                sig=1;
                x=1;
                l1=num-p;
                l2=num+p;
                p=p+1;
            }
        }
    }
}

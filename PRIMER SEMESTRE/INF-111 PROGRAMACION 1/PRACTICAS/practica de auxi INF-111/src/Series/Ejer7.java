package Series;
import java.util.Scanner;
public class Ejer7{
    public static void main(String[]args){
        int num,i,j,p=0,s=2,s2=1,k=0;
        int sw=0;
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
            if(sw==0)
            {
                System.out.print(s+",");
                p=p+1;
                if(p==2)
                {
                    s=s+2;
                    p=0;
                }
                if(p==0)
                {
                    sw=0;
                }
                else
                {
                    sw=1;
                }
            }
            if(sw==1)
            {
                System.out.print(s2+",");
                s2=s2+2;
                sw=0;
            }
            
        }
        System.out.println("");
        
    }
}

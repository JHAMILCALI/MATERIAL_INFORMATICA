package Series;
import java.util.Scanner;
public class Ejer2{
    public static void main(String[]args){
        int num,x1=-1,x2=1,x,i,j,s=2,d=0,k=0;
        Boolean sw = true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        num=sc.nextInt();
        while(num<=0) {
            System.out.print("Ingrese un numero:");
            num=sc.nextInt();
        }
        for(i=1;i<=num;i++){
            if(sw){
                while(k==0){
                    for(j=1;j<=s;j++){
                        if(s%j==0){
                            d=d+1;
                        }
                    }
                    if(d==2)
                    {
                        System.out.print(s+",");
                        k=1;
                    }
                    s=s+1;
                    d=0;
                }
                sw=false;
            }
            else{
                x=x1+x2;
                System.out.print(x+",");
                x1=x2;
                x2=x;
                k=0;
                sw=true;
            }
        }
        System.out.println("");
    }
}

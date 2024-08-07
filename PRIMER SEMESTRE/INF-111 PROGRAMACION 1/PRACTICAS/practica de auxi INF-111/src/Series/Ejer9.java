package Series;
import java.util.Scanner;
public class Ejer9{
    public static void main(String[]args){
        int num,i,j,s=3,m=1;
        Boolean sw =true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        num=sc.nextInt();
        while(num<=0)
        {
            System.out.print("Ingrese un numero:");
            num=sc.nextInt();
        }
        for(i=1;i<=num;i++){
            System.out.print(m+",");
            m=m+s;
            s=s+2;
        }
        System.out.println("");
    }
}

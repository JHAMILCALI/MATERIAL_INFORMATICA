package Series;
import java.util.Scanner;
public class Ejer5 {

	public static void main(String[] args) {
		int i,n,t=1,p=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero => ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        { System.out.print(t+",");
        p=p+1;
        if(p>t){t=t+1;p=1;}
        }
    } 
}


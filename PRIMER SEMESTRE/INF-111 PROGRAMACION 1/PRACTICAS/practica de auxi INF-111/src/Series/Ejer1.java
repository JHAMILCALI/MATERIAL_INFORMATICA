package Series;

import java.util.Scanner;
//Ejercicicio 1 los numero fibo
public class Ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0, b=1 , c, n;
		System.out.print("intro n: ");
		n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;	
		}
			
	}

}

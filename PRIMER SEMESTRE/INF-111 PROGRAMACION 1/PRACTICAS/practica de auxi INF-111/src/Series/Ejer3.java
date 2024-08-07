package Series;
import java.util.Scanner;

public class Ejer3 {
//primos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        int n = sc.nextInt();
        int c = 0;
        int p = 2;

        for (int i = 0; i < n; i++) {
            int k = 2;
            boolean isPrime = true;

            while (k <= p / 2) {
                if (p % k == 0) {
                    isPrime = false;
                    break;
                }
                k++;
            }

            if (isPrime) {
                System.out.print(p + " ");
                c++;
            }

            p++;
        }
    }

}


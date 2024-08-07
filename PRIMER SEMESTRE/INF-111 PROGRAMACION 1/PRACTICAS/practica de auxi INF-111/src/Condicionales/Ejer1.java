package Condicionales;
import java.util.Scanner;
/*paractica #1
Escribe un programa que pida al usuario una letra y determine si es una vocal o
una consonante. Imprime "Es una vocal" o "Es una consonante" según
corresponda.
*/public class Ejer1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("introduce una leta: ");
	char letra = sc.next().toLowerCase().charAt(0);
	if(letra == 'a' || letra == 'e' || letra == 'I' || letra == 'O' || letra == 'U') {
		System.out.println("Es una vocal "+letra);
	}else if ((letra >= 'a' && letra <= 'z')||(letra >= 'A' && letra == 'Z')){
		System.out.println("Es una cosonate ");
	}else {
		System.out.println("No es una vocal "+letra);
	}
	}

}

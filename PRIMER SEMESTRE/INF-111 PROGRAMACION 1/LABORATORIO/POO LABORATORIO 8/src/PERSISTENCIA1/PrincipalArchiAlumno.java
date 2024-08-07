package PERSISTENCIA1;
import java.io.IOException;
import java.util.Scanner;
public class PrincipalArchiAlumno {
	public static void main(String[] args) {
		int op,num;
		Scanner sc = new Scanner (System.in);
		ArchiAlumno AA = new ArchiAlumno("Alumno.dat");
		Alumno A= new Alumno();
		try
		{
			do
			{
				System.out.println("\n \t\tMENU ALUMNO ");
				System.out.println(" 1: ADICIONAR ALUMNO ");
				System.out.println(" 2: MOSTRAR ALUMNO ");
				System.out.println(" 3: CONSULTAR SEGUN COD ");
				System.out.println(" 4: CONSULTAR SOLO MUJERES ");
				System.out.println(" 5: ELIMINAR UN ALUMNO ");
				System.out.println(" 6: SALIR ");
				System.out.println(" Intro Opciones ");
				op = sc.nextInt();
				switch(op)
				{
				case 1: System.out.println("En Adicionar ");
					A.leer();
					AA.adicionarjcmq(A.obtcjcmq(), A.obtpjcmq(), A.obtmjcmq(), A.obtnjcmq(), A.obtsjcmq(), A.obtajcmq());
					break;
				case 2 :
					AA.mostrarjcmq();
					break;
				case 3: System.out.println("Intro cod a buscar ");
					num=sc.nextInt();
					AA.buscador(num);
					break;
				case 4: AA.consulmuj(0);
					break;
				case 5: System.out.println("intro cod a eliminar ");
					num=sc.nextInt();
					AA.eliminar(num);
					break;
				}
			}
			while(op<=5);
			System.out.println(" CHAUUU.... ");
		}
		catch(IOException e) {}

	}

}

package POO1;

public class Main {

	public static void main(String[] args) {
		Docente D = new Docente(987565,"mecanica");
		System.out.println("\n ***Docente***");
		D.mostrarmqjc();
		Vehiculo V=new Vehiculo();
		System.out.println("\n ***Vehiculo***");
		V.mostrarmqjc();
		Alumno A=new Alumno();
		System.out.println("\n ***Alumno***");
		A.mostrarmqjc();
		
	}

}

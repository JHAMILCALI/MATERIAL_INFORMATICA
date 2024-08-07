package POO1;
/*Escribir un POO para la siguiente jerarquia de la clase, compárarar
 * edades de un docente y alumno.
 */
public class MainPerDoc {

	public static void main(String[] args) {
		Docente D1 = new Docente();
		Docente D2 = new Docente(3435,"Carmen Hunca",1992,4321,"IA");
		Alumno A1 = new Alumno();
		Alumno A2 = new Alumno(6453,"Sandro Aro",2003,97654,456874);
		System.out.println("\nDOCENTES...\n");
		D1.mostrarmqcj();
		//D1.mostrar();
		D2.mostrarmqcj();
		System.out.println("\nALUMNOS..\n");
		A1.mostrarmqcj();
		//A1.mostrar();
		D2.mismaedadmqcj(A1);

	}

}

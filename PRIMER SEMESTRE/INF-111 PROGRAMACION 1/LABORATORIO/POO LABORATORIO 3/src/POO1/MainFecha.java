package POO1;
//Escriba la clase Fecha, realizar 4 funciones polimorficas para comparar Fecha, dia
//,dia y mes, dia, mes y año.
public class MainFecha {

	public static void main(String[] args) {
		Fechamqcj F1 = new Fechamqcj();
		Fechamqcj F2 = new Fechamqcj(13);
		Fechamqcj F3 = new Fechamqcj(10,4,2023);
		Fechamqcj F4 = new Fechamqcj(10,8);
		F1.comparamqcj(F2);
		F1.comparamqcj(10, 4, 2023);
		F1.comparamqcj(4, 4);

	}

}

package Template1;
/*Escribe el POO para el sigueinte UML (Clase contenedor)
 *usar plantillas
 */
public class MainContenedor {

	public static void main(String[] args) {
		Contenedor <Integer> C1 = new Contenedor <Integer>(10);
		Contenedor <Integer> C2 = new Contenedor <Integer>(10);
		C1.mostrarjcmq();
		C2.mostrarjcmq();
		C1.comparajcmq(C2);
		Contenedor <Double> C3 = new Contenedor <Double>(3.0);
		Contenedor <Double> C4 = new Contenedor <Double>(3.5);
		C3.mostrarjcmq();
		C4.mostrarjcmq();
		C3.comparajcmq(C4);

	}

}

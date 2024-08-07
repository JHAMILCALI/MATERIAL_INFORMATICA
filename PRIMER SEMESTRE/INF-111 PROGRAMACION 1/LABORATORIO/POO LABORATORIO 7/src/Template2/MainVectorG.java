package Template2;
/*Dado un VectorG, (Vectore- generalida), almacena de distintos de sistinto tipo
 *invertir el VectorG. ordenar el vectorG.
 */
public class MainVectorG {

	public static void main(String[] args) {
		VectorG <Integer> V1 = new VectorG<Integer>(new Integer(5),
							   new Integer(4), new Integer(8), new Integer(3),
							   new Integer(7));
		V1.mostrarjcmq();
		V1.intervenirjcmq();
		V1.mostrarjcmq();
		V1.ordenarjcmq();
		V1.mostrarjcmq();
		
		String a="limon", b="manzana", c="uva", d="platano", e="cereza";
		VectorG<String> V2 = new VectorG<String> (a, b, c, d, e);
		V2.mostrarjcmq();
		V2.intervenirjcmq();
		V2.mostrarjcmq();
		V2.ordenarjcmq();
		V2.mostrarjcmq();
		
		Double d1=0.25, d2=3.1415, d3=1.5, d4=2.15, d5=1.75;
		VectorG<Double> V3 = new VectorG<Double>(d1, d2, d3, d4, d5);
		V3.mostrarjcmq();
		V3.intervenirjcmq();
		V3.mostrarjcmq();
		V3.ordenarjcmq();
		V3.mostrarjcmq();
		
	}

}

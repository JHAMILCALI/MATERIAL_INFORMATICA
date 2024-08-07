package AGREGADO1;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente (12345,"Carmen Hurtado",71515);
		Empresa e1 = new Empresa ("Inst.America","Lande 123",c1);
		e1.mostrarjcmq();
		//poner los clientes 2
		e1.leerjcmq();
		e1.mostrarjcmq();
	}

}

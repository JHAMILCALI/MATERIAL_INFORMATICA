package AGREGADOejemplo1;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona(454546,"Maria",2000);
		Hombre h1 = new Hombre();
		Mujer m1 = new Mujer();
		p1.mostrar();
		p1.edad();
		System.out.println();
		p2.mostrar();
		p2.edad();
		System.out.println("***el Hombre *****");
		h1.mostrar();
		System.out.println("****Esposo de*****");
		m1.mostrar();
	}

}

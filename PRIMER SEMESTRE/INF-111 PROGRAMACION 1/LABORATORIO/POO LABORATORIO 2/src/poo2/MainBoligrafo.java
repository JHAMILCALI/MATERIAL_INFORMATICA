package poo2;

public class MainBoligrafo {

	public static void main(String[] args) {
		Boligrafo B1 = new Boligrafo();
		Boligrafo bd = new Boligrafo();
		bd.leer();
		B1.mostar();
		bd.mostar();
		B1.compararamarca(bd);
	}

}

package laboratorioPOO2;

public class MainAuto {

	public static void main(String[] args) {
		Auto A1=new Auto(2001);
		Auto A2=new Auto("RTY-543");
		Auto A3=new Auto("llk-656","Chevrolett",2020,"vagoneta");
		Auto A4=new Auto(1995,"hpo-987","daihatsu","jeep");
		
		A1.mostrar();
		A2.mostrar();
		A3.mostrar();
		A4.mostrar();
		
		System.out.println("la marca es:"+A2.obtm());
		A2.ponm("Toyota");
		A2.mostrar();
		
		A1.mismoaño(A3);
	}

}

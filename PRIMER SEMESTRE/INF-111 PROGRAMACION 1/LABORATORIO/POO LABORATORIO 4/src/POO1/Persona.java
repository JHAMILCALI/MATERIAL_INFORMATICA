	package POO1;
	
	public class Persona 
	{
		protected
			int cimqcj;
			String nommqcj;
			int fechamqcj;
		public
		Persona()
		{
			cimqcj=12345;
			nommqcj="Marcelo Aquipa";
			fechamqcj=1990;
		}
		Persona(int amqcj, String bmqcj,int cmqcj)
		{
			cimqcj=amqcj;
			nommqcj=bmqcj;
			fechamqcj=cmqcj;
		}
		int obtcmqcj()
		{
			return cimqcj;
		}
		String obtnmqcj()
		{
			return nommqcj;
		}
		int obtfmqcj()
		{
			return fechamqcj;
		}
		void poncmqcj(int amqcj)
		{
			cimqcj=amqcj;
		}
		void ponnmqcj(String amqcj)
		{
			nommqcj=amqcj;
		}
		void ponfmqcj(int amqcj)
		{
			fechamqcj=amqcj;
		}
		int edadmqcj()
		{
			return 2023-fechamqcj;
		}
		void leermqcj()
		{
			System.out.println("intro CI: ");
			cimqcj=Leer.datolnt();
			System.out.println("intro nombre: ");
			nommqcj=Leer.dato();
			System.out.println("intro fecha de nacimiento: ");
			fechamqcj=Leer.datolnt();
		}
		void mostrartmqcj()
		{
			System.out.println("\nci\tnombre\t\t\taño");
		}
		void mostrarmqcj()
		{
			System.out.println("\n"+cimqcj+"\t"+nommqcj+"\t\t"+fechamqcj);
		}
	}

package PERSISTENCIA1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class ArchiAlumno {
	private
	String nomarchjcmq="";
	public
	ArchiAlumno()
	{
		nomarchjcmq="";
	}
	ArchiAlumno(String xjcmq)
	{
		nomarchjcmq=xjcmq;
	}
	void adicionarjcmq(int ajcmq, String bjcmq, String cjcmq, String djcmq, int ejcmq, int fjcmq)throws IOException
	{
		DataOutputStream Archi = null;
		try
		{
			Archi = new DataOutputStream(new FileOutputStream("../"+nomarchjcmq,true));
			Archi.writeInt(ajcmq);
			Archi.writeUTF(bjcmq);
			Archi.writeUTF(cjcmq);
			Archi.writeUTF(djcmq);
			Archi.writeInt(ejcmq);
			Archi.writeInt(fjcmq);
			Archi.close();
		}
		catch(FileNotFoundException fnfe) {System.out.println("error "+fnfe);}
		catch (IOException ioe) {System.out.println("error 1"+ioe);}
	}
	void mostrarjcmq()throws IOException
	{
		DataInputStream Archi = null;
		try
		{
			Archi = new DataInputStream(new FileInputStream("../"+nomarchjcmq));
			System.out.println("COD\t PATER \tMater \tNOMBRE \tSEXO \tANAC");
			while(true)
			{
				Alumno A = new Alumno();
				A.poncjcmq(Archi.readInt());
				A.ponpjcmq(Archi.readUTF());
				A.ponmjcmq(Archi.readUTF());
				A.ponnjcmq(Archi.readUTF());
				A.ponsjcmq(Archi.readInt());
				A.ponajcmq(Archi.readInt());
				A.mostrarjcmq();
			}
		}
		catch(FileNotFoundException fnfe) {}
		catch (IOException ioe) {}
		Archi.close();
	}
	void buscador(int xjcmq) throws IOException
	{
		DataInputStream Archi = null;
		try
		{
			Archi = new DataInputStream(new FileInputStream("../"+nomarchjcmq));
			System.out.println("COD\t PATER \tMater \tNOMBRE \tSEXO \tANAC");
			while(true)
			{
				Alumno A = new Alumno();
				A.poncjcmq(Archi.readInt());
				A.ponpjcmq(Archi.readUTF());
				A.ponmjcmq(Archi.readUTF());
				A.ponnjcmq(Archi.readUTF());
				A.ponsjcmq(Archi.readInt());
				A.ponajcmq(Archi.readInt());
				if (A.obtcjcmq()==xjcmq) {
					A.mostrarjcmq();
				}
			}
		}
		catch(FileNotFoundException fnfe) {}
		catch (IOException ioe) {}
		Archi.close();
	}
	void consulmuj(int xjcmq) throws IOException
	{
		DataInputStream Archi = null;
		try
		{
			Archi = new DataInputStream(new FileInputStream("../"+nomarchjcmq));
			System.out.println("COD\tPATER \tMATER \tNOMBRE \tSEXO \tANAC");
			while(true)
			{
				Alumno A = new Alumno();
				A.poncjcmq(Archi.readInt());
				A.ponpjcmq(Archi.readUTF());
				A.ponmjcmq(Archi.readUTF());
				A.ponnjcmq(Archi.readUTF());
				A.ponsjcmq(Archi.readInt());
				A.ponajcmq(Archi.readInt());
				if (A.obtsjcmq()==xjcmq) {
					A.mostrarjcmq();
				}
			}
		}
		catch(FileNotFoundException fnfe) {}
		catch (IOException ioe) {}
		Archi.close();
	}
	void eliminar(int xjcmq) throws IOException
	{
		DataInputStream Archi = null;
		DataOutputStream ArchiTemp = null;
		try
		{
			ArchiTemp = new DataOutputStream(new FileOutputStream("../temporal2.dat",true));
			Archi = new DataInputStream (new FileInputStream("../"+nomarchjcmq));
			while (true) {
				Alumno A = new Alumno();
				A.poncjcmq(Archi.readInt());
				A.ponpjcmq(Archi.readUTF());
				A.ponmjcmq(Archi.readUTF());
				A.ponnjcmq(Archi.readUTF());
				A.ponsjcmq(Archi.readInt());
				A.ponajcmq(Archi.readInt());
				if (A.obtcjcmq()!=xjcmq) {
					ArchiTemp.writeInt(A.obtcjcmq());
					ArchiTemp.writeUTF(A.obtpjcmq());
					ArchiTemp.writeUTF(A.obtmjcmq());
					ArchiTemp.writeUTF(A.obtnjcmq());
					ArchiTemp.writeInt(A.obtsjcmq());
					ArchiTemp.writeInt(A.obtajcmq());
				}
			}
		}
		catch(FileNotFoundException fnfe) {}
		catch (IOException ioe) {}
		try
		{
			Archi.close();
			ArchiTemp.close();
			File file1 = new File("../"+nomarchjcmq);
			File file2 = new File("../temporal2.dat");
			if (file1.exists()) {
				file1.delete();
			}
			file2.renameTo(file1);
		}
		catch (IOException var)
		{
			System.out.println(" error ");
		}
	}
	void modificar(int xjcmq)throws IOException
	{
		
	}
	void varmayor()throws IOException
	{
		
	}
	
}

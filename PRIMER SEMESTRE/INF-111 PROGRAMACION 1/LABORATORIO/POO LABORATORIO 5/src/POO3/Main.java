package POO3;

public class Main 
{
    public static void main(String[] args)
    {
        Docente lisD=new Docente();
        Alumno lisA=new Alumno();
        Vehiculo lisV=new Vehiculo();
        System.out.println("***Docente***");
        lisD.mostrard();
        System.out.println("***Edad del Docente***");
        System.out.println(lisD.edad());
        System.out.println("***Alumno***");
        lisA.mostrara();
        System.out.println("***Edad del Alumno***");
        System.out.println(lisA.edad());
        System.out.println("***Vehiculo***");
        lisV.mostrar();
        System.out.println("***Antiguedad***");
        System.out.println(lisV.antiguedad());
    }
}
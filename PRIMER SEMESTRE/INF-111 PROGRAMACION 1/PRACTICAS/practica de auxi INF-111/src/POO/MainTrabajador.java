package POO;

public class MainTrabajador {

    public static void main(String[] args) {
        // a) Instanciar a 3 trabajadores
        Trabajador t1 = new Trabajador();
        Trabajador t2 = new Trabajador("Calixto", "Apaza", "Loza", 5000, "Cirujano");
        Trabajador t3 = new Trabajador("Alex", "Guarachi", "Quispe", 62545, "Administrador de empresas");

        // b) Mostrar a los 3 trabajadores
        System.out.println("Trabajador 1:");
        t1.mostrar();
        System.out.println("Trabajador 2:");
        t2.mostrar();
        System.out.println("Trabajador 3:");
        t3.mostrar();

        // c) Mostrar al Trabajador que más sueldo recibe
        Trabajador trabajadorConMayorSueldo = obtenerTrabajadorConMayorSueldo(t1, t2, t3);
        System.out.println("Trabajador con mayor sueldo:");
        trabajadorConMayorSueldo.mostrar();

        // d) Cambiar el área del trabajador 1 al área en la que se encuentra el trabajador 3
        String nuevaArea = t3.obtnar();
        t1.pona(nuevaArea);
        System.out.println("Trabajador 1 con nueva área:");
        t1.mostrar();
    }

    private static Trabajador obtenerTrabajadorConMayorSueldo(Trabajador... trabajadores) {
        Trabajador trabajadorConMayorSueldo = trabajadores[0];

        for (int i = 1; i < trabajadores.length; i++) {
            if (trabajadores[i].obtns() > trabajadorConMayorSueldo.obtns()) {
                trabajadorConMayorSueldo = trabajadores[i];
            }
        }

        return trabajadorConMayorSueldo;
    }
}
package POO3;

public class Alumno extends Persona
{
    private
            int lismatriculajcmq;
    public
            Alumno()
            {
                liscijcmq=12314134;
                lisnomjcmq="Pedro";
                lisfechanjcmq=2005;
                lismatriculajcmq=123141;
            }
            Alumno(int ajcmq,String bjcmq,int cjcmq,int djcmq)
            {
                liscijcmq=ajcmq;
                lisnomjcmq=bjcmq;
                lisfechanjcmq=cjcmq;
                lismatriculajcmq=djcmq;
            }

            public int edad() {
                return 2023-lisfechanjcmq;
            }
            void mostrara()
            {
                System.out.println("ci:"+liscijcmq+":nombre:"+lisnomjcmq+":Fecha Nac.:"+lisfechanjcmq);
                System.out.println("Matricula:"+lismatriculajcmq);
            }
    
}
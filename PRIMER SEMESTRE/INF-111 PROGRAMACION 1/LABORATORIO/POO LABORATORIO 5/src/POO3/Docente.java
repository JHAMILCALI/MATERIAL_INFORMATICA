package POO3;

public class Docente extends Persona
{
    private
            int lisitemjcmq;
            String lisespecialidadjcmq;
    public
            Docente()
            {
               liscijcmq=1231243134;
               lisnomjcmq="Sandra";
               lisfechanjcmq=2009;
               lisitemjcmq=123;
               lisespecialidadjcmq="Sistemas";
            }
            Docente(int ajcmq,String bjcmq,int cjcmq,int djcmq,String ejcmq)
            {
                liscijcmq=ajcmq;
                lisnomjcmq=bjcmq;
                lisfechanjcmq=cjcmq;
                lisitemjcmq=djcmq;
                lisespecialidadjcmq=ejcmq;
            }
            public int edad() {
                return 2023-lisfechanjcmq;
            }
            void mostrard()
            {
                System.out.println("ci:"+liscijcmq+":nombre:"+lisnomjcmq+":Fecha Nac.:"+lisfechanjcmq);
                System.out.println("Item:"+lisitemjcmq+":Especialidad:"+lisespecialidadjcmq);
            }
    
}
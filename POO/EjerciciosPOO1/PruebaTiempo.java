
import java.util.ArrayList;
import java.util.Collections;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(0,30,40);
        Tiempo t2 = new Tiempo(0,35,20);
        Tiempo t3 = new Tiempo(1,20,12);
        Tiempo t4 = new Tiempo(1,10,59);
        
        ArrayList<Tiempo> lista = new ArrayList<>();

        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);
        
        for (Tiempo tiempo : lista) {
            System.out.println(tiempo);
        }

        Collections.sort(lista);
        System.out.println();
        
        for (Tiempo tiempo : lista) {
            System.out.println(tiempo);
        }


        /* 
        System.out.println(t);

        t.suma(new Tiempo(0,35,20)); // Para crear un tiempo sin guardarlo. Tiempo t2 = new Timpo(...);

        System.out.println(t);
        
        t.resta(new Tiempo(0,35,20));

        System.out.println(t);
        */
    }
}

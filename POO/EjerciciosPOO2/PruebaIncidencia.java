
import java.util.ArrayList;
import java.util.Collections;

public class PruebaIncidencia {
    public static void main(String[] args) {
        ArrayList<Incidencia> lista = new ArrayList<>();

        Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet",4);
        Incidencia inc2 = new Incidencia(14, "No arranca",2);
        Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa",5);
        Incidencia inc4 = new Incidencia(237, "Hace un ruido extraño",1);
        Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas",3);
        lista.add(inc1);
        lista.add(inc2);
        lista.add(inc3);
        lista.add(inc4);
        lista.add(inc5);
        inc2.resuelve("El equipo no estaba enchufado");
        inc3.resuelve("Cambio del cable VGA");
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
        Collections.sort(lista);
        
        for (Incidencia incidencia : lista) {
            System.out.println(incidencia);
        }
    }
   
}

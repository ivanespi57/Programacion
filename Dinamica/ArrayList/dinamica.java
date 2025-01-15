
import java.util.ArrayList;
import java.util.Collections;

public class dinamica {
    public static void main(String[] args) {
        
        ArrayList<String> diasSemana = new ArrayList<String>(); // El segundo String no hace falta
        ArrayList<Integer> numeros = new ArrayList<Integer>(); // El segundo Integer no hace falta

        // String s = "7";

        //diasSemana.add(s);

        diasSemana.add("lunes");
        diasSemana.add("martes");
        diasSemana.add("miercoles");
        diasSemana.add("jueves");
        diasSemana.add("viernes");
        diasSemana.add("sabado");
        diasSemana.add("domingo");

        System.out.println(diasSemana.get(3));

        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));    
        }
        
        Collections.sort(diasSemana); // ordenar por orden alfabetico los dias de la semana 
        
        for (String s : diasSemana) {
            System.out.println(s);
        }

        
    }
}

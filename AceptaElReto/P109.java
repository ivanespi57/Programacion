
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String s = sc.nextLine();
        String[] d;
        String e1;
        String e2;
        int set1;
        int set2;
        int ptos1 = 0;
        int ptos2 = 0;
           
        while (!s.equals("FIN")){
            HashMap<String, Integer> clasificacion = new HashMap<>();
            String partido = sc.nextLine();
            int pj = 0;
            
            while (!partido.equals("FIN")){
                pj++;
                d = partido.split(" ");
                e1 = d[0];
                e2 = d[2];
                set1 = Integer.valueOf(d[1]);
                set2 = Integer.valueOf(d[3]);

                if (set1 > set2){
                    ptos1 = 2;
                    ptos2 = 1;
                }else{
                    ptos1 = 1;
                    ptos2 = 2;
                }

                if (clasificacion.containsKey(e1)) {

                    int valor1 = clasificacion.get(e1);
                    clasificacion.put(e1, valor1 + ptos1);

                }else{
                    clasificacion.put(e1, ptos1);
                }
                if (clasificacion.containsKey(e2)) {

                    int valor2 = clasificacion.get(e2);
                    clasificacion.put(e2, valor2 + ptos2);

                }else{
                    clasificacion.put(e2, ptos2);
                }

                partido = sc.nextLine();
            }
            

            String ganador = "";
            Integer ptosMayor = 0;

            for (Map.Entry<String,Integer> mapa : clasificacion.entrySet()) {
                String equipo = mapa.getKey();
                Integer puntuacion = mapa.getValue();
                if (puntuacion == ptosMayor){
                    ganador = "EMPATE";
                }
                if (puntuacion > ptosMayor){
                    ganador = equipo;
                    ptosMayor = puntuacion;
                }
            }
            int faltantes = (clasificacion.size() - 1) * clasificacion.size() - pj;

            System.out.println(ganador + " " + faltantes);

            s = sc.nextLine();
        }
    }
}

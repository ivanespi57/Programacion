
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votos = sc.nextInt();

        while(votos != 0) {
            sc.nextLine();

            HashMap<String, Integer> mapa1 = new HashMap<>();
            HashMap<String, Integer> mapa2 = new HashMap<>();

            for (int i = 0; i < votos; i++) {
                String falla = sc.next();

                if (falla.charAt(0) > 95){
                    Integer m1 = mapa1.get(falla);

                    if (m1 == null){
                        mapa1.put(falla, 1);
                    }else{
                        mapa1.put(falla, m1+1);
                    }
                }else{
                    Integer m2 = mapa2.get(falla);

                    if (m2 == null){
                        mapa2.put(falla, 1);
                    }else{
                        mapa2.put(falla, m2+1);
                    }
                }
            }
            

            String solinf = "";
            int mayor = 0;

            for(Map.Entry<String,Integer> linea : mapa1.entrySet()){
                
                if (mayor == linea.getValue()){
                    solinf = "empate";
                }else if(mayor < linea.getValue()){
                    solinf = linea.getKey();
                    mayor = linea.getValue();
                }
            }

            String solmay = "";
            int mayor2 = 0;

            for(Map.Entry<String,Integer> linea : mapa2.entrySet()){
                
                if (mayor2 == linea.getValue()){
                    solmay = "EMPATE";
                }else if(mayor2 < linea.getValue()){
                    solmay = linea.getKey();
                    mayor2 = linea.getValue();
                }
            }
            System.out.println(solinf + " "+ solmay);

            votos = sc.nextInt();
        }
    }
}

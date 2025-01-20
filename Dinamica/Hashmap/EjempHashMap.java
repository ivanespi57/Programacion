
import java.util.ArrayList;
import java.util.HashMap;

public class EjempHashMap {
    public static void main(String[] args) {
        
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        HashMap<String,ArrayList<Integer>> vecinos = new HashMap<>();

        ArrayList<Integer> puertas1 = new ArrayList<Integer>();

        puertas1.add(1);
        puertas1.add(2);
        puertas1.add(3);
        puertas1.add(4);

        vecinos.put("Primero",puertas1);

        ArrayList<Integer> puertas2 = new ArrayList<Integer>();

        puertas2.add(5);
        puertas2.add(6);
        puertas2.add(7);

        vecinos.put("Segundo",puertas2);

        ArrayList<Integer> puertas3 = new ArrayList<Integer>();
        
        puertas3.add(8);
        puertas3.add(9);
        puertas3.add(10);
        puertas3.add(11);
        puertas3.add(12);
        puertas3.add(13);
        puertas3.add(14);

        vecinos.put("Tercero",puertas3);

        ArrayList<Integer> puertas4 = new ArrayList<Integer>();
        
        puertas4.add(15);

        vecinos.put("Cuarto",puertas4);

        System.out.println(vecinos.toString());
        
        for (HashMap.Entry<String,ArrayList<Integer>> mapa : vecinos.entrySet()) {
            
            System.out.println(mapa.getKey() + ": " + mapa.getValue());
            System.out.println(mapa);

        }
            
        
        
        /* 
        hm.put(3,"hola");
        hm.put(2, "adios");
        hm.put(8, "bienvenida");
        hm.put(1, "salir");

        for (Map.Entry<Integer,String> mapa : hm.entrySet()) {
            if (mapa.getValue().equals("adios")){

                hm.put(mapa.getKey(), "hola");
            }
            // System.out.println(mapa.getKey() + " - " + mapa.getValue());
        }

        System.out.println(hm.toString());
        */
    }
}


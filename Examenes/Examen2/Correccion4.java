import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Correccion4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int nprediccion = sc.nextInt();

        while (nprediccion != 0) {

            TreeMap<Integer,Integer> periodos = new TreeMap<>();

            for (int i = 0; i < nprediccion; i++) {
                int anyo = sc.nextInt();
                int periodo = sc.nextInt();
                Integer v = periodos.get(anyo);
                if ( v == null ||   //Si no existe, la añado 
                     periodo > v){  //Si existe y el periodo es mayor, lo cambio

                    periodos.put(anyo,periodo);

                }
            }

            Integer invierno = periodos.firstKey();

            for (Map.Entry<Integer, Integer> entrada : periodos.entrySet()){
                int ini = entrada.getKey();
                int fin = ini + entrada.getValue();
                if (ini <= invierno && invierno <= fin){
                    invierno = fin + 1;
                }
            }

            System.out.println(invierno);


            nprediccion = sc.nextInt();
            
        }
        
    }
}

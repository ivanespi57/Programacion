import java.util.Scanner;
import java.util.TreeSet;

public class Correccion3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        while (sc.hasNext()){

            String[] palabras = sc.nextLine().split(" ");

            TreeSet<String> datos = new TreeSet<>();

            for (int i = 0; i < palabras.length; i++) {
                String p = palabras[i].toLowerCase();
                datos.add(p);  
            }

            //System.out.println(datos.toString());

            System.out.println(datos.size());
            
        }
            
        
    }
}

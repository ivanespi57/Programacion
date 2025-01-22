import java.util.HashSet;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashSet<String> hash = new HashSet<String>();
        
        int contador;
        String f;
        String min;
        
        while (sc.hasNext()){
            
            f = sc.nextLine();
            min = f.toLowerCase();
            String[] e = min.split(" ");
            contador = 0;

            for (int i = 0; i < e.length; i++) {
                String rep = e[i];
                if (hash.add(rep)){
                    contador++;
                }
            }
            System.out.println(contador);
            
            

        }
            
    }
}


import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class CorreccionEj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pok1 = sc.nextInt();
        int pok2 = sc.nextInt();

        while (pok1 != 0 && pok2 != 0){
            sc.nextLine();

            ArrayList<String> lista1 = new ArrayList<>();
            ArrayList<String> lista2 = new ArrayList<>();

            TreeSet<String> repe1 = new TreeSet<>();
            TreeSet<String> repe2 = new TreeSet<>();


            for (int i = 0; i < pok1; i++) {
                String carta = sc.next();
                
                if(lista1.contains(carta)){
                    repe1.add(carta);
                }else{
                    lista1.add(carta);
                }
            }
            for (int i = 0; i < pok2; i++) {
                String carta = sc.next();
                
                if(lista2.contains(carta)){
                    repe2.add(carta);
                }else{
                    lista2.add(carta);
                }
            }
            int cartas1 = 0;
            
            for (String c1 : repe1) {
                if (!lista2.contains(c1)){
                    cartas1++;
                }
            }

            int cartas2 = 0;
            
            for (String c2 : repe2) {
                if (!lista1.contains(c2)){
                    cartas2++;
                }
            }

            System.out.println(Math.min(cartas1, cartas2));

            pok1 = sc.nextInt();
            pok2 = sc.nextInt();
        }
    }
}

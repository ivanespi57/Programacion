
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nparejas = sc.nextInt();
        int p;
        int t;

        while (nparejas != 0){

            ArrayList<Pareja> lista = new ArrayList<Pareja>();

            for (int i = 0; i < nparejas; i++) {
                p = sc.nextInt();
                t = sc.nextInt();

                Pareja par = new Pareja(p,t);

                lista.add(par);
            }
            Collections.sort(lista);

            for (Pareja pareja : lista) {
                System.out.println(pareja);
            }
            System.out.println("---");
            
            nparejas = sc.nextInt();
        }
    }
}

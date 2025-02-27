
import java.util.Scanner;

public class Ej2_Patxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carteles = Integer.valueOf(sc.next());

        while(carteles != 0){

            String mejor = "";
            int mayor_recomp = 0;
            int peor_punteria = 10;

            for (int i = 0; i < carteles; i++) {
                String nombre = sc.next();
                int recomp = Integer.parseInt(sc.next());
                int punteria = Integer.parseInt(sc.next());
                
                if (recomp > mayor_recomp || (recomp == mayor_recomp && peor_punteria > punteria)) {
                    mejor = nombre;
                    mayor_recomp = recomp;
                    peor_punteria = punteria;
                }
            }

            System.out.println(mejor);
            carteles = Integer.valueOf(sc.next());
        }
    }
}

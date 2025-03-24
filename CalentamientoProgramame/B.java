
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ncamp = sc.nextInt();

        while(ncamp != 0){
            int suma = 0;

            for (int i = 0; i < ncamp; i++) {
                int aves = sc.nextInt();
                int anillas = sc.nextInt();
                
                suma += aves - anillas;
            }
            System.out.println(suma);
            
            ncamp = sc.nextInt();
        }
    }
}

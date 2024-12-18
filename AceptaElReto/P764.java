
import java.util.Scanner;

public class P764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos;
        int aves ;
        int anilla;
        int suma;
        
        casos = sc.nextInt();
        
        while (casos != 0) { 
            suma = 0;

            for (int i = 0; i < casos; i++) {
                aves = sc.nextInt();
                anilla = sc.nextInt();
                
                suma = suma + (aves - anilla);
            }
            System.out.println(suma);
            casos = sc.nextInt();
        } 
        
    }
}

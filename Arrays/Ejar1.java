
import java.util.Scanner;

public class Ejar1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];

        //introduce los datos de posición
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Dime el número %d: ",(i+1));
            
            x[i] = sc.nextInt();
        }
        //introduce los datos de posición descendentemente
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.println("El valor de la posición "+i+" es "+x[i]);
            
        }
    }
    
}

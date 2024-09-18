
import java.util.Scanner;

public class Ampliado1 {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        
        System.out.printf("Introduce el primer número: ");
        x = sc.nextInt();
        System.out.printf("Introduce el segundo número: ");
        y = sc.nextInt();

       
        int suma = x + y;
        int resta = x - y;
        double div = x /(double) y;
        int prod = x * y;

        System.out.printf("Suma: %d \nResta: %d \nDivisión: %.2f\nMultiplicación: %d\n", suma, resta, div, prod);



    }
}

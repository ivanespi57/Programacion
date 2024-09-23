
import java.util.Scanner;

public class Avanzado3 {
    
    public static void main(String[] args) {
        double x1;
        double x2;
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        a = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        b = sc.nextDouble();
        System.out.print("Introduce el tercer número: ");
        c = sc.nextDouble();
        
        x1 = (-b + Math.sqrt(b * b - 4 * a * c))/ (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * a * c))/ (2 * a);
        System.out.printf("x1 = %.2f \nx2 = %.2f\n", x1, x2 );



    }
}

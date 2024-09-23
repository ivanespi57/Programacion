
import java.util.Scanner;

public class Avanzado1 {

    public static void main(String[] args) {
        double num1;
        double num2;
        double media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1 = sc.nextDouble();
        System.out.println("Introduce otro número: ");
        num2 = sc.nextDouble();
        media = (num1 + num2) / 2;
        System.out.println("Tu media aritmética es: " + media);
    }
    
}

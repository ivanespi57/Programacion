
import java.util.Scanner;



public class algo1 {
    public static void main(String[] args) {
       
        int num1;
        int num2;
        int res;
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("Escribe un número mayor que 0 ");
            num1 = sc.nextInt();
        } while (num1 <= 0 );

        do { 
            System.out.println("Escribe otro número mayor que 0 ");
            num2 = sc.nextInt();
        } while (num2 <= 0 );

        res = num1 % num2;

        if (res == 0) {
            // SI se cumple
            System.out.printf("%d es múltiplo de %d \n" ,num1, num2);

        } else {
            System.out.printf("%d no es múltiplo de %d \n" ,num1, num2);

        }
        
    }
}

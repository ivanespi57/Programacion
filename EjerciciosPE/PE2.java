import java.util.Scanner;

public class PE2 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int base;
        int exp;
        int pot = 1;

        System.out.println("Introduce la base: ");
        base = sc.nextInt();
        System.out.println("Introduce el exponente: ");
        exp = sc.nextInt();

        for (int i = 1; i <= exp; i++){
           pot = pot * base;
        }
        System.out.println(pot);
    }
    
}

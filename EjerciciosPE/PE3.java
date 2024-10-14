
import java.util.Scanner;

public class PE3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int div = 0;
        int dig = 0;

        System.out.println("Introduce un número que tenga máximo 6 dígitos: ");
        n = sc.nextInt();

        int num = n;
        
        if (n < -1000000 || n > 1000000 ){
            System.out.println("Número inválido");
        }else{

            do {
                div = n / 10;
                
                if (div != 0) {
                    dig++;
                    n = div;
                } 
                    
            } while ( div != 0);
        
    
            System.out.printf("El número %d tiene %d dígitos\n", num, dig + 1);
        }
        
    } 
}
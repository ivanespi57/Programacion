
import java.util.Scanner;

public class PE5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Introduce un número positivo: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            
            for (int j = i; j <= n; j++){
                System.out.println("Par (" +i+ "," +j+ "): " +i+ "+" +j+ "+" +i+ "*" +j+ " vale " +(i+j+i*j));
            }
        }
    }
    
}

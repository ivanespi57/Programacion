
import java.util.Scanner;

public class P663 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos;
        int f = 0;
        
        casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            f = sc.nextInt();
            
            if (f >= 0){
                f--;
            }
            System.out.println(f);
        }  
        
        
    }
    
}

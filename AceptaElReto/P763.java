
import java.util.Scanner;

public class P763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < casos; i++) {
            
            String text = sc.nextLine();

            if (text.toLowerCase().equals("colgadas")){
                System.out.println("Bien");
                
            }else{
                System.out.println("Mal");
            }
        }
    }
}

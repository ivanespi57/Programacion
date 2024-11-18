
import java.util.Scanner;

public class P467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c;
        c = sc.nextInt();
        String s;
        
        for (int i = 0; i < c; i++) {
            s = sc.nextLine();
            String[] separa = s.split(" ");
            String smin = s.toLowerCase();
            if (separa[0].equals(separa[2])){
                System.out.println("TAUTOLOGÍA");
            }
            
        }

    }
    
}

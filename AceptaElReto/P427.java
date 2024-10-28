
import java.util.Scanner;

public class P427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c;
        c = sc.nextInt();
        sc.nextLine();
        String paren = "";
        String persona = "";

        for (int i = 0; i < c; i++) {
            persona = sc.next();
            paren = sc.next();
            String persec = "Luke";
            String parensec = "padre";

            if (persona.equals(persec) && paren.equals(parensec)){
                System.out.println("TOP SECRET");
            }else{
                System.out.println(persona + ", yo soy tu "+ paren);
            }
        }
    }
}

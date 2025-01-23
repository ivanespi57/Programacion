import java.util.Scanner;

public class Correccion1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int palabras = sc.nextInt(); sc.nextLine();

        while (palabras != 0) {

            boolean trampa =  false;

            for (int i = 0; i < palabras; i++) {
                String p = sc.next().toLowerCase();
                if (p.equals("ai") || p.equals("ia")){
                    trampa =  true;
                }
            }

            if (trampa){
                System.out.println("TRAMPA");
            }else{
                System.out.println("LEGAL");
            }

            palabras = sc.nextInt();
            
        }
        
    }
}

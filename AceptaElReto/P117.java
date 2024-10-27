
import java.util.Scanner;

public class P117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // estructura para un caso concreto de casos
        int casos = sc.nextInt();
        sc.nextLine(); //salto de linea
        for (int i = 0; i < casos; i++){
            String s = sc.nextLine();

            String nombre = s.substring(4);
            System.out.println("Hola, "+nombre+".");
        }
    }
}

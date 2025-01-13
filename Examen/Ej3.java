
import java.util.Scanner;

public class Ej3 {
    
    public static int minutos(String t){
        
        String[] p = t.split(":");
        int h = Integer.parseInt(p[0]) * 60;
        int min = Integer.parseInt(p[1]);

        return h + min;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos;
        int can;
        int t;

        casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            can = sc.nextInt();
            t = sc.nextInt();
        }
    }
}

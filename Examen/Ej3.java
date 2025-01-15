
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
        String t;
        int[] canalestv = new int[11];
        casos = sc.nextInt();
        int total = 0;
        int minsTotales = 0;
        
        for (int i = 0; i < casos; i++) {
            can = sc.nextInt();
            t = sc.nextLine();
            String min = sc.next();

            int m = minutos(min);

            canalestv[can] += m;

            minsTotales += m;

        }
        int cadenaMasVista = 0;
        int minutosCadenasMasVista = 0;

        for (int i = 1; i <= 10; i++) {
            if (canalestv[i] > minutosCadenasMasVista)
                cadenaMasVista = i;
                minutosCadenasMasVista = canalestv[i];
        }
        int cuotapantalla = (minutosCadenasMasVista * 100) / minsTotales;

        System.out.println(cadenaMasVista + " " + cuotapantalla);
    }
}


import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = sc.nextInt();
        int c = sc.nextInt();

        while (f != 0 && c != 0){
            sc.nextLine();

            int he = 0;
            int co = 0;
            int ar = 0;
            int mi = 0;

            char[][] m = new char[f][c];

            for (int i = 0; i < f; i++) {
                String fila = sc.nextLine();

                for (int j = 0; j < c; j++) {
                    m[i][j] = fila.charAt(j);

                }
            }

            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    switch (m[i][j] ) {
                        case 'A' : ar++; break;

                        case 'M' : mi++; break;

                        case 'H' : he++; break;

                        case 'C' : co++; break;
                        
                    }      
                }    
            }

            System.out.printf("%d %d %d %d\n",he,co,mi,ar);

            f = sc.nextInt();
            c = sc.nextInt();
        }
    }
}

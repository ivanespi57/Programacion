import java.util.Scanner;
public class P664 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int puentes;
        int c;
        int alt;
        

        do {
            puentes = sc.nextInt();
            //int[] peq = new int[puentes];
            int peq = 100;
            for (int i = 1; i <= puentes; i++) {
                c = sc.nextInt();
                int mayor = 0;

                for (int j = 1; j <= c; j++) {
                    alt = sc.nextInt();
                   
                    if (alt > mayor){
                        mayor = alt;
                    }
                }
                //peq[i] = mayor;
                if (mayor < peq){
                    peq = mayor;
                }
            }
        }while (puentes != 0);
        

    }
    
}

import java.util.Scanner;

public class P376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alturas = sc.nextInt();

        while (alturas != 0) {

            int [] mr = new int [alturas];

            for (int i = 0; i < alturas;i++){
                mr[i] = sc.nextInt();
            }
            int picos = 0;

            //Compruebo si la primera altura es un pico
            if (mr[0] > mr[1] && mr[0] > mr[alturas-1]){
                picos++;
            }
            if (mr[alturas-1] > mr[alturas-2] && mr[alturas-1] > mr[0]){
                picos++;
            }
            for (int i = 1; i < alturas-1;i++){
                
                if (mr[i] > mr[i-1] && mr[i] > mr[i+1]){
                    picos++;
                }
            }
            System.out.println(picos);
            alturas = sc.nextInt();
        }
    }
}

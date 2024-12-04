import java.util.Scanner;

public class P472 {

    public static boolean esApta(int subidaMax, int[] cotas) {
        boolean apto = true;
        int cota = cotas[0]; // Inicializa con el primer elemento
        int desnivel = 0;

        for (int i = 1; i < cotas.length; i++) { // Comienza desde el segundo elemento
            if (cota < cotas[i]) {
                desnivel += cotas[i] - cota;
            } else {
                desnivel = 0; // Reinicia el desnivel si hay una bajada
            }

            cota = cotas[i];

            if (desnivel > subidaMax) {
                apto = false;
            }
        }

        return apto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
            while (sc.hasNext()) {
                int subidamax = sc.nextInt();
                int ncotas = sc.nextInt();

                int[] cotas = new int[ncotas];
                for (int i = 0; i < ncotas; i++) {
                    cotas[i] = sc.nextInt();
                }

                if (esApta(subidamax, cotas)) { 
                    System.out.println("APTA");
                } else {
                    System.out.println("NO APTA");
                }
            }
        }
    }


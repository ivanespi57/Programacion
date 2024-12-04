import java.util.Scanner;

public class P411 {

    public static int calculosEle(int pesoMax, String[] pesos) {
        int e = 0;
        int sum = 0;
        int i = 0;
        boolean cont = true;
    
        do {
            int peso = Integer.parseInt(pesos[i]);
            if (peso == 0 || sum + peso > pesoMax) {
                cont = false;
            } else {
                sum += peso;
                e++;
            }
            i++;
            
        } while (i < pesos.length && cont);
    
        return e;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pesoMax;
    
        do {
            pesoMax= sc.nextInt();
            
            if (pesoMax != 0) {
                sc.nextLine(); 

                String[] pesos = sc.nextLine().split(" ");

                int numEle = calculaNumEle(pesoMax, pesos);

                System.out.println(numEle);
            }
        } while (pesoMax != 0);
    
    } 
}
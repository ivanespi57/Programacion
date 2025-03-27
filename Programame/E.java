import java.util.Scanner;
public class E {

    public static boolean esPrimo(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int ncasos = sc.nextInt();
                
        for (int i = 0; i < ncasos; i++) {
            int suma = 0;
            int primo = 0;
            boolean orden = true;
                
            int num = sc.nextInt();

            int primer = 0;

            for(int j = 1; j <= num; j++){
                String sg = sc.next();
                int sig = Integer.valueOf(sg);       

                if(esPrimo(sig)){
                    primo++;
                }

                if (primer > sig) { 
                    orden = false;
                }

                suma += sig;

                primer =sig;

            }

            if (suma < 100 && orden == true && primo > 0) {
                    System.out.println("VALIDO");
                } else {
                    System.out.println("INVALIDO");
                }
            }
    }
}

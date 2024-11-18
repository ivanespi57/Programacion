import java.util.Scanner;

public class P171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int picos = sc.nextInt();

        while (picos != 0){
            
            int[] c = new int[picos];

            for (int i = 0; i < picos; i++) {
                c[i] = sc.nextInt();
            }
            
            int ab = 1;
            int altmax = c[picos-1];

            for (int i = picos-2; i >= 0; i--){
                if (c[i] >  altmax){
                    ab++;
                    altmax = c[i];
                }
            }
            
            
            System.out.println(ab);
            picos = sc.nextInt();
        }
    }
    
}


import java.util.Scanner;

public class P140 {
    public static String calculo (int n){
        
        String s = String.valueOf(n);
        String sol = "";
        int suma = 0;

        for (int i = 0; i < s.length()-1; i++) {
            int a = Integer.parseInt(s.substring(i, i+1));
            suma += a;
            sol = sol + a +" + ";
        }
        suma += Integer.parseInt(s.substring(s.length()-1));
        sol = sol + s.substring(s.length()-1) +" = "+ suma;

        return sol;

    }
   
   
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        while (n >= 0){
            String sol = calculo(n);

            System.out.println(sol);

            n = sc.nextInt();
        }
    }
    
}

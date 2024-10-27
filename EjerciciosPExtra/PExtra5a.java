import java.util.Scanner;

public class PExtra5a {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Lineas del triángulo: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
        }
       
        
    }
}
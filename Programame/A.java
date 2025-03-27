import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int d = 0;
        int r = 0;

        for(int i = 0; i < c; i++){
            int m = sc.nextInt();
            int e = sc.nextInt();

            d = m / e;
            r = m % e;

            System.out.println(d + " " + r);
        }
    }
}
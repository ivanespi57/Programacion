
import java.util.Scanner;

public class Ampliado2 {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int a ;
        int b ;
        int c ;

        System.out.printf("Introduce el primer número: ");
        a = sc.nextInt();
        System.out.printf("Introduce el segundo número: ");
        b = sc.nextInt();
        System.out.printf("Introduce el tercer número: ");
        c = sc.nextInt();
        
        int calculo1A;
        double calculo2A;

        calculo1A = ((int)a - b + c);
        calculo2A = (a - b + c);

        System.out.println("a - b + c = "+(a - b + c)+ "\ncalculo1A = "+calculo1A+"\ncalculo2A = "+calculo2A);

        int calculo1B;
        double calculo2B;

        calculo1B = ((int)a % c + 3 * ((int)a - c));
        calculo2B = (a % c + 3 * (a - c));

        System.out.println("(a % c + 3 * (a - c)) = "+(a % c + 3 * (a - c))+ "\ncalculo1B = "+calculo1B+"\ncalculo2B = "+calculo2B);
        
        int calculo1C;
        double calculo2C;

        calculo1C = (((int)a - 3 * b) - (c + 2 * (int)a));
        calculo2C = ((a - 3 * b) - (c + 2 * a));

        System.out.println("((a - 3 * b) - (c + 2 * a)) = "+((a - 3 * b) - (c + 2 * a))+ "\ncalculo1C = "+calculo1C+"\ncalculo2C = "+calculo2C);








    }
}

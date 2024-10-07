
import java.util.Scanner;


public class secue1 {
    public static void main(String[] args) {
        int edad ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        edad = sc.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
    }    
}

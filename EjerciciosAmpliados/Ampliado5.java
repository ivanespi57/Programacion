
import java.util.Scanner;

public class Ampliado5 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido1;
        String apellido2;
        int total;

        System.out.println("Dime tu nombre ");
        nombre = sc.nextLine();
        
        System.out.println("Dime el primer apellido: ");
        apellido1 = sc.nextLine();
        
        System.out.println("Dime el segundo apellido: ");
        apellido2 = sc.nextLine();
        
        total = nombre.length() + apellido1.length() + apellido2.length();
        System.out.println(total);

    }



}

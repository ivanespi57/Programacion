
import java.util.Scanner;

public class Ampliado6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nombre;
        String[] espacios;
        
        
        System.out.println("Dime tu nombre completo: ");
        nombre = sc.nextLine();

        espacios = nombre.split(" ",3);

        String n = espacios[0];
        String ape1 = espacios[1];
        String ape2 = espacios[2];
        
        int nom = espacios[0].length();
        int apellido1 = espacios[1].length();
        int apellido2 = espacios[2].length();


        System.out.printf("%s = %d\n%s = %d\n%s = %d\n", n, nom, ape1, apellido1, ape2, apellido2);


    }
    
}

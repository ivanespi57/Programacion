
import java.util.Scanner;

public class MenuPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el nombre");
        String n1 = sc.nextLine();
        System.out.println("Dime la edad");
        int e1 = sc.nextInt();
        System.out.println("Dime el sexo (M-H):");
        char s1 = sc.next().charAt(0);
        System.out.println("Dime el peso");
        double peso1 = sc.nextDouble();
        System.out.println("Dime la altura");
        double alt1 = sc.nextDouble();

        Persona p1 = new Persona(n1, e1, s1, peso1, alt1);
        sc.nextLine();

        System.out.println("Dime el nombre");
        String n2 = sc.nextLine();
        System.out.println("Dime la edad");
        int e2 = sc.nextInt();
        System.out.println("Dime el sexo (M-H):");
        char s2 = sc.next().charAt(0);

        Persona p2 = new Persona(n2, e2, s2);
        sc.nextLine();

        Persona p3 = new Persona();
        p3.setNombre("Ismael");
        p3.setEdad(15);
        p3.generaDni();
        p3.setSexo('H');
        p3.setPeso(70.2);
        p3.setAltura(1.74);

        
    }
}


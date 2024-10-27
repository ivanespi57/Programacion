import java.util.Scanner;

public class PExtra6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = (int) (Math.random() * 100) + 1;
        int intentos = 1;
        int usu;

        System.out.println();
        System.out.println("El ordenador a pensado un número del 1 al 100, adivina cual és.");
        System.out.println("Tienes 6 oportunidades.");

        do {
            
            System.out.print(intentos + " intento: ");
            usu = sc.nextInt();

            if (n == usu){
                System.out.println("Has acertado");
                System.exit(0);
            }else{
                intentos++;
            }
            if (usu < n){
                System.out.println("Es mayor");
            }else {
                System.out.println("Es menor");
            }

        }while(intentos != 7);

        System.out.println("El número era: " + n);
    }
}
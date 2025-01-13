
import java.util.Scanner;

public class GenerarPassword {
    
    public static int generaAleatorio(int min, int max) {
        
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static String generaPassword(int longi){

        char caracter;
        String password = "";

        for (int i = 0; i < longi; i++) {
            int tipo = generaAleatorio(1, 3);

            switch (tipo){
                case 1:
                    caracter = (char) generaAleatorio('A', 'Z');
                    break;
                case 2:
                    caracter = (char) generaAleatorio('a', 'z');
                    break;
                case 3:
                    caracter = (char) generaAleatorio('0', '9');
                    break;

            }
        }
        return password;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int longi;

        System.out.println("Introduce la longitud");
        longi = sc.nextInt();

        String password = generaPassword(longi);

        System.out.println("El password generado es ·" + password);
    }
}

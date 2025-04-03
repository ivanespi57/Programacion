
import java.util.Scanner;

public class Uno{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String caso;

        while (sc.hasNext()){

            caso=sc.nextLine();
            String [] palabras= caso.split(" ");

            String nombre_servidor= palabras[0];

            for (int i=1;i<palabras.length;i++){
                String nombre_jugador= palabras [i];
                System.out.println("Hola "+nombre_jugador+", bienvenido al servidor "+nombre_servidor+".");
            }



        }

		
    
    }
}
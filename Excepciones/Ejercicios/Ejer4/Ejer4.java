
import java.util.Scanner;

public class Ejer4 {
    static Scanner sc = new Scanner(System.in);

    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler", "Bartok"};

    public static String ValidaLista(){
        String s = null;

        try {
            s = sc.next();
            Error(s);

        } catch (ElementoNoExistente e) {

            System.out.println(s.toString());
        }

        return s;
        
    }

    private static void Error(String s) throws ElementoNoExistente{

        for (int i = 0; i < COMPOSITORES.length; i++) {
            if(!s.equals(COMPOSITORES[i])){
                throw new ElementoNoExistente("No existe el elemento");
            }
        }        
    }
}

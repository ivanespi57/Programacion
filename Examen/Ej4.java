
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()){
            String s;
            char c;
            int contadorH = 0;
            int contadorM = 0;
            int p = 0;
            s = sc.nextLine();

            for (int i = 0; i < s.length(); i++) {
               
                c = s.charAt(i);
            
                if (c == 'H'){
                    contadorH++;
                }
                if (c == 'M'){
                    contadorM++;
                }
                if (c == 'G'){
                    contadorH = 0;
                    contadorM = 0;
                }
                while (contadorH > 0 && contadorM > 0){
                    p++;
                    contadorH--;
                    contadorM--;
                }
                
            }
            System.out.println(p); 
        }
    }     
}

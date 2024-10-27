
import java.util.Scanner;

public class PExtra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        String num;

        
        System.out.println("Escribe una frase");
        s = sc.nextLine();
        
        String smin = s.toLowerCase();

        num = smin.replace('a', '1').replace('e', '2').replace('i', '3').replace('o', '4').replace('u', '5');
        
        
        System.out.println(num);
    }
    
}

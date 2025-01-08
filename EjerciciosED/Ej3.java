
import java.util.Scanner;
import java.util.Stack;

public class Ej3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Stack<Character> pila = new Stack<Character>();

        String linea = sc.nextLine();
        char carac;

        for (int i = 0; i < linea.length(); i++) {
            carac = linea.charAt(i);

            if (carac == '(' || carac == '{' || carac == '['){
                pila.push(carac);
            }else if(carac == ')' || carac == '}' || carac == ']'){
                char saca = pila.pop();
                
                if (carac == ')' && saca == '('){
                    System.out.println("SI");
                }
            }
        }
        


    }
}

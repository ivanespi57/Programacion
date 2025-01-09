
import java.util.Scanner;
import java.util.Stack;

public class Ej3 {

    public static boolean esBalanceada(String s){

        Stack<Character> pila = new Stack<Character>();

        char carac;
        char saca;
        boolean balanceada = true;
        
        for (int i = 0; i < s.length() && balanceada; i++) {
            carac = s.charAt(i);

            if (carac == '(' || carac == '{' || carac == '['){
                pila.push(carac);
            }else{
                if (carac == ')' || carac == '}' || carac == ']'){
                    if (pila.empty()){
                        balanceada = false;
                    }else{
                        saca = pila.pop();

                    if (saca == '('&& carac != ')'){
                        balanceada = false;
                    }
                    if (saca == '{'&& carac != '}'){
                        balanceada = false;
                    }
                    if (saca == '['&& carac != ']'){
                        balanceada = false;
                    }
                }
                    
            }
        }
    }
                
    return balanceada;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        if (esBalanceada(sc.nextLine())){

            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        
        
        
        /* Stack<Character> pila = new Stack<Character>();

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
        
        */

    }
}
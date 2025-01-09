
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class P143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean haydatos = true;

        while (haydatos) { 
            Stack<Integer> pila = new Stack<Integer>();
    
            int n = sc.nextInt();
            int tortitas;

            while (n != -1) {
                pila.push(n);
                n = sc.nextInt();

            } 
            int vueltas = sc.nextInt();

            if (pila.empty()){
                haydatos = false;
            }else{

                for (int i = 0; i < vueltas; i++) {
                    tortitas = sc.nextInt();
                    LinkedList<Integer> lista = new LinkedList<Integer>();
                    for (int j = 0; j < tortitas;j++) {
                        lista.add(pila.pop());
                    }
                    for (Integer num : lista) {
                        pila.push(num);
                    }
                }
                System.out.println(pila.peek());
            }   
        }
    }
}
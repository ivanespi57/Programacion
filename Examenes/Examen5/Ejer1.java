import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        while (sc.hasNext()){
            String[] todo = sc.nextLine().split(" ");
            String s = todo[0];
            String n = "";
            
            
            for (int i = 1; i < todo.length; i++) {
                n = todo[i];
                System.out.println("Hola "+ n + ", bienvenido al servidor " + s);
            }
            
        }
    }
}

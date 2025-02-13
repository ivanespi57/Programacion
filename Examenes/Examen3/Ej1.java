import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        String palabra;
        String acaba;

        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            palabra = sc.nextLine();
            acaba = palabra.substring(palabra.length() - 1);

            if (acaba.equals("n") || acaba.equals("s") || acaba.equals("a") || acaba.equals("e")  || acaba.equals("i") || acaba.equals("o") || acaba.equals("u")) {
                System.out.println("NO");
            }else{
                System.out.println("SI");
            }
        
        }

    }
}

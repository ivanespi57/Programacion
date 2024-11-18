import java.util.Scanner;

public class P337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++){
            int[] superior = new int[6];
            int[] inferior = new int[6];

            for (int j = 0; j < superior.length; j++){
                superior[j] = sc.nextInt();
            }
            for (int j = 0; j < inferior.length; j++){
                inferior[j] = sc.nextInt();
            }

            int valor = superior[0] + inferior[0];
            boolean encaja = true;

            for (int j = 1; j < inferior.length; j++){
                if (superior[j] + inferior[j] != valor){
                    encaja = false;
                }
            }

            if (encaja){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    } 
}

import java.util.Scanner;

public class pe4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        int cont = 2;
        int res;
        boolean prim = true;

        System.out.print("Dime un número: ");
        num = sc.nextInt();

        while(cont < num && prim){
            res = num % cont;

            if(res == 0){
                prim = false;
            }
            cont++;
        }

        if (prim){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
    }
}

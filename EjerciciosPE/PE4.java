package PE;

import java.util.Scanner;

public class PE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cont = 2;
        int comp;
        boolean primo = true;

        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        
        while (cont < n && primo){
            comp = n % cont;
            if (comp == 0){
                primo = false;
            }
            cont++;

        }
        if (primo == true) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
        
        
    }
}

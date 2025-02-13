
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             
        int p = sc.nextInt();
        int s = sc.nextInt();
        
        
        while (p != 0 && s != 0) { 
            ArrayList<String> lista1 = new ArrayList<String>();
            ArrayList<String> lista2 = new ArrayList<String>();
            String pok;

            for (int i = 0; i < p; i++) {
                pok = sc.next();
                lista1.add(pok);
            }
            
            for (int i = 0; i < s; i++) {
                pok = sc.next();
                lista2.add(pok);
            }

            if (lista1.equals(lista2)){

            }
            System.out.println(lista1);
            System.out.println(lista2);

            p = sc.nextInt();
            s = sc.nextInt();
        }    
                
        
    }
}

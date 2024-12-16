
import java.util.Scanner;

public class ExamenAscensor {
    public static boolean suba (int piso1, int piso2){
        
        return piso1 > piso2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int piso_anterior = 0;

        while (sc.hasNext()){
            
            int piso_nuevo = sc.nextInt();

            boolean result = suba(piso_nuevo, piso_anterior);

            if (result){
                System.out.println("Subiendo " + (piso_nuevo - piso_anterior));
            }else{    
                System.out.println("Bajando " + (piso_anterior - piso_nuevo));
            }
        
            piso_anterior = piso_nuevo;
        }
    }
}


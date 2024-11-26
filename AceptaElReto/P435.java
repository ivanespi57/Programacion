import java.util.Arrays;
import java.util.Scanner;

public class P435 {
    
    public static boolean pijo (String s){

        boolean valor = true;

        int[] n = new int[10]; // En java los inicializa a 0 si no les pones valor
        
        for (int i = 0; i < s.length(); i++){ //Calculamos el número de veces que aparece cada dígito
            
            switch (s.charAt(i)) {
                case '0':n[0]++; break;
                case '1':n[1]++; break;
                case '2':n[2]++; break;
                case '3':n[3]++; break;
                case '4':n[4]++; break;
                case '5':n[5]++; break;
                case '6':n[6]++; break;
                case '7':n[7]++; break;
                case '8':n[8]++; break;
                case '9':n[9]++; break;
            }
        }
       // System.out.println(Arrays.toString(n));
        
        int veces = n[0];

        for (int i = 1; i < n.length; i++){
            if (veces != n[i]){
                valor = false;
            }
        } 
        return valor;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String s = sc.nextLine();

            boolean res = pijo(s);

            if (res){
                System.out.println("subnormal");
            }else{
                System.out.println("no subnormal");
            }

        }
    }
}

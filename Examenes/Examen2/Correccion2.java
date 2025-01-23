import java.util.Scanner;

public class Correccion2 {


    public static boolean esBisiesto(int a){

        if (a > 1582){
            if (a % 400 == 0) return true;
            if (a % 100 == 0) return false;
            if (a % 4 == 0) return true;
            return false;
        }else{
            return a % 4 == 0;
        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int lineas_orig = sc.nextInt();
        int ejer = sc.nextInt();

        while (lineas_orig != 0 && ejer != 0) {

            int cont = 0;

            for (int i = 0; i < ejer; i++) {
                int lineas_plagio = sc.nextInt();
                double porc_plagio = (lineas_plagio * 100) / lineas_orig;
                if (porc_plagio >= 75){
                    cont++;
                }
                
            }

            System.out.println(cont);

            lineas_orig = sc.nextInt();
            ejer = sc.nextInt();
            
        }
        
    }
}

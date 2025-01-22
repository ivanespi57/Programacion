
import java.util.Scanner;

public class Ej2 {
    
    public static boolean esBisiesto(int a){
        
        boolean resultado = true;
        
        /* 
        if (a % 400 == 0){
            resultado = true;    
        }else{
            if (a % 100 == 0){
                resultado = false;
            }else{                              Es lo mismo que lo de abajo 
                if (a % 4 == 0){
                    resultado = true;
                }else{
                    resultado = false;
                }
            }
        }*/

        if (a >= 1582){ // año gregoriano
            if ((a % 400 == 0) || (a % 100 == 0) && (a % 4 == 0)){
                resultado = true;
            }else  {
                resultado = false;
            }
        }else{ // año juliano
            if (a % 4 == 0){
                resultado = true;
            }else{
                resultado = false;
            }
        }
        

        return resultado;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String nac = sc.next();
            
            
            String [] fechanac = nac.split("/");
            String a = fechanac[2];
            int anac = Integer.parseInt(a);

            // int anac = Integer.parseInt(sc.next().split("/")[2]);   Esto es lo mismo que todas las líneas de arriba. 

            int amuer = Integer.parseInt(sc.next().split("/")[2]);
            int calculo = 0;

            for (int j = anac; j <= amuer; j++) {
                if (esBisiesto(j)){
                    calculo++;
                }
            }
            System.out.println(calculo);
        }

    }
}

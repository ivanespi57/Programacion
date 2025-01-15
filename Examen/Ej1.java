import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean fin=false;
            do{
                int s = sc.nextInt();
                int p = sc.nextInt();
                int resultado = 0;
                if (s == 0 && p == 0){
                        fin=true;
                }else{
                    resultado = (s * 2) * p;    
                    System.out.println(resultado);
                }
               
                    
            }while (!fin);
    }
}

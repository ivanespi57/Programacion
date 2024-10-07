
import java.util.Scanner;

public class algo4 {
    public static void main(String[] args) {
        int cant;
        int n;
        int par = 0;
        int impar = 0;
        double npar  ;
        double nimpar ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la cantidad de números que quieres poner: ");
        cant = sc.nextInt();

        System.out.println("Números: ");
        
        for (int i = 0; i < cant; i++){
            
            n = sc.nextInt();

            if (n%2 == 0){
                par++;
                
            }else{
                impar++;
                
            }
        }
        // calculo de los porcentajes fuera del FOR
        
        npar = (double) par / cant  * 100;
        nimpar = (double) impar / cant * 100;
        
        System.out.printf("Porcentaje de pares: %.2f%%\nPorcentaje de impares: %.2f%%\n",npar, nimpar);
    }
    
}

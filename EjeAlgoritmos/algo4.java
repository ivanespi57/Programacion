
import java.util.Scanner;

public class algo4 {
    public static void main(String[] args) {
        int cant;
        int n;
        int par = 0;
        int impar = 0;
        int npar;
        int nimpar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la cantidad de números que quieres poner: ");
        cant = sc.nextInt();

        
        
        for (int i = 0; i <= cant; i++){
            System.out.println("Números: ");
            n = sc.nextInt();

            if (n%2 == 0){
                par++;
                
            }else{
                impar++;
                
            }
        }
        npar = par / cant;
        nimpar = impar / cant;
        
        System.out.printf("Porcentaje de pares: %d%\n Porcentaje de impares: %d%",npar, nimpar);
    }
    
}

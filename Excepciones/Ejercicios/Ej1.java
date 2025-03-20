
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int res;

        try {
            System.out.println("Introduce los dos números");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            res = n1 / n2;
            System.out.println(res);
            
        }catch (InputMismatchException e){
            System.out.println("Hay un dato que no es un número");
        }catch (ArithmeticException e){
            System.out.println("Algún dato es erróneo");
        }catch (Exception e) {
            System.out.println("Problemas con la división, excepción: "+ e.getMessage());
        } 
        
    }
}


import java.util.Scanner;

public class Ejem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4};
        
        try {
            int n = sc.nextInt();
            System.out.println(numbers[10]);
        
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Excepción: desbordamiento de un array");
        
        } catch (Exception e){ // Excepción genériva

            System.out.println(e.toString());
        
        } finally {
            
            System.out.println("Este código se ejecutará siempre");
        
        }
        
        }
}

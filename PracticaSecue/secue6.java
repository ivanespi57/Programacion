import java.util.Scanner;

public class secue6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n ;
        
        //pido un número 
        System.out.println("Introduce un número entre el 1 y el 100: ");
        n = sc.nextInt();
        double resto = n % 10;
        int decena = (n/10) * 10;
        
        //compruebo si el número esta entre 1 y 100 
        
        if (n < 1 || n > 100){
            System.out.println("Número inválido");
        } 
        if (resto < 5){
            System.out.println("La decena más próxima es " + decena);
        }
        if (resto >= 5){
            System.out.println("La decena más próxima es " + (decena+10));
        }
    }
    
}

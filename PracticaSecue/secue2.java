import java.util.Scanner;
public class secue2 {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("Es par ");
        }else{
            System.out.println("Es impar");
        }
        // sout ((n%2)==0 )
    }
    
}

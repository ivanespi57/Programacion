import java.util.Scanner;
public class ejemploER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        n = sc.nextInt();

        // while 

        while (n != 0) { 
            System.out.println(n);
            n = sc.nextInt();
        }
        //do while

        do { 
            n = sc.nextInt();
            if (n!=0){
                System.out.println(n);
            }

        } while (n!=0);
        
        //for que imprime los primeros 50 números

    
        for (int i = 1; i <= 50; i++){
            System.out.println(i);

        }
    }
    
}

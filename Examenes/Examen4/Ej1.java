import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean fin=false;
        
        do{
            int casos = sc.nextInt();
    
            if (casos == 0){
                    fin=true;
            }else{
                
                int total = 0;

                for (int i = 0; i < casos; i++) {
                    int recomp = sc.nextInt();
                    total += recomp;
                }
                
                System.out.println(total);
            }

        }while (!fin);
    }
}

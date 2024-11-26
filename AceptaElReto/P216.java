import java.util.Scanner;

public class P216 {
   
   public static void tiempo (int got){
    int h = got / 3600;
    int min = (got % 3600) / 60;
    int seg = got % 60;

    System.out.printf("%02d:%02d:%02d\n", h, min, seg);
   }
   
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos;
        casos = sc.nextInt();


        for (int i = 0; i < casos; i++){
            
            int got = sc.nextInt();
           
            tiempo(got);

               
        }

    }
}

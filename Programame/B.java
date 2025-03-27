import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();
        

        for (int i = 0; i < n; i++) {
            String contra = sc.nextLine();
            String s = "+_)(*&^%$#@!./,;{}";
            int min = 0;
            int may = 0;
            int num = 0;
            int simb = 0;
            
            for (int j = 0; j < contra.length(); j++) {
                if (contra.charAt(j) > 96 && contra.charAt(j) < 123){
                    min++;
                }
    
                if (contra.charAt(j) > 64 && contra.charAt(j) < 91){
                    may++;
                }
                
                if (contra.charAt(j) > 47 && contra.charAt(j) < 58) {
                    num++;
                }
    
                if (s.contains(String.valueOf(contra.charAt(j)))) {
                    simb++; 
                }
                
            }
                        
            if (min > 0 && may > 0 && num > 0 && simb > 0 && (contra.length() >= 12)){
                System.out.println("OK");
            }else{
                System.out.println("ERROR");
            }
            
        }
    }
}

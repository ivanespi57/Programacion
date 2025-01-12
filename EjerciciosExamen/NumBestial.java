import java.util.Scanner;

public class NumBestial {
    
    public static boolean esBestial(int n) {

        String s = String.valueOf(n);
        boolean bes = true;

        if (s.contains("666")){
            bes = true;
        }else {
            bes = false;
        }
       
        
        return bes;
    }
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        boolean fin=false;
		do{
			if (n == 0){
				fin=true; 
			}else{
                if (esBestial(n)){
                    System.out.println("SI");
                }else {
                    System.out.println("NO");
                }
                n = sc.nextInt();
                
			}
            
		}while (!fin);

        
    }
}

import java.util.Scanner;

public class P151 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int n;
        boolean s;
        int v;
		
        
        n = sc.nextInt();
        do{
			
            int[][] m = new int[n][n];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    
                    m[i][j] = sc.nextInt();
                }
            }
            
            s = false;
            v = 0;
            v++;

            if (m[v][v] == 1){
                s = true;
            }

            if (s){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            n = sc.nextInt();
			
		}while (n != 0);

	}
}


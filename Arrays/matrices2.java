public class matrices2 {
    public static void main(String[] args) {
        
        int[][] m = new int[3][3];
        int filas = 3;
        int colum = 3;  
        int cont = 1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                
                cont++;
                m[i][j] = cont;
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}

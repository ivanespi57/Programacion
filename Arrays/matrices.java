public class matrices {
    public static void main(String[] args) {
        
        // int[][] m = {{1,2,3},{4,5,6}};
        int nfilas = 5;
        int ncolumnas = 7;
        boolean[][] m = new boolean[nfilas][ncolumnas];
        m[2][4] = true;

        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {

                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

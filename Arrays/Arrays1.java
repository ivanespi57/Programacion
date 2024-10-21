public class Arrays1 {
    public static void main(String[] args) {
        
       // int[] x = new int[8]; //va a reservar espacio para 7 números enteros en una sola variable.
        int[] x = {-1,4,8,0,-3,1000}; // -> Es lo mismo pero simplificado
        x[2] = 5;

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            
        }
        
    }
    
}

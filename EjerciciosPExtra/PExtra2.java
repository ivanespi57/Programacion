public class PExtra2 {
    public static void main(String[] args) {
        
        int dado1 ;
        int dado2 ;

        do { 
            dado1 = (int)(Math.random()*6+1);
            dado2 = (int)(Math.random()*6+1);
            System.out.printf("Dado 1: %d Dado 2: %d\n",dado1, dado2);

        } while (dado1 != dado2);
    }
}

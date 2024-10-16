public class PExtra1 {
    public static void main(String[] args) {
        
        int dado1 = (int)(Math.random()*6+1);
        int dado2 = (int)(Math.random()*6+1);
        int dado3 = (int)(Math.random()*6+1);
        int suma = dado1 + dado2 + dado3;

        
        System.out.printf("Dado 1: %d Dado 2: %d Dado 3: %d\nSuma de los dados: %d\n",dado1, dado2, dado3 ,suma);
    }
}


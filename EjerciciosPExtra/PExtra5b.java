public class PExtra5b {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 20) + 1;

        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.println("Tamaño del triángulo: " + n);
    }
}
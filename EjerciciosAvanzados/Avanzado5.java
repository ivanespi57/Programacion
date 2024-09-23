
import java.util.Scanner;

public class Avanzado5 {
    public static void main(String[] args) {
        int hue1;
        int hue2;
        int tiempo = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuántos huevos caben en la cazuela: ");
        hue1 = sc.nextInt();
        System.out.println("Cuántos huevos quieres cocer: ");
        hue2 = sc.nextInt();

        if (hue1 >= hue2){
            System.out.printf("Tarda %d minutos", tiempo);
        }else if (hue1 < hue2){
            

        }
    }
    
}

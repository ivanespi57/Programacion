
import java.util.Scanner;

public class Avanzado5 {
    public static void main(String[] args) {
        int cap;
        int hue;
        int tiempo;
        int ollas;
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántos huevos caben en la cazuela: ");
        cap = sc.nextInt();
        System.out.print("Cuántos huevos quieres cocer: ");
        hue = sc.nextInt();

        ollas = hue / cap;

        if (hue%cap > 0 ){
            tiempo = (ollas + 1) * 10;
        }else{
            tiempo = 10;
        }
        System.out.printf("Los huevos tardarán en cocerse %d minutos\n", tiempo);
        }
    
    
}

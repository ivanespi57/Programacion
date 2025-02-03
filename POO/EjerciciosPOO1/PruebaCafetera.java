
import java.util.Scanner;

public class PruebaCafetera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(500);
        Cafetera c3 = new Cafetera(2000, 1000);

        c1.llenarCafetera();

        c2.servirTaza(400);
        System.out.println(c2.getCantidadActual());
        
        c3.setCapacidadMaxima(4000);
        c3.agregarCafe(2800);
        System.out.println(c3.getCantidadActual());
        c3.vaciarCafetera();
        System.out.println(c3.getCantidadActual());
    }
}

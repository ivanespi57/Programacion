
import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
        Carta car = new Carta(1, "Oros");
        Baraja fournier = new Baraja(12);
        
        fournier.barajar();

        ArrayList<Carta> j1 = new ArrayList<>();
        ArrayList<Carta> j2 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            j1.add(fournier.repartirCarta());
            j2.add(fournier.repartirCarta());
        }

        for (Carta c1 : j1) {
            System.out.println(c1);
        }
        System.out.println("================================");
        for (Carta c2 : j2) {
            System.out.println(c2);
        }
        System.out.println("================================");
        for (Carta c : fournier.getCartas()) {
            System.out.println(c);
        }

        
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> cartas = new ArrayList<>();
    private ArrayList<String> palos = new ArrayList<>();

    public Baraja(int numeros){
        for (int i = 1; i <= numeros; i++) {
            cartas.add(new Carta(i,"OROS"));
            cartas.add(new Carta(i,"ESPADAS"));
            cartas.add(new Carta(i,"COPAS"));
            cartas.add(new Carta(i,"BASTOS"));
        }
    }
    
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        cartas = cartas;
    }

    public void barajar(){
        for (int i = 0; i < 200; i++) {
            int random = (int)(Math.random()* cartas.size());
            Carta aux = cartas.remove(random);
            cartas.add(aux);
        }
    }

    public void barajar1(){
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta(){
        return cartas.remove(0);
    }
    
}


import java.util.ArrayList;

public class Cofre {
    private String id;
    private ArrayList<Objeto> objetos = new ArrayList<>();
    // private Herramienta herramientas = new Herramienta();
    // private Armadura armaduras = new Armadura();
    // private Comida comidas = new Comida();
    // private Mineral minerales = new Mineral();


    public Cofre(String id) {
        this.id = id;
        this.objetos = new ArrayList<>();
    }

    public void rellenaCofre() {
        int h = (int)(Math.random() * 3);
        int a = (int)(Math.random() * 2);
        int c = (int)(Math.random() * 4);
        int m = (int)(Math.random() * 3);

        for (int i = 0; i < h; i++) {
            objetos.add(new Herramienta());
        }

        for (int i = 0; i < h; i++) {
            objetos.add(new Armadura());
        }

        for (int i = 0; i < h; i++) {
            objetos.add(new Comida());
        }

        for (int i = 0; i < h; i++) {
            objetos.add(new Mineral());
        }
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String cadena = this.id;
        cadena += "\n==========\n";
        for (Objeto f : objetos) {
            cadena += f;
            cadena += "\n";
        }
        return cadena;
    }
}

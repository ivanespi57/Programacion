
import java.util.ArrayList;

public class Carcel {
    private String nombre;
    private ArrayList<Forajido> lista = new ArrayList<>();

    public Carcel(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Forajido> getLista() {
        return this.lista;
    }

    public void setLista(Forajido f) {
        this.lista.add(f);
    }

    public String toString(){
        String cadena = this.nombre.toUpperCase();
        cadena += "\n==========\n";
        for (Forajido f : lista) {
            cadena += f.getNombre();
            cadena += "\n";
        }
        return cadena;
    }
}

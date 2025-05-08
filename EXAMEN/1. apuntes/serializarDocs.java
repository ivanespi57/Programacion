import java.io.*;
import java.util.*;

class Equipo implements Serializable {
    private String nombre;
    private int puntos;

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return nombre + " - " + puntos + " puntos";
    }
}

public class Clasificacion implements Serializable {
    private List<Equipo> equipos;

    public Clasificacion() {
        equipos = new ArrayList<>();
    }

    public void addEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void imprimirClasificacion() {
        System.out.println("Clasificaci�n");
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }

    public void serializar(String archivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(this);
            System.out.println("Clasificaci�n serializada en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Clasificacion deserializar(String archivo) {
        Clasificacion clasificacion = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            clasificacion = (Clasificacion) in.readObject();
            System.out.println("Clasificaci�n deserializada de " + archivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clasificacion;
    }

    public static void main(String[] args) {
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.addEquipo(new Equipo("Barcelona", 67));
        clasificacion.addEquipo(new Equipo("R. Madrid", 63));
        clasificacion.addEquipo(new Equipo("Atl�tico", 60));
        clasificacion.addEquipo(new Equipo("Athletic", 54));
        clasificacion.addEquipo(new Equipo("Villarreal", 48));
        
       

        clasificacion.imprimirClasificacion();

        clasificacion.serializar("clasificacion.dat");

        Clasificacion clasificacionRec = Clasificacion.deserializar("clasificacion.dat");
        clasificacionRec.imprimirClasificacion();
    }
}
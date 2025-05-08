package pseudoExamen;

import java.io.*;
import java.util.ArrayList;

public class Ejer2 {
    public static void main(String[] args) {
        // 1. Crear lista de productos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Lejía", 10.0, 5));
        productos.add(new Producto("Papel", 3.0, 20));
        productos.add(new Producto("Jabón", 4.0, 15));

        // 2. Guardar en productos.dat
        escribirLista(productos, "productos.dat");

        // 3. Leer del archivo y filtrar
        ArrayList<Producto> productosLeidos = leerLista("productos.dat");
        ArrayList<Producto> filtrados = new ArrayList<>();

        for (Producto p : productosLeidos) {
            if (p.getStock() > 10) {
                System.out.println("Filtrado: " + p);
                filtrados.add(p);
            }
        }

        // 4. Guardar filtrados en otro archivo
        escribirLista(filtrados, "productos_filtrados.dat");
    }

    private static void escribirLista(ArrayList<Producto> lista, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
            System.out.println("Lista escrita en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Producto> leerLista(String archivo) {
        ArrayList<Producto> lista = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            lista = (ArrayList<Producto>) ois.readObject();
            System.out.println("Lista leída desde " + archivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lista;
    }
}

class Producto implements Serializable {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return nombre + " - " + precio + "€ (" + stock + " unidades)";
    }
}

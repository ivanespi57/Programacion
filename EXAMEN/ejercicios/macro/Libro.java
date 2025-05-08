package macro;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;

    private String ISBN;
    private String titulo;
    private String autor;
    private int fecha;

    public Libro(String ISBN, String titulo, String autor, int fecha) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    public static void filtroFechaMayor(ArrayList<Libro> libros, int filtro) {
        for (Libro l : libros) {
            if (l.fecha > filtro) {
                System.out.println(l);
            }
        }
    }

    public static void serializar(ArrayList<Libro> libros) {
        File destino = new File("libros.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(destino))) {
            oos.writeObject(libros);
            System.out.println("Lista escrita en " + destino.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al serializar libros: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static ArrayList<Libro> deserializar(File f) {
        ArrayList<Libro> listalibros = new ArrayList<>();
        if (!f.exists()) {
            System.out.println("Fichero binario no encontrado: " + f.getName());
            return listalibros;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            listalibros = (ArrayList<Libro>) ois.readObject();
            System.out.println("Lista leída desde " + f.getAbsolutePath());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar libros: " + e.getMessage());
            e.printStackTrace();
        }
        return listalibros;
    }
    public static void prestar() {
        System.out.print("--prestamo-- \n");
        File prestamostxt = new File("prestamos.txt");
        Scanner sc = new Scanner(System.in);
        String ISBN;
        String usuario;
        Date fecha;

        try {
            System.out.print("ISBN: ");
            ISBN = sc.nextLine();
            System.out.print("usuario: ");
            usuario = sc.nextLine();
            fecha = new Date();

            if (!prestamostxt.exists()) {
                prestamostxt.createNewFile();
            }

            try (FileWriter fw = new FileWriter(prestamostxt, true)) {
                fw.write(ISBN + ";" + usuario + ";" + fecha + "\n");
            }

        } catch (IOException e) {
            System.out.println("Error al registrar préstamo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ISBN:" + ISBN + ", título:" + titulo + ", autor:" + autor + ", fecha:" + fecha;
    }
}

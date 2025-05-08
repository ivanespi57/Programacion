package macro;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File librostxt = new File("libros.txt");
        ArrayList<Libro> listalibros = new ArrayList<>();
        ArrayList<Prestamo> listaprestamos = new ArrayList<>();

        if (!librostxt.exists()) {
            System.out.println("No existe el listado de libros.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(librostxt))) {
            String libro;
            while ((libro = br.readLine()) != null) {
                String[] datoslibro = libro.split(";");
                String ISBN = datoslibro[0];
                String titulo = datoslibro[1];
                String autor = datoslibro[2];
                int fecha = Integer.parseInt(datoslibro[3]);
                listalibros.add(new Libro(ISBN, titulo, autor, fecha));
            }

            Libro.filtroFechaMayor(listalibros, 2010);
            Libro.prestar();

            Libro.serializar(listalibros);
            File librosserial = new File("libros.dat");
            ArrayList<Libro> librosserializados = Libro.deserializar(librosserial);
            for (Libro l : librosserializados) {
                System.out.println(l);
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Excepción: " + e.getMessage());
            e.printStackTrace();
        }
    }


}

package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/*
 *  grepj prueba.txt luna
 */
public class Grepj {
    public static void main(String[] args) {
        if (args.length == 2) {
            String nombreFichero = args[0];
            String query = args[1];

            try {
                File destino = new File(nombreFichero);
                if (!destino.exists()) {
                    System.out.println("El fichero " + nombreFichero + " no existe.");
                    return;
                }

                mostrar_coincidencia(destino, query);

            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }

        } else {
            System.out.println("Debes introducir dos parámetros: ");
            System.out.println("Uso: Grepj <nombre.txt> <query>");
        }
    }

    public static void mostrar_coincidencia(File f, String q) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line;
            int numeroLinea = 0;
            boolean encontrado = false;

            while ((line = reader.readLine()) != null) {
                numeroLinea++;
                if (line.contains(q)) {
                    encontrado = true;
                    String lineConCoincidencia = line.replace(q, "\u001B[32m" + q + "\u001B[0m");
                    System.out.println("Línea " + numeroLinea + ": " + lineConCoincidencia);
                }
            }
            reader.close();

            if (!encontrado) {
                System.out.println("No se encontraron coincidencias para la palabra: " + q);
            }
        } catch (Exception e) {
            System.out.println("No se ha podido leer el archivo: " + e.getMessage());
        }
    }
}
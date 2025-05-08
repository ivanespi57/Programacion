package archivos;

import java.io.*;
import java.util.Scanner;

/**
 * Programa que permite introducir texto por teclado y lo va
 * guardando en un fichero de texto hasta que se escriba "exit".
 */
public class TextToFile {

    public static void main(String[] args) {
        File f = new File("textToFile.txt");
        crearArchivoSiNoExiste(f);
        escribirTextoEnArchivo(f);
    }

    // Crea el archivo si no existe
    public static void crearArchivoSiNoExiste(File f) {
        try {
            if (f.createNewFile()) {
                System.out.println("Archivo creado con éxito.");
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al tratar el archivo: " + e.getMessage());
        }
    }

    // Escribe texto introducido por el usuario en el archivo, línea por línea
    public static void escribirTextoEnArchivo(File f) {
        try (
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter(f, true); // true para añadir en vez de sobrescribir
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String ans;
            do {
                System.out.print("Texto a escribir ('exit' para salir): ");
                ans = sc.nextLine();

                if (!ans.equals("exit")) {
                    bw.write(ans);
                    bw.newLine(); // Salto de línea tras cada entrada
                }
            } while (!ans.equals("exit"));
            System.out.println("Finalizado.");
        } catch (IOException e) {
            System.out.println("Error escribiendo en el archivo: " + e.getMessage());
        }
    }
}

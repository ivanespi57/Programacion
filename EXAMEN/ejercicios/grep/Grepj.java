package grep;

import java.io.*;

public class Grepj {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("uso: grepj prueba.txt palabra");
            return;
        }

        String nombreArchivo = args[0];
        String palabra = args[1];
        File archivo = new File(nombreArchivo);

        if (!archivo.exists() || !archivo.isFile()) {
            System.out.println("El archivo no existe o no es válido.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int numeroLinea = 0;
            while ((linea = br.readLine()) != null) {
                numeroLinea++;
                if (linea.contains(palabra)) {
                    // Resaltamos la palabra en verde
                    String resaltado = linea.replace(palabra, "\u001B[32m" + palabra + "\u001B[0m");
                    System.out.println(numeroLinea + ": " + resaltado);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

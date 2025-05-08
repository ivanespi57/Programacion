package ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Crear un programa que permita introducir texto por teclado y lo
 * irá guardando en un fichero.
 */

public class GuardarFichero {
    public static void main(String[] args) {
        try {
            File destino = new File("guardarAqui.txt");
            if (destino.createNewFile()) {
                System.out.println("Fichero creado: " + destino.getName());
            } else {
                System.out.println("El fichero ya existe. Se añadirá contenido.");
            }

            // Escribir en el fichero
            FileWriter writer = new FileWriter(destino, true); 
            String contenido;
            Scanner sc = new Scanner(System.in);

            do {
                System.out.print("Introduce texto (escribe 'fin' para terminar): ");
                contenido = sc.nextLine();
                if (!contenido.equals("fin")) {
                    writer.write(contenido + System.lineSeparator()); 
                }
            } while (!contenido.equals("fin"));

            writer.close(); 
            sc.close(); 
            System.out.println("Contenido guardado en el fichero.");
            

            ArrayList<String> destinoContenido = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(destino));
            String line;

            while ((line = reader.readLine()) != null) {
                destinoContenido.add(line);
            }
            reader.close(); 
            

            System.out.println("Contenido del fichero:");
            for (String lineContent : destinoContenido) {
                System.out.println(lineContent);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
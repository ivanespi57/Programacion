package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 2. Crear un programa que pida un nombre de usuario y contraseña
y lo guarde en un fichero con el formato:
<nombre>:<Contraseña>
Utiliza ese fichero para validar contraseñas. Crea un sistema que
pida el nombre de un usuario y su contraseña y valide si el nombre
existe y, en caso afirmativo, si la contraseña es correcta
 */
public class GuardarConFormato {
    public static void main(String[] args) {
        try {
            File destino = new File("bulk.txt");
            ArrayList<String> contenido;

            if (destino.createNewFile()) {
                System.out.println("Fichero creado: " + destino.getName());
                contenido = new ArrayList<>();
            } else {
                System.out.println("El fichero ya existe. Se añadirá contenido.");
                contenido = obtener_contenido(destino);
            }

            escribir_contenido(destino, contenido);
            mostrar_contenido(destino);

        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void escribir_contenido(File f, ArrayList<String> contenido) {
        try {
            FileWriter writer = new FileWriter(f, true);
            String nombre;
            String pass;
            Scanner sc = new Scanner(System.in);

            do {
                System.out.print("Introduce nombre (escribe 'exit' para terminar): ");
                nombre = sc.nextLine();
                if (!nombre.equals("exit")) {
                    boolean usuarioExistente = false;
                    for (String entry : contenido) {
                        if (entry.split(":")[0].equals(nombre)) {
                            usuarioExistente = true;
                            break;
                        }
                    }

                    if (usuarioExistente) {
                        System.out.println("El nombre de usuario ya existe. Por favor, elige otro.");
                    } else {
                        System.out.print("Introduce contraseña: ");
                        pass = sc.nextLine();
                        writer.write(nombre + ":" + pass + System.lineSeparator());
                        contenido.add(nombre + ":" + pass); 
                    }
                }
            } while (!nombre.equals("exit"));

            writer.close();
            sc.close();
            System.out.println("Contenido guardado en el fichero.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error al escribir en el fichero: " + e.getMessage());
        }
    }

    public static void mostrar_contenido(File f) {
        try {
            ArrayList<String> destinoContenido = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line;

            while ((line = reader.readLine()) != null) {
                destinoContenido.add(line);
            }
            reader.close();
            System.out.println("Contenido del fichero:");
            for (String lineContent : destinoContenido) {
                System.out.println(lineContent);
            }
        } catch (Exception e) {
            System.out.println("No se ha encontrado el archivo!");
        }
    }

    public static ArrayList<String> obtener_contenido(File f) {
        ArrayList<String> contenido = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line;

            while ((line = reader.readLine()) != null) {
                contenido.add(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer el fichero: " + e.getMessage());
        }
        return contenido;
    }
}
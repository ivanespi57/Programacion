package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

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

            Scanner sc = new Scanner(System.in);
            String nombre;

            do {
                System.out.print("Login ('exit' para terminar): ");
                nombre = sc.nextLine();
                if (!nombre.equals("exit")) {
                    if (usuarioExiste(contenido, nombre)) {
                        if (validarContraseña(contenido, nombre, sc)) {
                            System.out.println("Login completado.");
                        } else {
                            System.out.println("Demasiados fallos, pruebe de nuevo más tarde.");
                        }
                    } else {
                        System.out.println("El nombre de usuario no existe.");
                    }
                }else {
                	System.out.println("hasta la proxima :D.");
                }
            } while (!nombre.equals("exit"));

            sc.close();

        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
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

    public static boolean usuarioExiste(ArrayList<String> contenido, String nombre) {
        for (String entry : contenido) {
            if (entry.split(":")[0].equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarContraseña(ArrayList<String> contenido, String nombre, Scanner sc) {
        for (String entry : contenido) {
            String[] partes = entry.split(":");
            if (partes[0].equals(nombre)) {
                int count = 0;
                while (count < 5) {
                    System.out.print("Introduce la contraseña: ");
                    String pass = sc.nextLine();
                    if (pass.equals(partes[1])) {
                        return true; // Contraseña correcta
                    } else {
                        count++;
                        System.out.println("La contraseña no es válida, te quedan " + (5 - count) + " intentos.");
                    }
                }
            }
        }
        return false; // Contraseña incorrecta después de 5 intentos
    }
}
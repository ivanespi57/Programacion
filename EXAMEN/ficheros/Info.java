package ficheros;

import java.io.File;

/*
 * 2. Crear un programa que a partir de un nombre pasado como
argumento diga si es un fichero o un directorio y muestre la ruta
absoluta, el tamaño y sus permisos.
 * */
import java.io.File;

public class Info {
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Info <nombre_del_fichero_o_directorio>");
            return;
        }

        String nombre = args[0];
        File file = new File(nombre);

        if (!file.exists()) {
            System.out.println("El archivo o directorio " + nombre + " no existe.");
            return;
        }

        mostrarInformacionGeneral(file);
        
        mostrarPermisos(file);
    }

    private static void mostrarInformacionGeneral(File file) {
        System.out.println("Ruta absoluta: " + file.getAbsolutePath());
        System.out.println("Tamaño: " + file.length() + " bytes");
        
        if (file.isFile()) {
            System.out.println("Tipo: Fichero");
        } else if (file.isDirectory()) {
            System.out.println("Tipo: Directorio");
        }
    }

    private static void mostrarPermisos(File file) {
        System.out.println("Permisos:");
        System.out.println("Lectura: " + (file.canRead() ? "Sí" : "No"));
        System.out.println("Escritura: " + (file.canWrite() ? "Sí" : "No"));
        System.out.println("Ejecución: " + (file.canExecute() ? "Sí" : "No"));
    }
}
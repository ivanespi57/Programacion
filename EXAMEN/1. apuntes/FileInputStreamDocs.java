package archivos;

import java.io.*;

public class FileInputStreamDocs {

    public static void main(String[] args) {
        String fileLectura = "lectura.bin";
        String fileEscritura = "escritura.bin";

        // Escribir algunos bytes
        escribirBytes(fileEscritura, new byte[]{0x41, 0x42, 0x43, 'C'});

        // Leer e imprimir los bytes del archivo
        leerBytes(fileEscritura);

        // Otras utilidades
        long size = obtenerTamanioArchivo(fileEscritura);
        System.out.println("Tamaño del archivo: " + size + " bytes");

        boolean existe = archivoExiste("otro_archivo.bin");
        System.out.println("¿Existe 'otro_archivo.bin'? " + existe);
    }
    
    

    // Método para leer bytes de un archivo
    public static void leerBytes(String rutaArchivo) {
        try (FileInputStream fis = new FileInputStream(rutaArchivo)) {
            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                System.out.println("Byte leído: " + byteLeido + " (char: " + (char) byteLeido + ")");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método para escribir bytes en un archivo
    public static void escribirBytes(String rutaArchivo, byte[] datos) {
        try (FileOutputStream fos = new FileOutputStream(rutaArchivo)) {
            fos.write(datos);
            System.out.println("Bytes escritos correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    // Método para verificar si un archivo existe
    public static boolean archivoExiste(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        return archivo.exists();
    }

    // Método para obtener el tamaño de un archivo
    public static long obtenerTamanioArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        if (archivo.exists()) {
            return archivo.length();
        } else {
            System.err.println("El archivo no existe.");
            return -1;
        }
    }

    // Método para eliminar un archivo
    public static boolean eliminarArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        return archivo.delete();
    }
}

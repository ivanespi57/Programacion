package ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DescifradoCesar {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java DescifradoCesar <archivo_cifrado>");
            return;
        }

        String nombreArchivo = args[0];
        File archivoEntrada = new File(nombreArchivo);

        if (!archivoEntrada.exists() || !nombreArchivo.endsWith(".cf4")) {
            System.out.println("El archivo no existe o no tiene extensión .cfX");
            return;
        }

        int desplazamiento = obtenerDesplazamiento(nombreArchivo);
        if (desplazamiento == -1) {
            System.out.println("No se pudo obtener el desplazamiento del nombre del archivo.");
            return;
        }

        String archivoSalida = nombreArchivo.substring(0, nombreArchivo.length() - 3) + ".dec";

        try {
            descifrarArchivo(archivoEntrada, archivoSalida, desplazamiento);
            System.out.println("Archivo descifrado correctamente: " + archivoSalida);
        } catch (IOException e) {
            System.out.println("Error al descifrar el archivo: " + e.getMessage());
        }
    }

    public static int obtenerDesplazamiento(String nombreArchivo) {
        int indiceCf = nombreArchivo.lastIndexOf(".cf");
        if (indiceCf == -1 || indiceCf + 3 >= nombreArchivo.length()) {
            return -1;
        }

        try {
            return Integer.parseInt(nombreArchivo.substring(indiceCf + 3));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void descifrarArchivo(File archivoEntrada, String archivoSalida, int desplazamiento) throws IOException {
        FileReader fr = new FileReader(archivoEntrada);
        FileWriter fw = new FileWriter(archivoSalida);

        int charLeido;
        while ((charLeido = fr.read()) != -1) {
            if (Character.isLetter(charLeido)) {
                charLeido = (charLeido - 65 - desplazamiento + 26) % 26 + 65;
            }
            fw.write(charLeido);
        }

        fr.close();
        fw.close();
    }
}
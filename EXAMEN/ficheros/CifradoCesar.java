package ficheros;

import java.io.*;

public class CifradoCesar {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java CifradoCesar <archivo_entrada> <desplazamiento 1-9>");
            return;
        }

        String nombreArchivo = args[0];
        int desplazamiento;

        // Validar desplazamiento
        try {
            desplazamiento = Integer.parseInt(args[1]);
            if (desplazamiento < 1 || desplazamiento > 9) {
                System.out.println("El desplazamiento debe estar entre 1 y 9.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("El desplazamiento debe ser un número.");
            return;
        }

        File archivoEntrada = new File(nombreArchivo);
        if (!archivoEntrada.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        String archivoSalida = nombreArchivo + ".cf" + desplazamiento;
        File archivoCodificado = new File(archivoSalida);

        if (archivoCodificado.exists()) {
            System.out.println("El archivo ya fue codificado con ese desplazamiento.");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida));

            String linea;
            while ((linea = br.readLine()) != null) {
                StringBuilder lineaCifrada = new StringBuilder();

                for (int i = 0; i < linea.length(); i++) {
                    char c = linea.charAt(i);

                    if (c >= 'A' && c <= 'Z') { 
                        char cifrado = (char) (((c - 'A' + desplazamiento) % 26) + 'A');
                        lineaCifrada.append(cifrado);
                    } else {
                        lineaCifrada.append(c); 
                    }
                }

                bw.write(lineaCifrada.toString());
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Archivo codificado correctamente: " + archivoSalida);
        } catch (IOException e) {
            System.out.println("Error al codificar el archivo: " + e.getMessage());
        }
    }
}
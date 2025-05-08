package pseudoExamen;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Ejer1 {
    public static void main(String[] args) {
        crearRegistroVehiculos();
        TreeMap<String, Integer> dic = leerRegistro();
        conteoVehiculos(dic);
    }

    private static void conteoVehiculos(TreeMap<String, Integer> dic) {
        File f = new File("conteoVehiculos.txt");
        try (FileWriter fw = new FileWriter(f)) {
            for (Map.Entry<String, Integer> entry : dic.entrySet()) {
                fw.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            System.out.println("Archivo 'conteoVehiculos.txt' generado correctamente.");
        } catch (IOException e) {
            System.err.println("Error escribiendo el archivo: " + e.getMessage());
        }
    }

    private static TreeMap<String, Integer> leerRegistro() {
        TreeMap<String, Integer> dic = new TreeMap<>();
        File f = new File("registroVehiculos.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().equals("0")) break;

                String[] datos = linea.split(" ");
                for (String d : datos) {
                    d = d.toLowerCase();
                    dic.put(d, dic.getOrDefault(d, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo: " + e.getMessage());
        }
        return dic;
    }

    private static void crearRegistroVehiculos() {
        File f = new File("registroVehiculos.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("3\n");
            bw.write("Camion Coche MOTO\n");
            bw.write("moto camion Coche\n");
            bw.write("AVION avion COCHE\n");
            bw.write("0\n");

            System.out.println("Archivo 'registroVehiculos.txt' creado correctamente.");
        } catch (IOException e) {
            System.err.println("Error creando el archivo: " + e.getMessage());
        }
    }
}
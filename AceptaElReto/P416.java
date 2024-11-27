import java.util.Scanner;

public class P416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int casos = sc.nextInt();
            if (casos == 0) break;

            String[] fechas = new String[casos];
            boolean repetido = false;

            for (int i = 0; i < casos; i++) {
                String fecha = sc.next();
                // Comparar solo los días y los meses (ignorando los años)
                String diaMes = fecha.substring(0, 5); // Obtener solo DD/MM
                for (int j = 0; j < i; j++) {
                    // Si ya existe una fecha igual en día y mes
                    if (diaMes.equals(fechas[j].substring(0, 5))) {
                        repetido = true;
                        break;  // No hace falta seguir comparando si ya encontramos un duplicado
                    }
                }
                fechas[i] = fecha; // Almacenar la fecha completa
            }

            if (repetido) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}


import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generar una opción aleatoria para el ordenador
        int eleccionOrdenador = (int) (Math.random() * 3) + 1; // 1-Piedra, 2-Papel, 3-Tijeras

        // Pedir al usuario que elija una opción
        System.out.println("Elige una opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        
        int eleccionUsuario = 0;
        while (eleccionUsuario < 1 || eleccionUsuario > 3) {
            System.out.print("Introduce 1, 2 o 3: ");
            eleccionUsuario = scanner.nextInt();
            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        // Mostrar la elección del ordenador
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        System.out.println("El ordenador eligió: " + opciones[eleccionOrdenador - 1]);
        System.out.println("Tú elegiste: " + opciones[eleccionUsuario - 1]);

        // Determinar el resultado
        if (eleccionUsuario == eleccionOrdenador) {
            System.out.println("Es un empate.");
        } else if ((eleccionUsuario == 1 && eleccionOrdenador == 3) || // Piedra vence a Tijeras
                   (eleccionUsuario == 2 && eleccionOrdenador == 1) || // Papel vence a Piedra
                   (eleccionUsuario == 3 && eleccionOrdenador == 2)) { // Tijeras vence a Papel
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("El ordenador gana.");
        }

        scanner.close();
    }
}

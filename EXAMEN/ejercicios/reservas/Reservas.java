import java.sql.*;
import java.util.*;

public class Reservas {
    private static final String URL = "jdbc:mysql://localhost:3306/ReservaVuelos";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("\n--- MENÚ RESERVAS ---");
                System.out.println("1. Alta Vuelo");
                System.out.println("2. Alta Pasajero");
                System.out.println("3. Reserva Vuelo");
                System.out.println("4. Modificar reserva");
                System.out.println("5. Baja reserva");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1 -> altaVuelo(sc);
                    case 2 -> altaPasajero(sc);
                    case 3 -> reservarVuelo(sc);
                    case 4 -> modificarReserva(sc);
                    case 5 -> bajaReserva(sc);
                    case 6 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción inválida.");
                }
            } while (opcion != 6);
        }
    }

    private static void altaVuelo(Scanner sc) {
        try (Connection conn = conectar()) {
            System.out.print("ID Vuelo: ");
            String id = sc.nextLine();
            System.out.print("Origen: ");
            String origen = sc.nextLine();
            System.out.print("Destino: ");
            String destino = sc.nextLine();
            System.out.print("Fecha (YYYY-MM-DD): ");
            String fecha = sc.nextLine();
            System.out.print("Capacidad: ");
            int capacidad = sc.nextInt();
            sc.nextLine();

            String sql = "INSERT INTO Vuelos VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, id);
                ps.setString(2, origen);
                ps.setString(3, destino);
                ps.setDate(4, Date.valueOf(fecha));
                ps.setInt(5, capacidad);
                ps.executeUpdate();
                System.out.println("Vuelo agregado correctamente.");
            }
        } catch (Exception e) {
            System.err.println("Error al agregar vuelo: " + e.getMessage());
        }
    }

    private static void altaPasajero(Scanner sc) {
        try (Connection conn = conectar()) {
            System.out.print("ID Pasajero: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Pasaporte: ");
            String pasaporte = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            String sql = "INSERT INTO Pasajeros VALUES (?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.setString(2, pasaporte);
                ps.setString(3, nombre);
                ps.executeUpdate();
                System.out.println("Pasajero agregado correctamente.");
            }
        } catch (Exception e) {
            System.err.println("Error al agregar pasajero: " + e.getMessage());
        }
    }

    private static void reservarVuelo(Scanner sc) {
        try (Connection conn = conectar()) {
            System.out.print("ID Vuelo: ");
            String idVuelo = sc.nextLine();
            System.out.print("ID Pasajero: ");
            int idPasajero = sc.nextInt();
            System.out.print("Número de Asiento: ");
            int asiento = sc.nextInt();
            sc.nextLine();

            String sql = "INSERT INTO Vuelos_Pasajeros VALUES (?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, idVuelo);
                ps.setInt(2, idPasajero);
                ps.setInt(3, asiento);
                ps.executeUpdate();
                System.out.println("Reserva realizada correctamente.");
            }
        } catch (Exception e) {
            System.err.println("Error al reservar vuelo: " + e.getMessage());
        }
    }

    private static void modificarReserva(Scanner sc) {
        try (Connection conn = conectar()) {
            System.out.print("ID Vuelo: ");
            String idVuelo = sc.nextLine();
            System.out.print("ID Pasajero: ");
            int idPasajero = sc.nextInt();
            System.out.print("Nuevo número de Asiento: ");
            int nuevoAsiento = sc.nextInt();
            sc.nextLine();

            String sql = "UPDATE Vuelos_Pasajeros SET n_asiento = ? WHERE id_vuelo = ? AND id_pasajero = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, nuevoAsiento);
                ps.setString(2, idVuelo);
                ps.setInt(3, idPasajero);
                int filas = ps.executeUpdate();
                if (filas > 0) {
                    System.out.println("Reserva modificada correctamente.");
                } else {
                    System.out.println("Reserva no encontrada.");
                }
            }
        } catch (Exception e) {
            System.err.println("Error al modificar reserva: " + e.getMessage());
        }
    }

    private static void bajaReserva(Scanner sc) {
        try (Connection conn = conectar()) {
            System.out.print("ID Vuelo: ");
            String idVuelo = sc.nextLine();
            System.out.print("ID Pasajero: ");
            int idPasajero = sc.nextInt();
            sc.nextLine();

            String sql = "DELETE FROM Vuelos_Pasajeros WHERE id_vuelo = ? AND id_pasajero = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, idVuelo);
                ps.setInt(2, idPasajero);
                int filas = ps.executeUpdate();
                if (filas > 0) {
                    System.out.println("Reserva eliminada correctamente.");
                } else {
                    System.out.println("Reserva no encontrada.");
                }
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar reserva: " + e.getMessage());
        }
    }
}

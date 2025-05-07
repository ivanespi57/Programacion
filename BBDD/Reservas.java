import java.sql.*;
import java.util.*;
//import java.util.Scanner;

public class Reservas {
    
    static ArrayList<Vuelos> vuelos = new ArrayList<>();
    static ArrayList<Pasajeros> pasajeros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static int menu(){

        System.out.println("MENÚ");
        System.out.println("1. Alta Vuelo");
        System.out.println("2. Alta Pasajero");
        System.out.println("3. Reserva Vuelo");
        System.out.println("4. Modificar reserva");
        System.out.println("5. Baja reserva");
        System.out.println("6. Salir");
        System.out.println("Introduce una opción: ");

        return sc.nextInt();
    }

    public static void altaVuelo(Connection con) {
        try {
            System.out.println("Introduce el ID del vuelo:");
            String idVuelo = sc.next();
            System.out.println("Introduce el origen:");
            String origen = sc.next();
            System.out.println("Introduce el destino:");
            String destino = sc.next();
            System.out.println("Introduce la fecha (YYYY-MM-DD):");
            String fecha = sc.next();
            System.out.println("Introduce la capacidad:");
            int capacidad = sc.nextInt();

            String query = "INSERT INTO Vuelos (Id_Vuelo, origen, destino, fecha, capacidad) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, idVuelo);
            ps.setString(2, origen);
            ps.setString(3, destino);
            ps.setString(4, fecha);
            ps.setInt(5, capacidad);
            ps.executeUpdate();

            System.out.println("Vuelo añadido correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al añadir el vuelo.");
            e.printStackTrace();
        }
    }

    public static void altaPasajero(Connection con) {
        try {
            System.out.println("Introduce el ID del pasajero:");
            int idPasajero = sc.nextInt();
            System.out.println("Introduce el número de pasaporte:");
            String pasaporte = sc.next();
            System.out.println("Introduce el nombre del pasajero:");
            String nombre = sc.next();

            String query = "INSERT INTO Pasajeros (Id_Pasajero, Pasaporte, Nombre_Pasajero) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idPasajero);
            ps.setString(2, pasaporte);
            ps.setString(3, nombre);
            ps.executeUpdate();

            System.out.println("Pasajero añadido correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al añadir el pasajero.");
            e.printStackTrace();
        }
    }

    public static void reservaVuelo(Connection con) {
        try {
            System.out.println("Introduce el ID del vuelo:");
            String idVuelo = sc.next();
            System.out.println("Introduce el ID del pasajero:");
            int idPasajero = sc.nextInt();
            System.out.println("Introduce el número de asiento:");
            int numAsiento = sc.nextInt();

            String query = "INSERT INTO VueloPasajero (Id_Vuelo, Id_Pasajero, Num_Asiento) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, idVuelo);
            ps.setInt(2, idPasajero);
            ps.setInt(3, numAsiento);
            ps.executeUpdate();

            System.out.println("Reserva realizada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al realizar la reserva.");
            e.printStackTrace();
        }
    }

    public static void modificarReserva(Connection con) {
        try {
            System.out.println("Introduce el ID del vuelo:");
            String idVuelo = sc.next();
            System.out.println("Introduce el ID del pasajero:");
            int idPasajero = sc.nextInt();
            System.out.println("Introduce el nuevo número de asiento:");
            int numAsiento = sc.nextInt();

            String query = "UPDATE VueloPasajero SET Num_Asiento = ? WHERE Id_Vuelo = ? AND Id_Pasajero = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, numAsiento);
            ps.setString(2, idVuelo);
            ps.setInt(3, idPasajero);
            ps.executeUpdate();

            System.out.println("Reserva modificada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al modificar la reserva.");
            e.printStackTrace();
        }
    }

    public static void bajaReserva(Connection con) {
        try {
            System.out.println("Introduce el ID del vuelo:");
            String idVuelo = sc.next();
            System.out.println("Introduce el ID del pasajero:");
            int idPasajero = sc.nextInt();

            String query = "DELETE FROM VueloPasajero WHERE Id_Vuelo = ? AND Id_Pasajero = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, idVuelo);
            ps.setInt(2, idPasajero);
            ps.executeUpdate();

            System.out.println("Reserva eliminada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar la reserva.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int n;

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ReservaVuelos", "senia", "seniadb");

            do {
                n = menu();

                switch (n) {
                    case 1:
                        altaVuelo(con);
                        break;
                    case 2:
                        altaPasajero(con);
                        break;
                    case 3:
                        reservaVuelo(con);
                        break;
                    case 4:
                        modificarReserva(con);
                        break;
                    case 5:
                        bajaReserva(con);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (n != 6);

            con.close();
        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }
    }
}

import java.util.*;
import java.sql.*;
import java.util.Scanner;

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

    public static void main(String[] args) {
        int n = 0;

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ReservaVuelos", "senia", "seniadb");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM vuelos");

            while (true) { 
                Vuelos v = new Vuelos();
                v.setId_Vuelos(rs.getString("Id_Vuelo"));
                v.setOrigen(rs.getString("origen"));
                v.setDestino(rs.getString("destino"));
                v.setFecha(rs.get("fecha"));

            }
        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }

        do {
           

            switch (n) {
                case 1:
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                break;
                default:
                    
            }
        }while (true) { 
            
        }
    }
}

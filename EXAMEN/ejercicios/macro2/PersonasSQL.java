package macro2;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class PersonasSQL {

    public static void main(String[] args) {
        ArrayList<Persona> personas = deserializarLista("personas.ser");
        if (personas == null) {
            System.out.println("No se pudo deserializar la lista.");
            return;
        }

        // ⚠️ Configura esto según tu base de datos
        String url = "jdbc:mysql://localhost:3306/testdb"; // cambia "testdb" por tu base de datos
        String user = "root"; // cambia por tu usuario
        String password = "1234"; // cambia por tu contraseña

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            crearTablaSiNoExiste(conn);
            for (Persona p : personas) {
                insertarPersona(conn, p);
            }
            System.out.println("Todos los datos fueron insertados correctamente.");
        } catch (SQLException e) {
            System.err.println("Error en la conexión a base de datos: " + e.getMessage());
        }
    }
    
    

    // Método para deserializar
    public static ArrayList<Persona> deserializarLista(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Persona>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
            return null;
        }
    }

    // Crear tabla si no existe
    public static void crearTablaSiNoExiste(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS personas (" +
                     "id INT PRIMARY KEY, " +
                     "nombre VARCHAR(50), " +
                     "apellido VARCHAR(50), " +
                     "edad INT)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    // Insertar persona
    public static void insertarPersona(Connection conn, Persona p) throws SQLException {
        String sql = "INSERT INTO personas (id, nombre, apellido, edad) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setInt(4, p.getEdad());
            ps.executeUpdate();
        }
    }
}

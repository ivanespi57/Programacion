import java.sql.*;

public class pruebadb {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactos", "senia", "seniadb");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM contacto");

            System.out.println("hola");

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.println(nombre + ": " + edad);
            }

        } catch (SQLException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
        
    }
}

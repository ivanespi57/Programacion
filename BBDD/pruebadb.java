import java.sql.*;
import java.util.Scanner;

public class pruebadb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/contactos", "senia", "seniadb");

            PreparedStatement st = con.prepareStatement("SELECT * FROM contacto WHERE edad > ?");

            System.out.println("Introduce la edad a buscar: ");

            st.setInt(1, sc.nextInt());

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("nombre")+" "+ rs.getInt("edad"));
            }


            // String s = "INSERT INTO contactos.contacto (DNI, NOMBRE, EDAD) VALUES ('12345678F', 'Juan García Rodrigo', 51)";
            // String s = "DELETE FROM contacto WHERE edad >= 50";
            String s = "UPDATE contacto SET edad = 50 WHERE dni='00371569G'";

            int rsa = st.executeUpdate(s);
            System.out.println("Lineas: "+ rsa);

            //ResultSet rs = st.executeQuery("SELECT NOMBRE FROM contacto WHERE EDAD = 53");

            System.out.println("hola");

            /*while (rs.next()) {
                String nombre = rs.getString("NOMBRE");
                int edad = rs.getInt("EDAD");
                System.out.println(nombre + ": " + edad);
            }*/

        } catch (SQLException e) {
            System.out.println("ERROR en la base de datos");
            e.printStackTrace();
        }
        
    }
}

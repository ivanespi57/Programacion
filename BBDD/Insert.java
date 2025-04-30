import java.sql.*;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/contactos", "senia", "seniadb");
            
            String s = "INSERT INTO contactos.contacto (DNI, NOMBRE, EDAD) VALUES (?, ?, ?)";
            
            PreparedStatement st = con.prepareStatement(s);

            System.out.println("Introduce el dni: ");
            st.setString(1, sc.nextLine());
            System.out.println("Introduce el nombre: ");
            st.setString(2, sc.nextLine());
            System.out.println("Introduce la edad: ");
            st.setInt(3, sc.nextInt());

            int rs = st.executeUpdate();
            

        } catch (SQLException e) {
            System.out.println("ERROR en la base de datos");
            e.printStackTrace();
        }
    }
}

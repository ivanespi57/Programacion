import java.sql.*;
import java.util.*;
public class FaltasDaw {


    static Scanner sc = new Scanner(System.in);
    public static int menu(){

        System.out.println("MENÚ");
        System.out.println("1. Alta Alumno/a");
        System.out.println("2. Alta Nuevo Alumno");
        System.out.println("3. Introducir falta");
        System.out.println("4. Salir");
        System.out.println("Introduce una opción: ");

        return sc.nextInt();
    }
    public static void main(String[] args) {
        int n;

        do { 
            n = menu(); sc.nextLine();

            try {
                Connection log = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/FaltasDAW", "senia", "seniadb");
                
                switch (n) {
                    case 1:
                        System.out.println("Introduce el NIA: ");
                        String nia = sc.nextLine();

                        PreparedStatement st = log.prepareStatement("SELECT * FROM Alumnos WHERE NIA = ?");
                        st.setString(1, nia);

                        ResultSet rs1 = st.executeQuery();
                        boolean encontrado = false;
                        while(rs1.next()){
                            encontrado = true;
                            System.out.println("Ya está el alumno registrado");
                        }

                        if(!encontrado){
                            System.out.println("Introduce el nombre: ");
                            String nombre = sc.nextLine();
                            System.out.println("Introduce el edad: ");
                            String edad = sc.nextLine();

                            st = log.prepareStatement("INSERT INTO Alumnos (NIA, Nombre, Edad)VALUES (?,?,?)");
                            st.setString(1, nia);
                            st.setString(2, nombre);
                            st.setString(3, edad);

                            int res = st.executeUpdate();
                            if (res > 0){
                            System.out.println("Alumno dado de alta con éxito");
                            }
                        }

                        
                    break;

                    case 2:
                        System.out.println("Introduce el mes (01-12): ");
                        String mes = sc.nextLine();
                        System.out.println("Introduce el dia (01-30): ");
                        String dia = sc.nextLine();
                        System.out.println("Introduce la sesión (01-13): ");
                        String ses = sc.nextLine();

                        String idSesion = mes + dia + ses;

                        PreparedStatement st2 = log.prepareStatement("SELECT * FROM Sesiones WHERE IdSesion = ?");
                        st2.setString(1, idSesion);

                        ResultSet rs2 = st2.executeQuery();
                        boolean encontrado2 = false;
                        while(rs2.next()){
                            encontrado = true;
                            System.out.println("La sesión ya ha sido registrada");
                        }

                        if(!encontrado2){
                            System.out.println("Introduce el módulo: ");
                            String mod = sc.nextLine();

                            st2 = log.prepareStatement("INSERT INTO Sesiones (IdSesion, Modulo)VALUES (?,?)");
                            st2.setString(1, idSesion);
                            st2.setString(2, mod);
                           
                            int res = st2.executeUpdate();
                            if (res > 0){
                            System.out.println("La nueva sesión se ha registrado");
                            }
                        }

                    case 3:
                        Statement st3 = log.createStatement();
                        ResultSet rs3 = st3.executeQuery("SELECT * FROM Alumnos");

                        
                        
                    case 4:
                        System.out.println("Saliendo....");

                    break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (SQLException e) {
                System.out.println("ERROR en la conexión");
                e.printStackTrace();
            }
        } while (n != 4);
    }
}

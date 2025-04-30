import java.sql.*;
import java.util.Scanner;

public class login {
    static Scanner sc = new Scanner(System.in);
    public static int menu(){

        System.out.println("MENÚ");
        System.out.println("1. Validar usuario");
        System.out.println("2. Registrar nuevo usuario");
        System.out.println("3. Darse de baja");
        System.out.println("4. Salir");
        System.out.println("Introduce una opción: ");

        return sc.nextInt();
    }
    public static void main(String[] args) {
        int n;

        do { 
            n = menu(); sc.nextLine();

            try {
                Connection log = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login", "senia", "seniadb");

                switch (n) {
                    case 1:
                        System.out.println("Introduce usuario: ");
                        String usu = sc.nextLine();
                        System.out.println("Introduce contraseña: ");
                        String con = sc.nextLine();

                        PreparedStatement st = log.prepareStatement("SELECT * FROM usuarios WHERE nom_usu = ?");
                        st.setString(1, usu);
                        ResultSet rs1 = st.executeQuery();
                        boolean encontrado = false;
                        while(rs1.next()){
                            encontrado = true;
                            if(rs1.getString("passwd").equals(con)){
                                System.out.println("Usuario correcto");
                            }else{
                                System.out.println("Contraseña incorrecta");
                            }
                        }

                        if(! encontrado){
                            System.out.println("El usuario no existe");
                        }
                        
                    break;

                    case 2:
                    System.out.println("Introduce usuario: ");
                    String usu2 = sc.nextLine();
                    
                    PreparedStatement st2 = log.prepareStatement("SELECT * FROM usuarios WHERE nom_usu = ?");
                    st2.setString(1, usu2);
                    ResultSet rs2 = st2.executeQuery();
                    boolean encontrado2 = false;
                    while(rs2.next()){
                        encontrado2 = true;
                        System.out.println("El usuario ya existe");
                    }

                    if(! encontrado2){
                        System.out.println("Introduce contraseña: ");
                        String con2 = sc.nextLine();
                        //Insert en la base de datos usu2 + con2
                    }
                    
                    break;

                    case 3:
                    break;
                    
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

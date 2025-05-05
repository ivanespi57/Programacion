import java.sql.*;
import java.util.Scanner;

public class login {
    static Scanner sc = new Scanner(System.in);
    public static int menu(){

        System.out.println("MENÚ");
        System.out.println("1. Validar usuario");
        System.out.println("2. Registrar nuevo usuario");
        System.out.println("3. Darse de baja");
        System.out.println("3. Modificar contraseña");
        System.out.println("5. Salir");
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
                        st2 = log.prepareStatement("INSERT INTO usuarios (nom_usu, passwd) VALUES (?, ?)");
                       
                        st2.setString(1, usu2);
                        st2.setString(2, con2);
                        
                        int res = st2.executeUpdate();
                        if (res > 0){
                            System.out.println("Usuario añadido");
                        }
                    }
                    
                    break;

                    case 3:
                    System.out.println("Introduce usuario: ");
                    String usu3 = sc.nextLine();
                    
                    PreparedStatement st3 = log.prepareStatement("SELECT * FROM usuarios WHERE nom_usu = ?");
                    st3.setString(1, usu3);
                    ResultSet rs3 = st3.executeQuery();
                    boolean encontrado3 = false;
                    while(rs3.next()){
                        encontrado3 = true;
                        System.out.println("Introduce contraseña: ");
                        String con3 = sc.nextLine();
                        if (rs3.getString("passwd").equals(con3)){
                            
                            st3 = log.prepareStatement("DELETE FROM usuarios WHERE nom_usu = ?");
                            st3.setString(1, usu3);
                            int res = st3.executeUpdate();

                            if (res > 0){
                                System.out.println("Usuario borrado");
                            }
                        }else{
                            System.out.println("Contraseña incorrecta");
                        }
                    }

                    if(! encontrado3){
                        System.out.println("El usuario no existe");
                    }
                    break;
                    
                    case 4:
                    System.out.println("Introduce usuario: ");
                    String usu4 = sc.nextLine();
                    
                    PreparedStatement st4 = log.prepareStatement("SELECT * FROM usuarios WHERE nom_usu = ?");
                    st4.setString(1, usu4);
                    ResultSet rs4 = st4.executeQuery();
                    boolean encontrado4 = false;
                    while(rs4.next()){
                        encontrado4 = true;
                        System.out.println("Introduce contraseña: ");
                        String con4 = sc.nextLine();
                        if (rs4.getString("passwd").equals(con4)){
                            System.out.println("Introduce nueva contraseña");
                            String npass = sc.nextLine();
                            System.out.println("Confirma la nueva contraseña");
                            String npass2 = sc.nextLine();
                            
                            if(npass.equals(npass2)){
                                st4 = log.prepareStatement("UPDATE usuarios SET passwd = ? WHERE  nom_usu = ?");
                                st4.setString(1, npass);
                                st4.setString(2, usu4);
                                int res = st4.executeUpdate();

                                if (res > 0) {
                                    System.out.println("Contraseña modificada correctamente");
                                }
                            }else{
                                System.out.println("Las contraseñas no coinciden");
                            }
                        }else{
                            System.out.println("Contraseña incorrecta");
                        }

                       
                    }

                    if(! encontrado4){
                        System.out.println("El usuario no existe");
                    }
                    break;

                    case 5: 
                        System.out.println("Saliendo......");
                    break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (SQLException e) {
                System.out.println("ERROR en la conexión");
                e.printStackTrace();
            }
        } while (n != 5);
    
    }
}

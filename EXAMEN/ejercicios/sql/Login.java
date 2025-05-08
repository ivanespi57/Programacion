package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
    	//datos de conexion
        String url = "jdbc:mysql://localhost:3306/sys"; 
        String user = "senia";
        String password = "seniadb";
        //intenta crear la conexion
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.\n");

                
                if (!checkIfTableExists(connection, "Usuarios")) {
                    createUsersTable(connection);
                }

                Scanner scanner = new Scanner(System.in);
                boolean exit = false;

                while (!exit) {
                    System.out.println("Menú de gestión de acceso:");
                    System.out.println("1. Validar usuario");
                    System.out.println("2. Registrar nuevo usuario");
                    System.out.println("3. Darse de baja");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");

                    int option = scanner.nextInt();
                    scanner.nextLine(); 

                    switch (option) {
                        case 1:
                            validateUser(connection);
                            break;
                        case 2:
                            createUser(connection);
                            break;
                        case 3:
                            deleteUser(connection);
                            break;
                        case 4:
                            exit = true;
                            System.out.println("Saliendo...\n");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.\n");
                    }
                }
                scanner.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
        }
    }

    private static void deleteUser(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de usuario que desea dar de baja: ");
        String username = scanner.nextLine();

        if (userExists(connection, username)) {
            System.out.print("Ingrese la contraseña para confirmar la baja: ");
            String password = scanner.nextLine();

            if (isPasswordCorrect(connection, username, password)) {
                removeUser(connection, username);
                System.out.println("Usuario dado de baja exitosamente.\n");
            } else {
                System.out.println("Contraseña incorrecta. No se puede dar de baja el usuario.\n");
            }
        } else {
            System.out.println("El usuario no existe.\n");
        }
    }

    private static boolean isPasswordCorrect(Connection connection, String username, String password) {
        String query = "SELECT passwd FROM Usuarios WHERE nom_usu = ?";
        //prepara la peticion de buscar la contraseña de ? usuario
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        	//? se convierte al nombre de usuario
            pstmt.setString(1, username);
            //se guarda el resultado de la peticion
            ResultSet rs = pstmt.executeQuery();
            //si hay resultado
            if (rs.next()) {
            	//comprueba si el password obtenido es igual al pasado por el usuario
                return rs.getString("passwd").equals(password);
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar la contraseña: " + e.getMessage());
        }
        return false;
    }

    private static void removeUser(Connection connection, String username) {
        String query = "DELETE FROM Usuarios WHERE nom_usu = ?";
        //prepara la peticion de eliminar de usuarios al usuario ?
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        	//? se convierte al nombre de usuario
            pstmt.setString(1, username);
            //se ejecuta la peticion
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al dar de baja el usuario: " + e.getMessage());
        }
    }

    private static void insertUser(Connection connection, String username, String password) {
        String query = "INSERT INTO Usuarios (nom_usu, passwd) VALUES (?, ?)";
        //se prepara la peticion de crear en la tabla Usuarios un usuario con valores ? ? sobre los campos nom_usu y passwd
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        	//? se convierten a los valores
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            //se ejecuta
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al registrar el usuario: " + e.getMessage());
        }
    }

    private static void createUser(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        while (true) {
            System.out.print("Ingrese un nombre de usuario (o 'exit' para salir): ");
            username = scanner.nextLine();
            if (username.equalsIgnoreCase("exit")) {
                return; 
            }
            if (!userExists(connection, username)) {
                System.out.print("Introduzca la contraseña: ");
                password = scanner.nextLine();
                insertUser(connection, username, password);
                System.out.println("Usuario creado exitosamente.\n");
                return; // Salir después de crear el usuario
            } else {
                System.out.println("Nombre de usuario en uso. Intente con otro.\n");
            }
        }
    }

    private static void validateUser(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        String username;
        int attempts = 0;
        final int maxAttempts = 3;

        while (true) {
            System.out.print("Ingrese el nombre de usuario (o 'exit' para salir): ");
            username = scanner.nextLine();

            if (username.equalsIgnoreCase("exit")) {
                return; 
            }

            if (userExists(connection, username)) {
                String password = promptForPassword(scanner);
                while (attempts < maxAttempts) {
                    if (checkPassword(connection, username, password)) {
                        System.out.println("Login correcto.\n");
                        return; 
                    } else {
                        attempts++;
                        if (attempts < maxAttempts) {
                            System.out.println("Contraseña incorrecta. Intente de nuevo.");
                            password = promptForPassword(scanner);
                        }
                    }
                }
                System.out.println("Demasiados intentos fallidos. Regresando al menú principal.\n");
                return; 
            } else {
                System.out.println("Usuario no encontrado. Intente de nuevo.\n");
            }
        }
    }

    private static boolean userExists(Connection connection, String username) {
        String query = "SELECT COUNT(*) FROM Usuarios WHERE nom_usu = ?";
        //se prepara la peticion que contara los usuarios de la tabla Usuarios que tengan el nombre ?
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        	//? se convierte al nombre de usuario pasado
            pstmt.setString(1, username);
            //se ejecuta la peticion
            ResultSet rs = pstmt.executeQuery();
            //si hay resultado
            if (rs.next()) {
            	//se escoge la primera respuesta y se comprueba si es mayor que 0 o sea que ha habido respuesta
                return rs.getInt(1) > 0; 
            }
        } catch (SQLException e) {
            System.out.println("Error al comprobar el usuario: " + e.getMessage());
        }
        return false;
    }

    private static String promptForPassword(Scanner scanner) {
        System.out.print("Ingrese la contraseña: ");
        return scanner.nextLine();
    }

    private static boolean checkPassword(Connection connection, String username, String password) {
        String query = "SELECT passwd FROM Usuarios WHERE nom_usu = ?";
        //se prepara la peticion que busca la contraseña de ? usuario
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        	//? se convierte al usuario
            pstmt.setString(1, username);
            //se ejecuta la peticion
            ResultSet rs = pstmt.executeQuery();
            //si hay resultado
            if (rs.next()) {
            	//se comprueba si la contraseña encontrada es como la que se ha pasado
                return rs.getString("passwd").equals(password);
            }
        } catch (SQLException e) {
            System.out.println("Error al comprobar la contraseña: " + e.getMessage());
        }
        return false;
    }

    private static boolean checkIfTableExists(Connection connection, String tableName) throws SQLException {
    	//busa si hay tablas con tableName nombre
        String query = "SHOW TABLES LIKE '" + tableName + "'";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            return rs.next(); 
        }
    }

    private static void createUsersTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE Usuarios (" +
                "id_usu INT AUTO_INCREMENT PRIMARY KEY, " +
                "nom_usu VARCHAR(100), " +
                "passwd VARCHAR(100)" +
                ")";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(createTableSQL);
            System.out.println("Tabla 'Usuarios' creada exitosamente.\n");
        }
    }
}
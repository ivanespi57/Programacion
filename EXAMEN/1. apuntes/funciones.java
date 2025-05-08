package sql;

import java.sql.*;

public class funciones {

	//Eliminar genéricamente un registro
	public static boolean deleteByColumn(Connection connection, String tableName, String columnName, String value) {
	    String query = "DELETE FROM " + tableName + " WHERE " + columnName + " = ?";
	    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	        pstmt.setString(1, value);
	        return pstmt.executeUpdate() > 0;
	    } catch (SQLException e) {
	        System.out.println("Error al eliminar en " + tableName + ": " + e.getMessage());
	        return false;
	    }
	}
	
	// Insertar genéricamente valores
	public static boolean insertIntoTable(Connection connection, String tableName, String[] columns, String[] values) {
	    if (columns.length != values.length) return false;

	    StringBuilder cols = new StringBuilder();
	    StringBuilder qs = new StringBuilder();
	    for (int i = 0; i < columns.length; i++) {
	        cols.append(columns[i]);
	        qs.append("?");
	        if (i < columns.length - 1) {
	            cols.append(", ");
	            qs.append(", ");
	        }
	    }

	    String query = "INSERT INTO " + tableName + " (" + cols + ") VALUES (" + qs + ")";
	    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	        for (int i = 0; i < values.length; i++) {
	            pstmt.setString(i + 1, values[i]);
	        }
	        return pstmt.executeUpdate() > 0;
	    } catch (SQLException e) {
	        System.out.println("Error al insertar en " + tableName + ": " + e.getMessage());
	        return false;
	    }
	}
	
	//Verificar si un valor existe en una columna
	public static boolean valueExists(Connection connection, String tableName, String columnName, String value) {
	    String query = "SELECT COUNT(*) FROM " + tableName + " WHERE " + columnName + " = ?";
	    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	        pstmt.setString(1, value);
	        ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	            return rs.getInt(1) > 0;
	        }
	    } catch (SQLException e) {
	        System.out.println("Error al comprobar existencia en " + tableName + ": " + e.getMessage());
	    }
	    return false;
	}
	//comparar valores
	public static boolean matchValue(Connection connection, String tableName, String targetColumn, String whereColumn, String whereValue, String expectedValue) {
	    String query = "SELECT " + targetColumn + " FROM " + tableName + " WHERE " + whereColumn + " = ?";
	    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	        pstmt.setString(1, whereValue);
	        ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	            return rs.getString(targetColumn).equals(expectedValue);
	        }
	    } catch (SQLException e) {
	        System.out.println("Error al comparar valor en " + tableName + ": " + e.getMessage());
	    }
	    return false;
	}

/*
 * 
 * 🧠 ¿Cómo usar esto?
Ejemplo: Eliminar perro por nombre
deleteByColumn(connection, "Perros", "nombre", "Rocky");

Ejemplo: Insertar nuevo usuario
insertIntoTable(connection, "Usuarios", new String[]{"nom_usu", "passwd"}, new String[]{"juan", "1234"});

Ejemplo: Verificar si existe el usuario "ana"
valueExists(connection, "Usuarios", "nom_usu", "ana");

Ejemplo: Validar contraseña
matchValue(connection, "Usuarios", "passwd", "nom_usu", "ana", "1234");

 */


}

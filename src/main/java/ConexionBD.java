import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el controlador de MySQL
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", ""); // Establecer la conexión
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador de MySQL: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión: " + e.getMessage());
        }
        return conexion;
    }
}

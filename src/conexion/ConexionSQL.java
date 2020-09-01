package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSQL {

    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Singa_fj212502a692");
            JOptionPane.showMessageDialog(null, "Conexión exitosa con Base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());
        }
        
        return conectar;
        
    }

}

package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSQL {

    Connection conectar = null;
    Connection conexion =null;
    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Singa_fj212502a692");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());
        }
        
        return conectar;
        
    }
    
    public Connection Connect2(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba01", "root", "Singa_fj212502a692");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());
        }
        
        return conexion;
    }

}

package implementacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import interfaces.ConexionBD;

public class ConexionBDImpl implements ConexionBD {
	private static ConexionBDImpl instance;
    private Connection conexion;

    private ConexionBDImpl() {
        conexion = obtenerConexion();
    }

    public static ConexionBDImpl obtenerInstancia() {
        if (instance == null) {
        	instance = new ConexionBDImpl();
        }
        return instance;
    }

    public Connection obtenerConexion() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/prevencion_riesgos";
            String usuario = "root";
            String contraseña = "AcdL9237";

            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conexion;
    }
}

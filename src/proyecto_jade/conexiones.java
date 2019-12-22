package proyecto_jade;

import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author Mauro
 */
public class conexiones {

    public Connection con;

    public Connection conectar() throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/agentes";
        Class.forName(driver);
        return DriverManager.getConnection(url, "root", "");
    }

    public Connection AbrirConexion() throws ClassNotFoundException, SQLException {
        con = conectar();
        return con;
    }

    public void CerrarConexion() throws SQLException {
        con.close();
    }

}

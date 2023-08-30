package pe.edu.uni.educaapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {

    private AccesoDB() {
    }

    public static Connection getConnection() throws SQLException {
        Connection cn = null;
        // Parámetros
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String urlDB = "jdbc:sqlserver://localhost:1433;databaseName=EDUCA;encrypt=true;TrustServerCertificate=True;";
        String user = "sa";
        String pass = "sql";
        try {
            // Conexión con la BD
            Class.forName(driver).getDeclaredConstructor().newInstance();
            cn = DriverManager.getConnection(urlDB, user, pass);
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontro el driver de la BD.");
        } catch (Exception e) {
            throw new SQLException("No se puede establecer "
                    + "conexión de la BD.");
        }
        return cn;
    }

}

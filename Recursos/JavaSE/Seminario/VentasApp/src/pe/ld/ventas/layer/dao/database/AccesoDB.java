package pe.ld.ventas.layer.dao.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class AccesoDB {

    private AccesoDB() {
    }

    public static Connection getConnection() throws SQLException{
        Connection cn = null;
        try {
            // --------------------------------------------------
            // Paso 1: Cargar el driver a memoria
            Class.forName("oracle.jdbc.OracleDriver").getDeclaredConstructor().newInstance();
            // Paso 2: Obtener el objeto Connection
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            cn = DriverManager.getConnection(url, "sistemaventas", "admin");
            // --------------------------------------------------
        } catch (SQLException e) {
            throw e;
        } catch(ClassNotFoundException e){
            throw new SQLException("No se encontró el driver de la base de datos.");
        } catch(Exception e){
            throw new SQLException("No se puede establecer la conexión con la base de datos.");
        }
        return cn;
    }
}

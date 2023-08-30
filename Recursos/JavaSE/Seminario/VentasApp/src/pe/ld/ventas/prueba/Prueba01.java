package pe.ld.ventas.prueba;

import java.sql.Connection;
import pe.ld.ventas.layer.dao.database.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexión Ok.");
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}

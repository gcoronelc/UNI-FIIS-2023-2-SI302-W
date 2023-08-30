package pe.ld.ventas.layer.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.ld.ventas.entity.Producto;
import pe.ld.ventas.layer.dao.database.AccesoDB;
import pe.ld.ventas.layer.dao.interfaces.ReportesDao;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class OracleReportesDao implements ReportesDao{

    @Override
    public List<Map<String, ?>> traerEmpleados() {
        String query = "SELECT IDEMP, NOMBRE, APELLIDO, USUARIO FROM SISTEMAVENTAS.EMPLEADO";
        List<Map<String,?>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            PreparedStatement pstm = cn.prepareStatement(query);
            ResultSet rs = pstm.executeQuery(query);
            lista = JdbcUtil.rsToList(rs);
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch(Exception e){
            throw new RuntimeException("No se puede consultar la base de datos.");
        }finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }

}

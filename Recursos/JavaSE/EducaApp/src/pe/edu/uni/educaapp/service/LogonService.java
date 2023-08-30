package pe.edu.uni.educaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.uni.educaapp.db.AccesoDB;
import pe.edu.uni.educaapp.dto.EmpleadoDto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class LogonService {

    private Connection cn;

    public EmpleadoDto validarUsuario(String usuario, String clave) {
        EmpleadoDto dto = null;
        final String SQL = "select idempleado, apellido, nombre, direccion, email, "
                + "usuario, '*****' clave "
                + "from empleado where usuario=? and clave=?";
        try {
            cn = AccesoDB.getConnection();
            PreparedStatement pstm = cn.prepareStatement(SQL);
            pstm.setString(1, usuario);
            pstm.setString(2, clave);
            ResultSet rs = pstm.executeQuery();
            if (!rs.next()) {
                throw new SQLException("Datos incorrectos.");
            }
            dto = new EmpleadoDto();
            dto.setId(rs.getInt("idempleado"));
            dto.setApellido(rs.getString("apellido"));
            dto.setNombre(rs.getString("nombre"));
            dto.setDireccion(rs.getString("direccion"));
            dto.setEmail(rs.getString("email"));
            dto.setUsuario(rs.getString("usuario"));
            dto.setClave(rs.getString("clave"));
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error en el proceso, intentelo nuevamente.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return dto;
    }

    
}

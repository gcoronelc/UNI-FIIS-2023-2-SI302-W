package pe.edu.uni.educaapp.service;

import pe.edu.uni.educaapp.service.spec.CrudServiceSpec;
import pe.edu.uni.educaapp.service.spec.RowMapper;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import pe.edu.uni.educaapp.db.AccesoDB;
import pe.edu.uni.educaapp.dto.CursoDto;

public class CrudCursoService 
        implements CrudServiceSpec<CursoDto>, RowMapper<CursoDto>{
    
        // Consultas base
    private final String SQL_SELECT = "";
    private final String SQL_INSERT = "INSERT INTO CURSO(CUR_NOMBRE,CUR_VACANTES,CUR_MATRICULADOS,CUR_PROFESOR,CUR_PRECIO) VALUES(?,?,?,?,?) ";
    private final String SQL_UPDATE = "";
    private final String SQL_DELETE = "";
    
    private Connection cn;

    @Override
    public CursoDto read(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CursoDto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CursoDto> readAll(CursoDto model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(CursoDto model) {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int id;
        final String SQL_ID = "select max(alu_id) id from ALUMNO";
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            // Insertar fila
            pstm = cn.prepareStatement(SQL_INSERT);
            pstm.setString(1, model.getNombre());
            pstm.setInt(2, model.getVacantes());
            pstm.setInt(3, model.getMatriculados());
            pstm.setString(4, model.getProfesor());
            pstm.setDouble(5, model.getPrecio());
            pstm.executeUpdate();
            pstm.close();
            // Leer el codigo
            final String GET_ID = "SELECT IDENT_CURRENT('Curso') as ID";
            pstm = cn.prepareStatement(GET_ID);
            rs = pstm.executeQuery();
            rs.next();
            id = rs.getInt("ID");
            rs.close();
            pstm.close();
            // Final
            model.setId(id);
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback(); // Cancela todos los cambios
            } catch (Exception e1) {
            }
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try {
                cn.rollback(); // Cancela todos los cambios
            } catch (Exception e1) {
            }
            String s = "Error en el proceso, intentelo mas tarde.";
            throw new RuntimeException(s);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void update(CursoDto model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CursoDto mapRow(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

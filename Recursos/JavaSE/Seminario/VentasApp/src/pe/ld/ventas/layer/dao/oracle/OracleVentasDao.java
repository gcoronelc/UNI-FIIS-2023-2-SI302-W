package pe.ld.ventas.layer.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pe.ld.ventas.dto.VentaDto;
import pe.ld.ventas.dto.VentaItem;
import pe.ld.ventas.layer.dao.database.AccesoDB;
import pe.ld.ventas.layer.dao.interfaces.VentasDao;

public class OracleVentasDao implements VentasDao {

    @Override
    public void grabarVenta(VentaDto ventaDto) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            // Inicindo la Tx
            cn.setAutoCommit(false);
            // Obtener el idventa
            String query = "select sq_venta.nextval id from dual";
            Statement stm = cn.createStatement();
            ResultSet rset = stm.executeQuery(query);
            rset.next();
            int idventa = rset.getInt("id");
            // Grabar venta
            query = "insert into venta(IDVENTA,CLIENTE,IDEMP,"
                    + "FECHA,IMPORTE) values(?,?,?,sysdate,?)";
            PreparedStatement pstm = cn.prepareStatement(query);
            pstm.setInt(1, idventa);
            pstm.setString(2, ventaDto.getCliente());
            pstm.setInt(3, ventaDto.getIdEmpl());
            pstm.setDouble(4, ventaDto.getImporte());
            pstm.executeUpdate();
            // Grabar los detalles
            query = "insert into detalle(IDVENTA,IDPROD,CANT,"
                    + "PRECIO,SUBTOTAL) values(?,?,?,?,?)";
            pstm = cn.prepareStatement(query);
            PreparedStatement pstmLeerStock = cn.prepareStatement("select stock from producto where idprod = ? for update");
            PreparedStatement pstmActStock = cn.prepareStatement("update producto set stock = ? where idprod = ?");
            int stock;
            for (VentaItem item : ventaDto.getDetalle()) {
                // Verificar stock
                pstmLeerStock.setInt(1, item.getIdprod());
                ResultSet rs = pstmLeerStock.executeQuery();
                rs.next();
                stock = rs.getInt("stock");
                rs.close();
                if (stock < item.getCant()) {
                    throw new SQLException("No existe stock suficiente de " + item.getNombre() + ".");
                }
                // Actualizar stock
                pstmActStock.setInt(1, stock - item.getCant());
                pstmActStock.setInt(2, item.getIdprod());
                pstmActStock.executeUpdate();
                // Grabar detalle
                pstm.setInt(1, idventa);
                pstm.setInt(2, item.getIdprod());
                pstm.setInt(3, item.getCant());
                pstm.setDouble(4, item.getPrecio());
                pstm.setDouble(5, item.getSubtotal());
                pstm.executeUpdate();
            }
            // Grabar pagos
            /*  Falta implementar */

            // confirmar Tx
            cn.commit();
            ventaDto.setIdventa(idventa);
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            throw new RuntimeException("Error en el proceso Grabar Venta.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

}

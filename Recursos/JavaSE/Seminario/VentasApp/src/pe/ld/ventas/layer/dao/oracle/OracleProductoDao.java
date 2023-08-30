package pe.ld.ventas.layer.dao.oracle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import pe.ld.ventas.entity.Producto;
import pe.ld.ventas.layer.dao.database.AccesoDB;
import pe.ld.ventas.layer.dao.interfaces.ProductoDao;

public class OracleProductoDao implements ProductoDao {

	/**
	 * Control de transacción desde el cliente
	 * @param prod 
	 */
    @Override
    public void create1(Producto prod) {
        Connection cn = null;
        try {
            // Variables
			Statement stm;
			PreparedStatement pstm;
            String query;
            int id;
            ResultSet rs;
            // Conexión
            cn = AccesoDB.getConnection();
            // Iniciar la Tx
            cn.setAutoCommit(false);
            // Obtener el Id del producto
            query = "select sq_producto.NextVal id from dual";
            stm = cn.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            id = rs.getInt("id");
            // Insertar el producto
            query = "insert into producto"
                    + "(idprod,idcat,nombre,precio,stock) "
                    + "values(?,?,?,?,?) ";
            pstm = cn.prepareStatement(query);
            pstm.setInt(1, id);
            pstm.setInt(2, prod.getIdcat());
            pstm.setString(3, prod.getNombre());
            pstm.setDouble(4, prod.getPrecio());
            pstm.setInt(5, prod.getStock());
            pstm.executeUpdate();
            // Retornar el id
            prod.setIdprod(id);
            // Confirmar Tx
            cn.commit();
            // Cerrar objetos
            rs.close();
            stm.close();
            pstm.close();
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
            throw new RuntimeException("Error en el proceso crear producto.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

	/**
	 * Control de transacción en el procedimiento almacenado
	 * @param prod 
	 */
    @Override
    public void create2(Producto prod) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(true);
            String query = "{call usp_crea_producto(?,?,?,?,?)}";
            CallableStatement cstm = cn.prepareCall(query);
            cstm.registerOutParameter(1, Types.INTEGER);
            cstm.setInt(2, prod.getIdcat());
            cstm.setString(3, prod.getNombre());
            cstm.setDouble(4, prod.getPrecio());
            cstm.setInt(5, prod.getStock());
            cstm.executeUpdate();
            prod.setIdprod(cstm.getInt(1));
            cstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No se puede crear el producto.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public List<Producto> readAll() {
        List<Producto> lista = new ArrayList<Producto>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String query = "select idprod, idcat, nombre, precio, stock "
                    + "from producto ";
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Producto o = rsToBean(rs);
                lista.add(o);
            }
            rs.close();
            stm.close();
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

    @Override
    public Producto readForId(int id) {
        Producto o = null;
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String query = "select idprod, idcat, nombre, precio, stock "
                    + "from producto "
                    + "where idprod = ?";
            PreparedStatement pstm = cn.prepareStatement(query);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                o = rsToBean(rs);
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error en la lectura del producto.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return o;
    }

    @Override
    public List<Producto> readForName(String name) {
        List<Producto> lista = new ArrayList<Producto>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String query = "select idprod, idcat, nombre, precio, stock "
                    + "from producto "
                    + "where upper(nombre) like ?";
            PreparedStatement pstm = cn.prepareStatement(query);
            name = "%" + name.toUpperCase() + "%";
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Producto o = rsToBean(rs);
                lista.add(o);
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch(Exception e){
            throw new RuntimeException("No se puede consultar la base de datos.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }

    @Override
    public void update(Producto prod) {
		Connection cn = null;
        try {
            // Variables
			PreparedStatement pstm;
            String query;
            int filas;
            // Conexión
            cn = AccesoDB.getConnection();
            // Iniciar la Tx
            cn.setAutoCommit(false);
            // Insertar el producto
            query = "update producto set idcat=?, nombre=?, precio=?, "
					+ "stock=? where idprod = ? ";
            pstm = cn.prepareStatement(query);
            pstm.setInt(1, prod.getIdcat());
            pstm.setString(2, prod.getNombre());
            pstm.setDouble(3, prod.getPrecio());
            pstm.setInt(4, prod.getStock());
			pstm.setInt(5, prod.getIdprod());
            filas = pstm.executeUpdate();
			if(filas == 0){
				throw new SQLException("Producto no existe.");
			}
            // Confirmar Tx
            cn.commit();
            // Cerrar objetos
            pstm.close();
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
            throw new RuntimeException("Error en el proceso crear producto.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void delete(int id) {
        Connection cn = null;
		String query;
		PreparedStatement pstm;
		ResultSet rs;
		int cont;
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
			// Verificar si el producto rgistra ventas
            query = "select count(*) cont from detalle where idprod = ?";
			pstm = cn.prepareStatement(query);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			rs.next();
			cont = rs.getInt("cont");
			rs.close();
			pstm.close();
			if(cont > 0){
				throw new SQLException("El producto registra ventas, no se puede eliminar.");
			}
			// Eliminar el producto
			query = "delete from producto where idprod=?";
            pstm = cn.prepareStatement(query);
            pstm.setInt(1, id);
            int filas = pstm.executeUpdate();
            if (filas == 0) {
                throw new SQLException("Código de producto no existe, "
                        + "posiblemente fue eliminado por otro usuario.");
            }
            cn.commit();
			pstm.close();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            throw new RuntimeException(e.getMessage());
        } catch(Exception e){
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            throw new RuntimeException("Error al tratar de eliminar el producto.");
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

    private Producto rsToBean(ResultSet rs) throws SQLException {
        Producto o = new Producto();
        o.setIdprod(rs.getInt("idprod"));
        o.setIdcat(rs.getInt("idcat"));
        o.setNombre(rs.getString("nombre"));
        o.setPrecio(rs.getDouble("precio"));
        o.setStock(rs.getInt("stock"));
        return o;
    }
	
}

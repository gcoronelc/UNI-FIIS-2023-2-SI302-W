package pe.ld.ventas.layer.dao.oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pe.ld.ventas.entity.Categoria;
import pe.ld.ventas.layer.dao.database.AccesoDB;
import pe.ld.ventas.layer.dao.interfaces.CategoriaDao;

public class OracleCategoriaDao implements CategoriaDao {

	@Override
	public void create(Categoria o) {
	}

	@Override
	public List<Categoria> readAll() {
		List<Categoria> lista = new ArrayList<Categoria>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String query = "select idcat, nombre from categoria";
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				Categoria bean = rsToBean(rs);
				lista.add(bean);
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch(Exception e){
			throw new RuntimeException("Error en la cansulta de categorías.");
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}

	@Override
	public Categoria readForId(int id) {
		return null;
	}

	@Override
	public List<Categoria> readForCriteria(String dato){
		return null;
	}

	@Override
	public void update(Categoria cat){
	}

	@Override
	public void delete(int id){
	}

	private Categoria rsToBean(ResultSet rs) throws SQLException {
		Categoria bean = new Categoria();
		bean.setIdcat(rs.getInt("idcat"));
		bean.setNombre(rs.getString("nombre"));
		return bean;
	}
}

package pe.ld.ventas.layer.dao.interfaces;

import java.util.List;
import pe.ld.ventas.entity.Producto;

public interface ProductoDao {

	/**
	 * Transacción controlada desde el cliente
	 *
	 * @param prod
	 */
	void create1(Producto prod);

	/*
	 * Transacción controlada en la Base de Datos
	 */
	void create2(Producto prod);

	List<Producto> readAll();

	Producto readForId(int id);

	List<Producto> readForName(String name);

	void update(Producto prod);

	void delete(int id);
}

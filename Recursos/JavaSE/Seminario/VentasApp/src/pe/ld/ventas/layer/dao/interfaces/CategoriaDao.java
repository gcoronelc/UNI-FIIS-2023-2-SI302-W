package pe.ld.ventas.layer.dao.interfaces;

import java.util.List;
import pe.ld.ventas.entity.Categoria;

public interface CategoriaDao {

	void create(Categoria cat);

	List<Categoria> readAll();

	Categoria readForId(int id);

	List<Categoria> readForCriteria(String dato);

	void update(Categoria cat);

	void delete(int id);
}

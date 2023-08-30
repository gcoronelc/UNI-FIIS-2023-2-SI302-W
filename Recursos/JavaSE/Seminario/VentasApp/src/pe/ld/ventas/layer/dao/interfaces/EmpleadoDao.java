package pe.ld.ventas.layer.dao.interfaces;

import java.util.List;
import pe.ld.ventas.entity.Empleado;

public interface EmpleadoDao {

	void create(Empleado emp);

	List<Empleado> readAll();

	Empleado readForId(int id);

	Empleado readForUser(String user);

	List<Empleado> readForCriteria(String dato);

	void update(Empleado emp);

	void delete(int id);
}

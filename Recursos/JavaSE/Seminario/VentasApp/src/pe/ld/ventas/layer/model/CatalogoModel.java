package pe.ld.ventas.layer.model;

import java.util.List;
import pe.ld.ventas.entity.Categoria;
import pe.ld.ventas.entity.Producto;
import pe.ld.ventas.layer.dao.interfaces.CategoriaDao;
import pe.ld.ventas.layer.dao.oracle.OracleCategoriaDao;
import pe.ld.ventas.layer.dao.oracle.OracleProductoDao;

public class CatalogoModel {

    private OracleProductoDao productoDao;

    public CatalogoModel() {
        productoDao = new OracleProductoDao();
    }

    public List<Producto> buscar(String nombre) {
        return productoDao.readForName(nombre);
    }

    public void eliminar(int id) {
        productoDao.delete(id);
    }

    public List<Categoria> traerCategorias() {
        CategoriaDao dao = new OracleCategoriaDao();
        return dao.readAll();
    }

    public Producto buscar(int id) {
        return productoDao.readForId(id);
    }

    /**
     * Control de transacción en el cliente
     *
     * @param prod
     */
    public void insertar1(Producto prod) {
        productoDao.create1(prod);
    }

    /**
     * Control de trabsacción en el procedimiento almacenado
     *
     * @param prod
     */
    public void insertar2(Producto prod) {
        productoDao.create2(prod);
    }

    public void actualizar(Producto prod) {
        productoDao.update(prod);
    }
}

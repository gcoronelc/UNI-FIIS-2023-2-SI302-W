package pe.ld.ventas.layer.model;

import pe.ld.ventas.dto.LogonDto;
import pe.ld.ventas.entity.Empleado;
import pe.ld.ventas.layer.dao.interfaces.EmpleadoDao;
import pe.ld.ventas.layer.dao.oracle.OracleEmpleadoDao;

public class LogonModel {

    public Empleado validarUsuario(LogonDto dto) {
        Empleado emp;
        EmpleadoDao dao = new OracleEmpleadoDao();
        emp = dao.readForUser(dto.getUsuario());
        if (emp == null) {
            throw new RuntimeException("Usuario no es correcto.");
        }
        if (!emp.getClave().equals(dto.getClave())) {
            throw new RuntimeException("Clave no es correcta.");
        }
        return emp;
    }
}

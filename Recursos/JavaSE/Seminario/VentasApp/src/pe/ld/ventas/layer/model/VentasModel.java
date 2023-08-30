package pe.ld.ventas.layer.model;

import pe.ld.ventas.dto.VentaDto;
import pe.ld.ventas.layer.dao.interfaces.VentasDao;
import pe.ld.ventas.layer.dao.oracle.OracleVentasDao;

public class VentasModel {

    public void grabar(VentaDto ventaDto) throws Exception {
        VentasDao ventas = new OracleVentasDao();
        ventas.grabarVenta(ventaDto);
    }
}

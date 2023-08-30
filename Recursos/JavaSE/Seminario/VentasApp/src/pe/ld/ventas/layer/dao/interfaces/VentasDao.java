package pe.ld.ventas.layer.dao.interfaces;

import pe.ld.ventas.dto.VentaDto;

public interface VentasDao {
	
	void grabarVenta( VentaDto ventaDto);
}

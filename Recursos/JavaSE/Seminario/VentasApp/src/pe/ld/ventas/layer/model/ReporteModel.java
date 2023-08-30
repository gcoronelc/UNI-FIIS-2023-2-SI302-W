package pe.ld.ventas.layer.model;

import java.util.List;
import java.util.Map;
import pe.ld.ventas.layer.dao.oracle.OracleReportesDao;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class ReporteModel {
    
    private OracleReportesDao reporteDao;

    public ReporteModel() {
        reporteDao = new OracleReportesDao();
    }
    
    
    
    public  List<Map<String,?>> traerEmpleados(){
        return reporteDao.traerEmpleados();
    }

}

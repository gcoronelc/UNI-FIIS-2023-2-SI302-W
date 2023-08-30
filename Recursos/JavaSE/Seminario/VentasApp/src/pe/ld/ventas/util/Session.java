package pe.ld.ventas.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Session {

    private static Map<String, Object> datos;

    static {
        datos = new HashMap<String, Object>();
    }

    /**
     * Constructor privado para que no se puedan crear objetos
     */
    private Session() {
    }

    public static Object get(String key) {
        return datos.get(key);
    }

    public static void put(String key, Object value) {
        datos.put(key, value);
    }
}

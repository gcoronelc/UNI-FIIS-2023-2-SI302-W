package pe.edu.uni.educaapp.util;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Mensaje {

    private Mensaje() {
    }

    public static void info(Component padre, String mensaje) {
        JOptionPane.showMessageDialog(padre, mensaje, "EDUCA - INFORMACIÓN",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void error(Component padre, String mensaje) {
        JOptionPane.showMessageDialog(padre, mensaje, "EDUCA - ERROR",
                JOptionPane.ERROR_MESSAGE);
    }
}

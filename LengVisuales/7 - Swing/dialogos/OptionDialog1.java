package dialogos;

import javax.swing.*;

public class OptionDialog1 {
    
    public OptionDialog1() {
        Object[] opciones = { "Opción A", "Opción B", "Opción C" };
        int opcion = JOptionPane.showOptionDialog(null, 
                        "Seleccione una opción:",           // mensaje
                        "Opciones",                         // título
                        JOptionPane.YES_NO_OPTION,          // tipo de diálogo
                        JOptionPane.QUESTION_MESSAGE,       // tipo de mensaje
                        null,                               // icono
                        opciones,                           // arreglo de opciones
                        opciones[0]);                       // valor inicial
        
        if (opcion != JOptionPane.CLOSED_OPTION)
                JOptionPane.showMessageDialog(null, 
                        opciones[opcion],                   // mensaje
                        "Opción seleccionada",              // título
                        JOptionPane.INFORMATION_MESSAGE);   // tipo de mensaje
    }
    
    public static void main(String[] args) {
        new OptionDialog1();
        System.exit(0);
    }
}

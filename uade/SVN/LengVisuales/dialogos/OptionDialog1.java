package dialogos;

import javax.swing.*;

public class OptionDialog1 {
    
    public OptionDialog1() {
        Object[] opciones = { "Opci�n A", "Opci�n B", "Opci�n C" };
        int opcion = JOptionPane.showOptionDialog(null, 
                        "Seleccione una opci�n:",           // mensaje
                        "Opciones",                         // t�tulo
                        JOptionPane.YES_NO_OPTION,          // tipo de di�logo
                        JOptionPane.QUESTION_MESSAGE,       // tipo de mensaje
                        null,                               // icono
                        opciones,                           // arreglo de opciones
                        opciones[0]);                       // valor inicial
        
        if (opcion != JOptionPane.CLOSED_OPTION)
                JOptionPane.showMessageDialog(null, 
                        opciones[opcion],                   // mensaje
                        "Opci�n seleccionada",              // t�tulo
                        JOptionPane.INFORMATION_MESSAGE);   // tipo de mensaje
    }
    
    public static void main(String[] args) {
        new OptionDialog1();
        System.exit(0);
    }
}

package dialogos;

import javax.swing.*;

public class InputDialog2 {
    
    public InputDialog2() {
        Object[] opciones = { "Opci�n A", "Opci�n B", "Opci�n C" };
        Object opcion = JOptionPane.showInputDialog(null, 
                        "Seleccione una opci�n:",            // mensaje
                        "Lista de opciones",                // t�tulo
                        JOptionPane.PLAIN_MESSAGE,          // tipo de mensaje
                        null,                               // icono
                        opciones,                           // arreglo de opciones
                        opciones[0]);                       // valor inicial
        
        JOptionPane.showMessageDialog(null, 
                        opcion,                             // mensaje
                        "Opci�n seleccionada",              // t�tulo
                        JOptionPane.INFORMATION_MESSAGE);   // tipo de mensaje
    }
    
    public static void main(String[] args) {
        new InputDialog2();
        System.exit(0);
    }
}

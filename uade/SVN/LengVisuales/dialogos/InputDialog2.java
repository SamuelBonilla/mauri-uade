package dialogos;

import javax.swing.*;

public class InputDialog2 {
    
    public InputDialog2() {
        Object[] opciones = { "Opción A", "Opción B", "Opción C" };
        Object opcion = JOptionPane.showInputDialog(null, 
                        "Seleccione una opción:",            // mensaje
                        "Lista de opciones",                // título
                        JOptionPane.PLAIN_MESSAGE,          // tipo de mensaje
                        null,                               // icono
                        opciones,                           // arreglo de opciones
                        opciones[0]);                       // valor inicial
        
        JOptionPane.showMessageDialog(null, 
                        opcion,                             // mensaje
                        "Opción seleccionada",              // título
                        JOptionPane.INFORMATION_MESSAGE);   // tipo de mensaje
    }
    
    public static void main(String[] args) {
        new InputDialog2();
        System.exit(0);
    }
}

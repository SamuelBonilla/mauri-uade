package dialogos;

import javax.swing.*;

public class InputDialog1 {
    
    public InputDialog1() {
        String s = JOptionPane.showInputDialog(null, 
                              "Ingrese un valor",           // mensaje
                              "InputDialog",                // t�tulo
                              JOptionPane.PLAIN_MESSAGE);   // tipo de mensaje
        
        JOptionPane.showMessageDialog(null, 
                              s,                            // mensaje
                              "MessageDialog",              // t�tulo
                              JOptionPane.PLAIN_MESSAGE);   // tipo de mensaje
    }
    
    public static void main(String[] args) {
        new InputDialog1();
        System.exit(0);
    }
    
}
